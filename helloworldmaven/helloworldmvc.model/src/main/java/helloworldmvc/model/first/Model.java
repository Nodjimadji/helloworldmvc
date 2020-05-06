package helloworldmvc.model.first;

import hello.IModel;


public class Model implements IModel{
	private DAOHelloworld doah;

	@Override
	public String getHelloWorld() {
	
		// TODO Auto-generated method stub
		return null;
	}

	public DAOHelloworld getDoah() {
		return doah;
	}

	public void setDoah(DAOHelloworld doah) {
		this.doah = doah;
	}

}
