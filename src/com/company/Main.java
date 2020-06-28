package com.company;

public class Main {

    public static void main(String[] args) {
        StringEncryptor strEnc = new StringEncryptor();
        System.out.println("Шифр Цезаря:");
        String cesarString = "СТРОКА ДЛЯ ШИФРА ЦЕЗАРЯ";
        String encryptedCesarString = strEnc.EncryptCesar(cesarString,5);
        System.out.println("Исходная строка: " + cesarString);
        System.out.println("Зашифрованная строка: " + encryptedCesarString);
        System.out.println("Расшифрованная строка: " + strEnc.DecryptCesar(encryptedCesarString,5));

        System.out.println("Шифр Вижeнера:");
        String vigenereString = "ЗАШИФРОВАТЬ СТРОКУ МЕТОДОМ ВИЖЕНЕРА";
        String keyword = "ЗАЩИТА";
        String encryptedVigenereString = strEnc.EncryptVigenere(vigenereString, keyword);
        System.out.println("Исходная строка: " + vigenereString);
        System.out.println("Зашифрованная строка: " + encryptedVigenereString);
        System.out.println("Расшифрованная строка: " + strEnc.DecryptVigenere(encryptedVigenereString, keyword));
    }
}
