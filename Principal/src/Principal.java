import java.util.Scanner;

// nombre de la clase
public class Principal {

	// metodo principal
	public static void main(String[] args) {

		System.out.println("Ingrese la palabra");
		// clase que captura datos por consola
		Scanner sc = new Scanner(System.in);
		String prueba = sc.next();
		//System.out.println("Hola mundo");
		System.out.println("La palabra ("+prueba.toUpperCase()+") tiene "+prueba.length()+" caracteres");
	}
}
