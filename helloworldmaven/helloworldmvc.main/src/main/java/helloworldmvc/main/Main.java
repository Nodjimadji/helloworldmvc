package helloworldmvc.main;

import helloworldmvc.model.first.DAOHelloworld;
import helloworldmvc.model.first.Model;
import helloworldmvc.view.second.View;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Model br = new Model();
		br.getHelloWorld();
		View re = new View();
		DAOHelloworld jb = new DAOHelloworld();
		//jb.toString();
		//re.displaysMessage("hello World");
	}

}
