import java.util.Scanner;

class Encryption
{
    private String plaintext;
    private String cyphertext;
    private String key;
    Scanner myScanner;
}

    public void GetPlainText()
    {
        myScanner = new Scanner(System.in);
        System.out.println("Please enter your text to be encrypted: ");
        plaintext = myScanner.nextLine();
    }

    public String GetCypherText()
    {
        myScanner = new Scanner(System.in);
        System.out.println("Please enter your text to be encrypted: ");
        plaintext = myScanner.nextLine();
    }

    public void Encrypt()
    {

    }


