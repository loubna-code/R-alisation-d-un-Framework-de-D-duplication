package Matching;

interface SimilarityMeasure<T> {
    double calculate(T value1, T value2);
}
