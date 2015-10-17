package is.ru.stringcalculator;

public class Calculator {

		public static int add(String text){

			if(text.equals(""))
			{
				return 0;
			}
			else if(text.length() == 1)
			{
				return toInt(text);
			}
			else if(text.substring(0,2).equals("//"))
			{
				String delimiter = ",|\n|" + text.charAt(2);
				return sum(text.substring(4, text.length()).split(delimiter));
			}
			else if(text.contains(",")|| text.contains("\n"))
			{
				return sum(splitNumbers(text));
			}
			else
				return 1;
		}

		private static int toInt(String number){
			return Integer.parseInt(number);
		}

		private static String[] splitNumbers(String numbers){
			String sign = ",|\n";
			return numbers.split(sign);
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
