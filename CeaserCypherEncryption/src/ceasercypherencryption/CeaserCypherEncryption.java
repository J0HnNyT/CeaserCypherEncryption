/*
 *Ceaser Cypher Encryption Example for Basic Encrytion.
 */
package ceasercypherencryption;

/**
 *
 * @author johntaylor
 */
public class CeaserCypherEncryption {

    public static void main(String[] args) {
        String text = "Encrypt this message";
        Encryption encrypt = new Encryption(text, 9); // Change key value from 0-9.
        System.out.println(encrypt.getPlainText());
        
        String encrypted = encrypt.Encrypt();
        System.out.println(encrypt.Encrypt());
        
        Encryption decrypt = new Encryption(encrypted, 9);
        System.out.println(decrypt.Decrypt());
    }
    
}
