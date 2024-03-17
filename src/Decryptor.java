public class Decryptor {
    public String decryptMessage(String encryptedMessage, String key) {
        int keyInt = convertKeyToInt(key);
        StringBuilder decryptedMessage = new StringBuilder();

        for (int i = 0; i < encryptedMessage.length(); i++) {
            char encryptedChar = encryptedMessage.charAt(i);
            char decryptedChar = (char) (encryptedChar ^ keyInt);
            decryptedMessage.append(decryptedChar);
        }

        return decryptedMessage.toString();
    }

    private int convertKeyToInt(String key) {
        int keyInt = 0;
        for (int i = 0; i < key.length(); i++) {
            keyInt += key.charAt(i);
        }
        return keyInt;
    }
}