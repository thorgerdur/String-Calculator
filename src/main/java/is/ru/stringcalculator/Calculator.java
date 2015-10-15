package is.ru.stringcalculator;
/*import java.util.Arrays;
import java.util.stream.Stream;*/

public class Calculator {

		public static int add(String text){

	/*	String delimiter = ",|\n";*/

		if(text.equals("")){
			return 0;
		}
		/*if(text.startsWith("//"))
		{
			String [] number = text.split("\n",2);
			String delimiter = number[0].substring(2);
			text = number[1];
		}*/
		else if(text.contains(",")){
			return sum(splitNumbers(text));
		}
		else if(text.contains("\n")){
			return sum(splitNumbersLine(text));
		}
		else
			return 1;
	}

	private static int toInt(String number){
		return Integer.parseInt(number);
	}

	private static String[] splitNumbers(String numbers){
	    return numbers.split(",");
	}
	private static String[] splitNumbersLine(String numbers){
		return numbers.split("\n");
	}

  private static int sum(String[] numbers){
 	  int total = 0;
      for(String number : numbers){
				if(toInt(number)>1000)
				{
					continue;
				}
				total += toInt(number);
		}
		return total;
  }

}
