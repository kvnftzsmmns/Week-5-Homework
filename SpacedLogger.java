package Week5Homework;

public class SpacedLogger implements Logger {
	
	public void Spacedlogger() {
		
	}

	@Override
	public void Log(String logString) {
		
		//loop to add spaces inbetween string
		for (int i = 0; i < logString.length(); i ++) {
			System.out.print(logString.charAt(i) + " ");
		}
	}


	@Override
	public void Error(String errorString) {
		
		//first part of error message
		System.out.print("\n\nERROR: ");
		
		//loop to add spaces inbetween string
		for (int i = 0; i < errorString.length(); i ++) {
			System.out.print(errorString.charAt(i) + " ");
		}
		
	}

}
	
