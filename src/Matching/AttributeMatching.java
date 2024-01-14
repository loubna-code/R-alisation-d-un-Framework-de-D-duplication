package Matching;

class AttributeMatching<T> {
    private String attributeName;
    private SimilarityMeasure<T> similarityMeasure;

    AttributeMatching(String attributeName, SimilarityMeasure<T> similarityMeasure) {
        this.attributeName = attributeName;
        this.similarityMeasure = similarityMeasure;
    }

    boolean calculateSimilarity(Object value1, Object value2, double threshold) {
        double similarity = similarityMeasure.calculate((T)value1, (T)value2);
        return similarity >= threshold;
    }

    String getAttributeName() {
        return attributeName;
    }
}