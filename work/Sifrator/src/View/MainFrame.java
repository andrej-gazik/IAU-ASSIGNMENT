package View;


import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class MainFrame extends JFrame {
	private JTextField input = new JTextField(30);
	private JLabel input_label = new JLabel("Text to send:   ");
	
	private JTextField output = new JTextField(30);
	private JLabel output_label = new JLabel("Received text: ");
	
	String[] ciphers = { "1xRight", "2xRight", "RSA"};
	private JComboBox<String> type_of_cipher = new JComboBox<String>(ciphers);
	
	private ButtonGroup choice = new ButtonGroup();
	private JRadioButton cipher_button = new JRadioButton("Cipher");
	private JRadioButton decipher_button = new JRadioButton("Decipher");
	
	private JButton send = new JButton("Send to server");
	
	public void init() {
		JPanel panel = new JPanel();
		output.setEditable(false);
		
		panel.add(input_label);
		panel.add(input);
		panel.add(output_label);
		panel.add(output);
		panel.add(type_of_cipher);
		panel.add(cipher_button);
		panel.add(decipher_button);
		
		choice.add(cipher_button);
		choice.add(decipher_button);
		
		panel.add(send);
		
		setTitle("Sifrator");
		setSize(450, 130);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		this.add(panel);

	}

	public JTextField getInput() {
		return input;
	}

	public void setInput(JTextField input) {
		this.input = input;
	}

	public JLabel getInput_label() {
		return input_label;
	}

	public void setInput_label(JLabel input_label) {
		this.input_label = input_label;
	}

	public JTextField getOutput() {
		return output;
	}

	public void setOutput(JTextField output) {
		this.output = output;
	}

	public JLabel getOutput_label() {
		return output_label;
	}

	public void setOutput_label(JLabel output_label) {
		this.output_label = output_label;
	}

	public String[] getCiphers() {
		return ciphers;
	}

	public void setCiphers(String[] ciphers) {
		this.ciphers = ciphers;
	}

	public JComboBox<String> getType_of_cipher() {
		return type_of_cipher;
	}

	public void setType_of_cipher(JComboBox<String> type_of_cipher) {
		this.type_of_cipher = type_of_cipher;
	}

	public ButtonGroup getChoice() {
		return choice;
	}

	public void setChoice(ButtonGroup choice) {
		this.choice = choice;
	}

	public JRadioButton getCipher_button() {
		return cipher_button;
	}

	public void setCipher_button(JRadioButton cipher_button) {
		this.cipher_button = cipher_button;
	}

	public JRadioButton getDecipher_button() {
		return decipher_button;
	}

	public void setDecipher_button(JRadioButton decipher_button) {
		this.decipher_button = decipher_button;
	}

	public JButton getSend() {
		return send;
	}

	public void setSend(JButton send) {
		this.send = send;
	}
	
}
