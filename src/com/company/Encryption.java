package com.company;

import java.util.Scanner;

class Encryption {
    private String plaintext;
    private String cyphertext = plaintext;
    private String key;
    Scanner myScanner;
    int shift;

    public void GetPlainText() {
        myScanner = new Scanner(System.in);
        System.out.println("Please enter your text to be encrypted: ");
        plaintext = myScanner.nextLine();
    }
    public void GetShiftValue()
    {
        myScanner = new Scanner(System.in);
        System.out.println("Please enter your shift value: ");
        shift = myScanner.nextInt();
    }

    public void GetCypherText() {
        myScanner = new Scanner(System.in);
        System.out.println("Please enter your text to be encrypted: ");
        plaintext = myScanner.nextLine();
    }


    public void Encrypt() {
        for (int i = 0; i < plaintext.length(); i++) {

            char letter = plaintext.charAt(i);
            char EncryptedLetter = EncryptCharacterNumber(letter);
            System.out.print(EncryptedLetter);
        }
    }

    public char EncryptCharacterNumber(char whichOne)
    {
        int ascii = (int) whichOne;
        int asciiencrypt = ascii + shift;
        while (asciiencrypt > 126)
        {
            asciiencrypt -= 94;
        }
        return (char) asciiencrypt;
    }
}


