package helloworldmvc.model.first;

public class DAOHelloworld {
	 private static String Filename = "HelloWorld.txt";
	 
	 private DAOHelloworld instance = null;
	 
	 private String helloWorldMessage = null;
	 
	 
	 private DAOHelloworld() {
		// TODO Auto-generated constructor stub
	}

	public DAOHelloworld getInstance() {
		return instance;
	}

	private void setInstance(DAOHelloworld instance) {
		this.instance = instance;
	}
	
	private void readFile() {
		
	}

	public String getHelloWorldMessage() {
		return helloWorldMessage;
	}

	public void setHelloWorldMessage(String helloWorldMessage) {
		this.helloWorldMessage = helloWorldMessage;
	}
}
