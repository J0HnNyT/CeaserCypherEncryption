
package ceasercypherencryption;

/**
 *
 * @author johntaylor
 */
public class Encryption {
    private String plainText;
    private int keyShift;
    private String cipher = "";
    
    Encryption(String text, int key){
        this.plainText = text;
        this.keyShift = key;
    }

    public String getPlainText() {
        return plainText;
    }

    public void setPlainText(String plainText) {
        this.plainText = plainText;
    }

    public int getKeyShift() {
        return keyShift;
    }

    public void setKeyShift(int Key) {
        
        if (Key > 26){
            Key = Key % 26;
        }
        else if(Key < 26){
            Key = (Key % 26) + 26;
        }
        
        this.keyShift = keyShift;
    }
    
    public String Encrypt(){
        
        String encCipher = cipher;
        
        int strLength = plainText.length();
        
        for (int i = 0; i < strLength; i++){
            char chr = plainText.charAt(i);
            if (Character.isLetter(chr)){
                if (Character.isLowerCase(chr)){
                    char cShifted = (char)(chr + keyShift);
                    if(cShifted > 'z'){
                        encCipher += (char)(chr - (26 - keyShift));
                    }
                    else encCipher += cShifted;
                }
                else if(Character.isUpperCase(chr)){
                                        char cShifted = (char)(chr + keyShift);
                    if(cShifted > 'Z'){
                        encCipher += (char)(chr - (26 - keyShift));
                    }
                    else encCipher += cShifted;
 
                }
            }else{
                encCipher += chr;
            }
        } 
        return encCipher;
    }//End getCipher
    
        public String Decrypt(){
            
            String deCipher = cipher;
        
        int strLength = plainText.length();
        
        for (int i = 0; i < strLength; i++){
            char chr = plainText.charAt(i);
            if (Character.isLetter(chr)){
                if (Character.isLowerCase(chr)){
                    char cShifted = (char)(chr - keyShift);
                    if(cShifted < 'a'){
                        deCipher += (char)(chr + (26 - keyShift));
                    }
                    else deCipher += cShifted;
                }
                else if(Character.isUpperCase(chr)){
                    char cShifted = (char)(chr - keyShift);
                    if(cShifted < 'A'){
                        deCipher += (char)(chr + (26 - keyShift));
                    }
                    else deCipher += cShifted;
 
                }
            }else{
                deCipher += chr;
            }
        } 
        return deCipher;
    }
    
    
}//End class.
