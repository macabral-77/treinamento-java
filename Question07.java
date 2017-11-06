public class Question07 {
	
	public static void main(String[] args){
		double fahrenheit = 100; //Double.parseDouble(args[1]);
		double celsius;	
		
		celsius = ((fahrenheit - 32) * 5 ) / 9;
		System.out.println(fahrenheit + " Farenheit é igual a: " + celsius + " Celsius");
	}
}
