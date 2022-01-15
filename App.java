package Week5Homework;

public class App {

	public static void main(String[] args) {
		
		//create object for each class
		Logger asterisk = new AsteriskLogger();
		
		Logger spaced= new SpacedLogger();
		
		//instantiate objects for each method of each class
		asterisk.Log("Hola");
		asterisk.Error("Hola");
		
		spaced.Log("Hola");
		spaced.Error("Hola");
		
	}

}
