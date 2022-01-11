package View;

import Controllers.MainFrameController;


public class MainMenu {
	public static void main(String[] args){
		MainFrame myFrame = new MainFrame();
		MainFrameController controller = new MainFrameController(myFrame);
		
		myFrame.init();
		controller.startMainController();  
	}
}
