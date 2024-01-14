package Matching;

class LevenshteinDistanceMeasure implements SimilarityMeasure<String> {
    @Override
    public double calculate(String value1, String value2) {
        // Implémentation spécifique pour la similarité des chaînes (Levenshtein)
        int[][] distanceMatrix = new int[value1.length() + 1][value2.length() + 1];

        for (int i = 0; i <= value1.length(); i++) {
            for (int j = 0; j <= value2.length(); j++) {
                if (i == 0) {
                    distanceMatrix[i][j] = j;
                } else if (j == 0) {
                    distanceMatrix[i][j] = i;
                } else {
                    int cost = (value1.charAt(i - 1) == value2.charAt(j - 1)) ? 0 : 1;
                    distanceMatrix[i][j] = Math.min(
                            Math.min(distanceMatrix[i - 1][j] + 1, distanceMatrix[i][j - 1] + 1),
                            distanceMatrix[i - 1][j - 1] + cost
                    );
                }
            }
        }

        return distanceMatrix[value1.length()][value2.length()];
    }
}