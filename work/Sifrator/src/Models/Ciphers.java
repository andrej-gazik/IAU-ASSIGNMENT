package Models;

public class Ciphers {
	private CipherStrategy type_of_cipher;
	
	public Ciphers(CipherStrategy type_of_cipher) {
		this.type_of_cipher = type_of_cipher;
	}
	
	public String executeCipher(String cipher){
		return type_of_cipher.doCipher(cipher);
	}
	
	public String executeDecipherCipher(String cipher){
		return type_of_cipher.doDecipherCipher(cipher);
	}
}
