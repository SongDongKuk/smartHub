package Question5;

public class GreetingProgram {
	Greeting gt = new Greeting();	
	

	public void setLanguage(Greeting gp) {
		gt = gp;
	}
	
	public void greet(String name) {
		gt.greet(name);
	}
}
