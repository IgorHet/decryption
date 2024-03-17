public class DecryptApp {
    public static void main(String[] args) {
        String message = "-$''$<k<#\"?.k9*))\"?";
        String key = "%&";

        Decryptor decryptor = new Decryptor();
        String decryptedMessage = decryptor.decryptMessage(message, key);

        System.out.println("Розшифроване повідомлення: " + decryptedMessage);
    }
}