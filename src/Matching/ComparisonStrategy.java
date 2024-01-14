package Matching;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class ComparisonStrategy {
    private List<AttributeMatching<?>> attributeMatchings;
    private MatchingFunction matchingFunction;

    ComparisonStrategy(List<AttributeMatching<?>> attributeMatchings, MatchingFunction matchingFunction) {
        this.attributeMatchings = attributeMatchings;
        this.matchingFunction = matchingFunction;
    }

    List<Pair<Map<String, ?>, Map<String, ?>>> compareEntities(List<Map<String, ?>> records) {
        List<Pair<Map<String, ?>, Map<String, ?>>> duplicatePairs = new ArrayList<>();

        for (int i = 0; i < records.size(); i++) {
            for (int j = i + 1; j < records.size(); j++) {
                Map<String, ?> record1 = records.get(i);
                Map<String, ?> record2 = records.get(j);

                if (matchingFunction.match(record1, record2)) {
                    duplicatePairs.add(new Pair<>(record1, record2));
                }
            }
        }

        return duplicatePairs;
    }
}