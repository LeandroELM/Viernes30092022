package metodos;

import java.util.Scanner;

public class IntroMetodos2V2 {

	public static void main(String[] args) {
		IntroMetodos2V2 obj = new IntroMetodos2V2();
		obj.calcularRaicesCuadraticas();//Llamada del metodo
		obj.calcularRaicesCuadraticas();
		//System.out.println(); //Empty
		//Math.sqrt(0); // Need an argument 
		//Math.pow(0, 0); // Needs two argument
		//Math.random(); //Empty 
	} //Main closure

 
	//Definicion del metodo
	private void calcularRaicesCuadraticas() {
		//El cuerpo del metodo
		
		Scanner lector = new Scanner(System.in);
		System.out.print("a = ");
		double a= lector.nextDouble();
		System.out.print("b = ");
		double b= lector.nextDouble();
		System.out.print("c = ");
		double c= lector.nextDouble();
		
		double discriminante = Math.pow(b, 2) - 4 * a * c;
		
		double x1 =  (-b + Math.sqrt(discriminante))/(2 * a);
		double x2 =  (-b - Math.sqrt(discriminante))/(2 * a);
		
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);
		
	}


}//Class closure
