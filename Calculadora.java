import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
	
	private static double num1;
	private static String repetir;
	private static int opcion;
	private static double total = 0;
	private static double num;

	public static void main(String[] args) {
		
		try {
			comenzarOperaciones();
		} catch (InputMismatchException e) {
			System.out.println("Has cometido un error al introducir los datos, saliendo de calculadora.");
		}
			
			
		
		

		

	}
	
	public static void comenzarOperaciones() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("*** BIENVENIDO A CALCULADORA ***\n");
		System.out.println("Introduce el primer número con el que quieres operar:");
		num1 = scanner.nextDouble(); scanner.nextLine();
		repetir = "S";
		total=num1;
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
		num = scanner.nextDouble(); scanner.nextLine();
		total += num;
		return total;
	}
	
	public static double restar(double total) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce el número a restar:");
		num = scanner.nextDouble(); scanner.nextLine();
		total -= num;
		return total;
	}
	
	
	public static double multiplicar(double total) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce el número a multiplicar:");
		num = scanner.nextDouble(); scanner.nextLine();
		total *= num;
		return total;
	}
	
	public static double dividir(double total) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce el número por el que dividir:");
		num = scanner.nextDouble(); scanner.nextLine();
		total /= num; 
		return total;
	}
	
	public double getNum1(){
		return num1;
	}
	
	public void setNum1(double num1){
		this.num1 = num1;
	}
	
	public String getRepetir(){
		return repetir;
	}
	
	public void setRepetir(String repetir){
		this.repetir = repetir;
	}
	
	public int getOpcion(){
		return opcion;
	}
	
	public void setOpcion(int opcion){
		this.opcion = opcion;
	}
	
	public double getTotal(){
		return total;
	}
	
	public void setTotal(double total){
		this.total = total;
	}
	
	public double getNum(){
		return num;
	}
	
	public void setNum(double num){
		this.num = num;
	}

}
