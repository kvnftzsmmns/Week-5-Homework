package Week5Homework;

public class AsteriskLogger implements Logger {

		@Override
		public void Log(String logString) {
			// TODO Auto-generated method stub
			System.out.println("***" + logString + "***\n" );
		}

		@Override
		public void Error(String errorString) {
			//put message and string into new string
			String result = ("***Error: " + errorString + "***");
			
			//top line
			//find length of result string and print matching # asterisks
			for (int i = 0; i < result.length(); i++) {
				System.out.print("*");
			}
			
			//print middle line of box with "***Error: message***"
			System.out.println("\n\n" + result + "\n");
			
			//bottom line
			//find length of result string and print matching # asterisks
			for (int i = 0; i < result.length(); i++) {
				System.out.print("*");
			}
			
			//space
			System.out.print("\n\n");
			
		}
}
