package lambdaExp;

public class Example3 {

	
		interface StringFunction {
			  String run(String str);
			}

			
			  public static void main(String[] args) {
			    StringFunction exclaim = (s) -> s + "!";
			    StringFunction ask = (s) -> s + "?";
			    printFormatted("Hello", exclaim);
			    printFormatted("Hello", ask);
			  }
			  public static void printFormatted(String str, StringFunction format) {
			    String result = format.run(str);
			    System.out.println(result);
	}

}

