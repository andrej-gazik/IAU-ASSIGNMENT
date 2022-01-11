package Controllers;


import Models.Ciphers;
import Models.RighRightCipher;
import Models.RightCipher;
import Models.RsaCipher;
import View.MainFrame;

public class MainFrameController {
	MainFrame view;
	
	public MainFrameController(MainFrame view){
        this.view = view;
    }
	
	public void startMainController() {
		
		this.view.getSend().addActionListener(e -> {
			
			int cipher_type = this.view.getType_of_cipher().getSelectedIndex();
			boolean cipher_rbtn = this.view.getCipher_button().isSelected();
			boolean decipher_rbtn = this.view.getDecipher_button().isSelected();
			
			String message = this.view.getInput().getText();
			
			if(cipher_rbtn) {
				if(cipher_type == 0) {
					Ciphers cipher = new Ciphers(new RightCipher());
					String ciphered = cipher.executeCipher(message);
				    this.view.getOutput().setText(ciphered);
				}
				else if(cipher_type == 1){
					Ciphers cipher = new Ciphers(new RighRightCipher());
					String ciphered = cipher.executeCipher(message);
				    this.view.getOutput().setText(ciphered);
				}
				else if(cipher_type == 2){
					RsaCipher rsacipher = RsaCipher.getInstance();
					rsacipher.ez();
					Ciphers cipher = new Ciphers(rsacipher);	
					String ciphered = cipher.executeCipher(message);
				    this.view.getOutput().setText(ciphered);
				}
			}
			else if (decipher_rbtn){
				if(cipher_type == 0) {
					Ciphers decipher = new Ciphers(new RightCipher());
				    String deciphered = decipher.executeDecipherCipher(message);
				    this.view.getOutput().setText(deciphered);
				}
				else if(cipher_type == 1){
					Ciphers decipher = new Ciphers(new RighRightCipher());
					String deciphered = decipher.executeDecipherCipher(message);
					this.view.getOutput().setText(deciphered);
				}
				else if(cipher_type == 2){
					RsaCipher rsacipher = RsaCipher.getInstance();
					Ciphers decipher = new Ciphers(rsacipher);
				    String deciphered = decipher.executeDecipherCipher(message);
				    this.view.getOutput().setText(deciphered);
				}
			}
		});
	}

}
