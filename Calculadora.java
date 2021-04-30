import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
	
	

	public static void main(String[] args) {
		
		try {
			comenzarOperaciones();
		} catch (InputMismatchException e) {
			System.out.println("No has introducido correctamente los datos, saliendo de calculadora.");
		}
			
			
		
		

		

	}
	
	public static void comenzarOperaciones() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("*** BIENVENIDO A CALCULADORA ***\n");
		System.out.println("Introduce el primer número con el que quieres operar:");
		double num1 = scanner.nextDouble(); scanner.nextLine();
		String repetir = "S";
		int opcion;
		double total=num1;
		while (repetir.equalsIgnoreCase("s")) {
			System.out.println("Elige qué operación quieres realizar: (1.-Suma || 2.-Resta || 3.-Multiplicación || 4.-División || 5.-No realizar operación)");
			opcion = scanner.nextInt(); scanner.nextLine();
			switch(opcion) {
				case 1:
					total = sumar(total);
					break;
				case 2:
					total = restar(total);
					break;
				case 3:
					total = multiplicar(total);
					break;
				case 4:
					total = dividir(total);
					break;
				default:
					System.out.println("No se ha escogido una operación correcta.");
					break;
			}
			
			System.out.println("\n***El resultado actual es: " + total + "***\n");
			System.out.println("¿Quieres realizar otra operación? (S.- Sí || N.- No)");
			repetir = scanner.nextLine();
			if (!repetir.equalsIgnoreCase("S")) {
				System.out.println("Saliendo del programa");
			}

			
		}
		
		
		
	}
	
	
	
	
	public static double sumar(double total) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce el sumando:");
		double num = scanner.nextDouble(); scanner.nextLine();
		total += num;
		return total;
	}
	
	public static double restar(double total) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce el número a restar:");
		double num = scanner.nextDouble(); scanner.nextLine();
		total -= num;
		return total;
	}
	
	
	public static double multiplicar(double total) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce el número a multiplicar:");
		double num = scanner.nextDouble(); scanner.nextLine();
		total *= num;
		return total;
	}
	
	public static double dividir(double total) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce el número por el que dividir:");
		double num = scanner.nextDouble(); scanner.nextLine();
		total /= num; 
		return total;
	}

}