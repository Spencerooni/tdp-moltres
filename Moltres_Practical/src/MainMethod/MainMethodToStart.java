package MainMethod;

import java.awt.EventQueue;

import System_Screens.EnterEmployeeDetails_Screen;

public class MainMethodToStart 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Runnable runnner = new Runnable() 
		{
			@Override
			public void run() 
			{
				// TODO Auto-generated method stub
				new EnterEmployeeDetails_Screen();

			}
		};
		EventQueue.invokeLater(runnner);

	}

}
