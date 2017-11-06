public class ControleDeFluxo{
	
	public static void main (String[] args){
		
		/*if -  esle if  - else */
		int ano = 2017;
		
		if ( ano < 0 ){
			System.out.println( ano + " não é um ano!");
		} else if ( (ano%4==0 && ano%100!=0) || (ano%400==0) ) {
			System.out.println( ano + " é bissexto!");
		} else {
			System.out.println( ano + " não é Bissexto!");
		}
		
		
		
		/* while */	
		int x = 0;
		
		while ( x < 10 ) {
		
		System.out.println("item " + x);
		x++;	
			
		} 	
		
	}
	
}	

	
