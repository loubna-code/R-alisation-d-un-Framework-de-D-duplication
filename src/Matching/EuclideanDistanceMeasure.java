package Matching;

class EuclideanDistanceMeasure implements SimilarityMeasure<Double> {
    @Override
    public double calculate(Double value1, Double value2) {
        return Math.abs(value1 - value2);
    }
}
