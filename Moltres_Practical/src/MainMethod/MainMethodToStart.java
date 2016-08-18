package MainMethod;

import java.awt.EventQueue;

import System_Screens.EnterEmployeeDetails_Screen;
import System_Screens.Home_Screen;

public class MainMethodToStart 
{

	public static void main(String[] args) 
	{
		Runnable runnner = new Runnable() 
		{
			@Override
			public void run() 
			{
				new Home_Screen();
			}
		};
		EventQueue.invokeLater(runnner);

	}

}
