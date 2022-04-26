package config;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class OtherMethods {
	
	public String clickboardData() throws UnsupportedFlavorException, IOException {
		
		  Toolkit toolkit = Toolkit.getDefaultToolkit();
		  Clipboard clipboard = toolkit.getSystemClipboard();
		  String   clickboardData = (String) clipboard.getData(DataFlavor.stringFlavor);
		  if (clickboardData !=null)
		  {
			  System.out.println("The email adress is "+clickboardData);
		  }
		  else {
			  System.out.println("There is no email copied");
		  }
		return clickboardData;
		
	}

}
