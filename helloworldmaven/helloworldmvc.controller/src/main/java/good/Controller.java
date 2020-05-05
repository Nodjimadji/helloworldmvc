package good;

import hello.IModel;
import hello.IView;

public class Controller {
	private final IView view;
	private final IModel model;
	
	public Controller(final IView view, final IModel model) {
		
		this.view = view;
		this.model = model;
		// TODO Auto-generated constructor stub
	}
	public void run() {
		this.view.displaysMessage(this.model.getHelloWorld());
	}
}
