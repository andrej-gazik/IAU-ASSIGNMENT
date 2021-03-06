package Models;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PublicKey;
import java.util.Base64;
import java.security.PrivateKey;

import javax.crypto.Cipher;

public class RsaCipher implements CipherStrategy{
	
	private PublicKey public_key;
	private PrivateKey private_key;
	
	private static RsaCipher instance = new RsaCipher();
	
	private RsaCipher(){};
	
	public static RsaCipher getInstance(){
	     return instance;
	}
	
	public void ez() {
		try {
			KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
			keyGen.initialize(1024);
			KeyPair pair = keyGen.generateKeyPair();
			private_key = pair.getPrivate();
			public_key = pair.getPublic();
		} catch(Exception ignored) {
		}
	}
	
	@Override
	public String doCipher(String a){
		try {
			byte[] message_to_bytes = a.getBytes();
			Cipher cipher = Cipher.getInstance("RSA");
			cipher.init(Cipher.ENCRYPT_MODE, public_key);
			byte[] enrcypted_message = cipher.doFinal(message_to_bytes);	
			return encode(enrcypted_message);
		} catch(Exception ignored) {	
		}
		return null;
	}
	
	private String encode(byte[] message) {
		return Base64.getEncoder().encodeToString(message);
	}
	
	@Override
	public String doDecipherCipher(String a){
		try {
			byte[] message_to_decipher = decode(a);
			Cipher cipher = Cipher.getInstance("RSA");
			cipher.init(Cipher.DECRYPT_MODE, private_key);
			byte[] deciphered_message = cipher.doFinal(message_to_decipher);
			return new String(deciphered_message, "UTF8");
		} catch(Exception ignored) {	
		}
		return null;
	}
	
	private byte[] decode(String message) {
		return Base64.getDecoder().decode(message);
	}
	
}
