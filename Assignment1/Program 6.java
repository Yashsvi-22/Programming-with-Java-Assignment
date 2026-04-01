abstract class Cipher {

    String text;
    int key;

    Cipher(String text, int key) {
        this.text = text;
        this.key = key;
    }

    abstract String encrypt();
    abstract String decrypt();
}

class CaesarCipher extends Cipher {
    CaesarCipher(String text, int key) {
        super(text, key);
    }

    @Override
    String encrypt() {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            ch = (char)(ch + key);
            result += ch;
        }

        return result;
    }

    @Override
    String decrypt() {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            ch = (char)(ch - key);
            result += ch;
        }

        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        CaesarCipher obj = new CaesarCipher("HELLO", 3);
        String encrypted = obj.encrypt();
        System.out.println("Encrypted Text: " + encrypted);
        String decrypted = obj.decrypt();
        System.out.println("Decrypted Text: " + decrypted);
    }
}
