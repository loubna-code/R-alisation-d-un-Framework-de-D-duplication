package Matching;

import java.util.List;
import java.util.Map;

class MatchingFunction {
    private List<AttributeMatching<?>> attributeMatchings;
    private double threshold;

    MatchingFunction(List<AttributeMatching<?>> attributeMatchings, double threshold) {
        this.attributeMatchings = attributeMatchings;
        this.threshold = threshold;
    }

    boolean match(Map<String, ?> record1, Map<String, ?> record2) {
        boolean result = true; // Initialize to true

        for (AttributeMatching<?> attributeMatching : attributeMatchings) {
            String attributeName = attributeMatching.getAttributeName();

            if (record1.containsKey(attributeName) && record2.containsKey(attributeName)) {
                Object value1 = record1.get(attributeName);
                Object value2 = record2.get(attributeName);

                result &= attributeMatching.calculateSimilarity(value1, value2, threshold);

                if (!result) {
                    break; // Break out of the loop if any attribute doesn't match
                }
            }
        }

        return result;
    }
}
