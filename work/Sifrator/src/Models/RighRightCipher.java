package Models;

public class RighRightCipher implements CipherStrategy{

	@Override
	public String doCipher(String message) {
		
		String ciphered_text = "";
	    int text_length = message.length();
	    for(int i = 0; i < text_length; i++){
	    	
	        char c = (char)(message.charAt(i) + 2);
	        if (c > 255)
	        	ciphered_text += (char)(message.charAt(i) - (255-1));
	        else
	        	ciphered_text += c;
	    }
	    
	    return ciphered_text;
	    
	}
	
	@Override
	public String doDecipherCipher(String message) {
		
		String ciphered_text = "";
	    int text_length = message.length();
	    for(int i = 0; i < text_length; i++){
	    	
	        char c = (char)(message.charAt(i) - 2);
	        if (c < 0)
	        	ciphered_text += (char)(message.charAt(i) + (255-1));
	        else
	        	ciphered_text += c;
	    }
	    
	    return ciphered_text;
	    
	}

}
