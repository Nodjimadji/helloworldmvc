package helloworldmvc.model.first;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class DAOHelloworld {
	 private static String Filename = "HelloWorld.txt";
	 
	 private DAOHelloworld instance = null;
	 
	 private String helloWorldMessage = null;
	 
	 
	 public DAOHelloworld() throws Exception {
		// TODO Auto-generated constructor stub
		 readFile();
	}
	 @Override
	public String toString() {
		 try {
			readFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return super.toString();
	}

	public DAOHelloworld getInstance() {
		return instance;
	}

	private void setInstance(DAOHelloworld instance) {
		this.instance = instance;
	}
	
	private void readFile() throws IOException {
		
		try {
			BufferedReader read = new BufferedReader(new InputStreamReader(new FileInputStream(Filename), "UTF-8"));
			String line = read.readLine();
			read.close();
			System.out.println(line);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public String getHelloWorldMessage() {
		return helloWorldMessage;
	}

	public void setHelloWorldMessage(String helloWorldMessage) {
		this.helloWorldMessage = helloWorldMessage;
	}
}
