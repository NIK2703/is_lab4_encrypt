package com.company;

public class StringEncryptor {
    static boolean vigenereDebug = true;
    final static int alphabetLength = 'Я' - 'А' + 1;

    public String EncryptCesar (String string, int shift) {
        StringBuilder encryptStr = new StringBuilder();
        for(char c : string.toCharArray()) {
            if (c != ' ') {
                encryptStr.append((char)((int)c + shift));
            }
            else {
                encryptStr.append(c);
            }
        }
        return encryptStr.toString();
    }

    public String DecryptCesar (String string, int shift) {
        return EncryptCesar(string, -shift);
    }

    public String EncryptVigenere (String string, String keyword) {
        StringBuilder encryptStr = new StringBuilder();
        for(int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ' ') {
                encryptStr.append((char) ('А' + (string.charAt(i) + keyword.charAt(i % keyword.length())) % alphabetLength));
            }
            else {
                encryptStr.append(string.charAt(i));
            }
        }
        return encryptStr.toString();
    }

    public String DecryptVigenere (String string, String keyword) {
        StringBuilder decryptStr = new StringBuilder();
        for(int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ' ') {
                decryptStr.append((char)('А' + (string.charAt(i) + alphabetLength - keyword.charAt(i % keyword.length())) % alphabetLength));
            }
            else {
                decryptStr.append(string.charAt(i));
            }
        }
        return decryptStr.toString();
    }
}
