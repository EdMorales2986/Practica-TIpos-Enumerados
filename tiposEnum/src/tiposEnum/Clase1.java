package tiposEnum;
import java.util.Scanner;


public class Clase1 {

	public static void main(String[] args) 
	{
		try (Scanner entrada = new Scanner(System.in)) 
		{
			System.out.println("Escribe el tipo de medicion a tomar: TIEMPO, LONGITUD, MASA, CORRIENTE, TEMPERATURA, SUSTANCIA, LUMINOSIDAD;");
			
			String entradaDatos = entrada.next().toUpperCase();
			
			Sistema_SI unidad = Enum.valueOf(Sistema_SI.class, entradaDatos);
			System.out.println("El sistema de unidades es: "+unidad.nomUNI);
			switch (unidad)
			{
			case TIEMPO: System.out.println("La abreviatura de la unidad es: s");
				break;
			case CORRIENTE: System.out.println("La abreviatura de la unidad es: A");
				break;
			case LONGITUD: System.out.println("La abreviatura de la unidad es: m");
				break;
			case LUMINOSIDAD: System.out.println("La abreviatura de la unidad es: cd");
				break;
			case MASA: System.out.println("La abreviatura de la unidad es: kg");
				break;
			case SUSTANCIA: System.out.println("La abreviatura de la unidad es: mol");
				break;
			case TEMPERATURA: System.out.println("La abreviatura de la unidad es: K");
				break;
			// default: System.out.println("## Opcion Invalida ##"); break; -- No surte efecto por lo que se puede ignorar
			}
		}
	}
	
	//Metodo Constructor
	enum Sistema_SI
	{
		TIEMPO("SEGUNDOS"), LONGITUD("METROS"), MASA("KILO GRAMOS"), CORRIENTE("AMPERIOS"), TEMPERATURA("KELVIN"), SUSTANCIA("MOLES"), LUMINOSIDAD("CANDELA");
		
		private Sistema_SI (String nomUNI)
		{
			this.nomUNI = nomUNI;
		}
		
		private String nomUNI;
	}
}
