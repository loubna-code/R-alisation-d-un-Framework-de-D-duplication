
// Classe concrète implémentant la stratégie de blocage manuelle

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

public class ManualBlockingStrategy implements BlockingStrategyInterface{

    private List<String> selectedAttributes;

    // Constructeur prenant la liste des attributs sélectionnés
    public ManualBlockingStrategy(List<String> selectedAttributes) {
        this.selectedAttributes = selectedAttributes;
    }

    @Override
    public void performBlocking(Data data) {
        // Pour chaque profil dans le DataSet
        for (Profile profile : data.getProfiles()) {
            // Sélectionner les attributs les plus informatifs pour former la clé de blocage
            String blockingKey = selectInformativeAttributes(profile);

            // Placer le profil dans le bloc correspondant à sa clé de blocage
            data.addToBlock(blockingKey, profile);
        }
    }

    // Méthode pour sélectionner les attributs les plus informatifs et former la clé de blocage
    private String selectInformativeAttributes(Profile profile) {
        // Concaténer les valeurs des attributs sélectionnés
        StringBuilder concatenatedValues = new StringBuilder();
        for (String attribute : selectedAttributes) {
            concatenatedValues.append(profile.getAttributeValue(attribute));
        }

        // Appliquer le hachage SHA-256 à la concaténation des valeurs
        return hashSHA256(concatenatedValues.toString());
    }

    // Méthode pour effectuer le hachage SHA-256
    private String hashSHA256(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = md.digest(input.getBytes());

            // Convertir les bytes en format hexadécimal
            StringBuilder hexHash = new StringBuilder();
            for (byte b : hashBytes) {
                hexHash.append(String.format("%02x", b));
            }

            return hexHash.toString();
        } catch (NoSuchAlgorithmException e) {
            // Gérer l'exception (typiquement en journalisant l'erreur)
            e.printStackTrace();
            return null;
        }
    }
}