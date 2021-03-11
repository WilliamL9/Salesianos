import java.util.Scanner;

public class VentasCarro {
	/*Una compañia de carro usados, paga a su personal un salario de 1000 mensuales
	 * mas una comision de 150 por carro vendido, mas el 5% del valor de la veenta por carro. cada mes el capturista de
	 * la empresa ingresa los datos pertinente a la computadora, calcule  el salario mensual del un vendedor dado
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		final int salario = 1000;
		int carroVendido;
		float costeCarro;
		
		System.out.println("Cuantos carros has vendido");
		carroVendido = entrada.nextInt();
		System.out.println("Digite el coste del carro");
		costeCarro = entrada.nextFloat();
		
		float salarioTotal = salario + (carroVendido*150) + (0.05f*costeCarro*carroVendido);
		System.out.println("El salario del empleado es " + salarioTotal + " $"); 
		
		
	
		
		

	}

}

