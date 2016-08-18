package System_Screens;

import javax.swing.SwingUtilities;

public class Home_Screen {

	public static void main(String[]args){
		//running on a thread
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new EnterEmployeeDetails_Screen();
			}
		});
	}
}
