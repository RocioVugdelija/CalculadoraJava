package numeros;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a=0, b=0;
		double res=0;
		String sel=null;
		
		Scanner tecl=new Scanner(System.in);
		
		System.out.println("Seleccione la opci�n");
		System.out.println("+: Suma"
				+"\n-: Resta"
				+"\n*: Multiplicaci�n"
				+"\n/: Divisi�n");
		sel=tecl.next();
		
		switch(sel){
			case "+":
				System.out.println("Ha seleccionado Suma\n");
				System.out.println("Ingrese el primer n�mero:");
				a=tecl.nextInt();
				System.out.println("Ingrese el segundo n�mero:");
				b=tecl.nextInt();
				res=a+b;
				System.out.println(a+"+"+ b+"="+res);
				break;
			case "-":
				System.out.println("Ha seleccionado Resta\n");
				System.out.println("Ingrese el primer n�mero:");
				a=tecl.nextInt();
				System.out.println("Ingrese el segundo n�mero:");
				b=tecl.nextInt();
				res=a-b;
				System.out.println(a+"-"+ b+"="+res);
				break;
			case "*":
				System.out.println("Ha seleccionado Multiplicaci�n \n");
				System.out.println("Ingrese el primer n�mero:");
				a=tecl.nextInt();
				System.out.println("Ingrese el segundo n�mero:");
				b=tecl.nextInt();
				res=a*b;
				System.out.println(a+"x"+ b+"="+res);
				break;
			case "/":
				System.out.println("Ha seleccionado Division \n");
				System.out.println("Ingrese el primer n�mero:");
				a=tecl.nextInt();
				System.out.println("Ingrese el segundo n�mero:");
				b=tecl.nextInt();
				res= (a/b);
				System.out.println(a+"/"+ b+"="+res);
				break;
			default:
				System.out.println("Esa opci�n no existe:");}
		
				
		
		
		
		
		

	}

}
