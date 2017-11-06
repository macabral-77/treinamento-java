public class TiposPrimitivos {
	
	public static void main (String[] args) {
	
	boolean bo;
	char c;
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	
	/*
	  Atribuimos o valor 65 à variavel c, que é do tipo char.
	  O tipo char tb é um inteiro, no entanto faz referência a
	  tabela Unicode
	*/
	
	c = 65;
	System.out.println("==============================");
	System.out.println("char");
	System.out.println("==============================");
	System.out.println("valor de c como char = " + c);
	System.out.println("valor de c como número = " + (int)c);
	System.out.println("==============================");
	
	
	/*
	  Atribuimos o valor 10 à variavel b, que é do tipo byte.
	  Como esse valor "cabe" em um short e em um int, não há problema
	  nenhum - Casting Implícito
	*/
	
	b = 10;
	s = b;
	i = s;
	System.out.println("==============================");
	System.out.println("inteiros");
	System.out.println("==============================");
	System.out.println("i = s = b = " + i);
	
	
	/*
	  Multiplica i por 100, e atribui o resultado ao próprio i
	*/
	i *= 100;
	System.out.println("novo valor de i = " + i);
	
	
	/*
	  Converte int para byte: preciso fazer um Casting Explícito
	  O que ocorre é que ao invés do Java lançar uma exceção, ele
	  retira a parte binária do int, e deixa apenas a do byte
	*/
	b = (byte)i;
	System.out.println("------------------------------");
	System.out.println("novo valor de b = " + b);
	
	
	/*
	  Converte int para long: sem problemas pois um long é o dobro de 
	  um int
	*/
	l = i;
	System.out.println("------------------------------");
	System.out.println("valor de l = " + l);
	
	
	System.out.println("==============================");
	System.out.println("==============================");
	System.out.println("ponto flutuante");
	System.out.println("==============================");
	System.out.println("double");
	System.out.println("==============================");
	
	d = 125.32;
	System.out.println("valor de d = " + d);
	d = 125.32d;
	System.out.println("valor de d = " + d);
	d = 125.32f;
	System.out.println("valor de d = " + d);
	/*
	  1o. caso: atribuimos 125.32 à variável d, sem problemas.
	  Obs: Para o Java, o tipo padrão de um literal com ponto flutuante é double.
	  2o. caso: atribuimos 125.32d à variável d, indica que é um double - 64 bits, 53 dígitos de precisão.
	  3o. caso: atribuimos 125.32f à variável d, indica que é um float - 32 bits, 24 dígitos de precisão.
	 */
	
	System.out.println("==============================");
	System.out.println("float");
	System.out.println("==============================");
	
	f = (float)125.32;
	System.out.println("valor de f = " + d);
	f = 125.32f;
	System.out.println("valor de f = " + d);
	f = (float)125.32d;
	System.out.println("valor de f = " + d);
	/*
	  1o. caso: atribuimos 125.32f à variável f, necessário fazer casting.
	  Obs: Para o Java, o tipo padrão de um literal com ponto flutuante é double.
	  2o. caso: atribuimos 125.32f à variável f, sem problemas.
	  3o. caso: atribuimos 125.32d à variável f, indica que é um double - necessário fazer casting.
	 */
	 
	 
	System.out.println("==============================");
	System.out.println("boolean");
	System.out.println("==============================");
	
	bo = true;
	System.out.println("valor de bo = " + bo);
	bo = (1 > 2);
	System.out.println("valor de bo = " + bo);
	bo = (f == d);
	System.out.println("valor de bo = " + bo);
	System.out.println("------------------------------");
	/*
	  1o. caso: atribuimos o valor true à variável bo, sem problemas.
	  2o. caso: 1 não é maior que 2, ou seja, false.
	  3o. caso: testamos se f é igual a d - operador de teste de igualdade é ==.
	 */
	 
	 
	System.out.println("==============================");
	System.out.println("conversões implícitas: sem perda de informação");
	System.out.println("==============================");
	System.out.println("byte  -->  short, int, long, float ou double");
	System.out.println("short  -->  int, long, float ou double");
	System.out.println("char  -->  int, long, float ou double");
	System.out.println("int  -->  long, float ou double");
	System.out.println("long  -->  float ou double");
	System.out.println("float  -->  double");
	System.out.println("==============================");
	System.out.println("casting - conversões explícitas: permitido em todos os tipos (exceto boolean)");
	System.out.println("ficar ciente que poderá haver perda de bits!");
	System.out.println("==============================");
	
	}
}
