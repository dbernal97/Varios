package desparche;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Juego de adivinar el numero generado aleatoriamente
 * por el computador
 * 
 * 
 * @author Daniel Bernal
 *
 */

public class Adivina {

	/**
	 * Main 
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException 
	{
		int primero = 0;
		int segundo = 99;
		int num = 0;
		String palabra = "";
		boolean fin = false;
		boolean encontrado = false;
		
		int numero = (int) Math.floor(Math.random()*(primero-segundo+1)+segundo);
		
		System.out.println("Adivina el numero entre: " + primero + " y " + segundo
				+ "\n" + "Tienes 7 intentos");
		
		while(fin == false && num < 7)
		{
			System.out.println("\n" + "Ingresa numero: ");
			BufferedReader obtener = new BufferedReader(new InputStreamReader(System.in));
			palabra = obtener.readLine();
			int adivina = Integer.parseInt(palabra);
			
			if(adivina == numero)
			{
				System.out.println("Lo encontraste!!");
				fin = true;
				encontrado = true;
			}
			else
			{
				if(adivina < numero)
				{
					System.out.println("Vuelve a intentarlo con un numero mas grande");
					num+=1;
				}
				else if(adivina > numero)
				{
					System.out.println("Vuelve a intentarlo con un numero mas peque�o");
					num+=1;
				}
			}
		}
		if(encontrado == false)
		{
			System.out.println("Mas suerte para la proxima!");
		}
	}

}
