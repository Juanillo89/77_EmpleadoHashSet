package empleadoHashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{
		HashSet<Empleado> hs = new HashSet<Empleado>();
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		String aux;
		double aux2;
		do{
			Main.mostrarMenu();
			System.out.println("Introduzca la opcion deseada: ");
			opcion = Integer.parseInt(sc.nextLine());
			switch (opcion)
			{
				case 1:
					System.out.print("Escriba el nombre del empleado: ");
					aux = sc.nextLine();
					System.out.print("Escriba la edad del empleado: ");
					aux2 = Double.parseDouble(sc.nextLine());
					Empleado empleado = new Empleado(aux, aux2);
					if(hs.add(empleado))
					{
						System.out.println("el empleado se ha añadido correctamente");
					}
					else
						System.out.println("el empleado no se ha añadido correctamente (repetido)");
				break;

				case 2:
					if(hs.size() == 0)
					{
						System.out.println("no hay elementos que listar");
					}
					else
					{
						System.out.println("listado de empleados: ");
						Iterator<Empleado> iterator = hs.iterator();
						while(iterator.hasNext())
						{
							System.out.println(iterator.next().getNombre());
						}
					}

				break;

				case 3:
					System.out.print("Introduzca el nombre del empleado que desea eliminar: ");
					aux = sc.nextLine();
					System.out.print("Escriba la edad del empleado: ");
					aux2 = Double.parseDouble(sc.nextLine());
					empleado = new Empleado(aux, aux2);
					if(hs.remove(empleado))
					{
						System.out.println("el empleado se ha borrado");
					}
					else
						System.out.println("no se encuentra el empleado que desea borrar");
				break;
				case 4:

					hs.clear();
					System.out.println("se han eliminado todos los empleados.");

				break;
				case 5:
					System.out.println("el tamaño es: " + hs.size());
				break;
				case 6:

					System.out.print("Introduzca el nombre del empleado que desea buscar: ");
					aux = sc.nextLine();
					System.out.print("Escriba la edad del empleado: ");
					aux2 = Double.parseDouble(sc.nextLine());
					empleado = new Empleado(aux, aux2);
					if(hs.contains(empleado))
					{
						System.out.println("el empleado " + empleado.getNombre() + " se ha encontrado satisfatoriamente");
					}
					else
						System.out.println("el empleado "+ empleado.getNombre() +" no se ha encuentra almacenado");

				break;
				case 7:
					System.out.println("Ha salido del programa.");
				break;

				default:
					System.out.println("Introduzca una opcion correcta.");
				break;
			}

		}while(opcion != 7);
		sc.close();
	}
	
	private static void mostrarMenu()
	{
		System.out.println("Menú:\n" +
			"1.-Introducir empleado.\n" +
			"2.-Listar empleado.\n" +
			"3.-Eliminar empleado.\n" +
			"4.-Borrar todos.\n" +
			"5.-Mostrar número de empleados.\n" +
			"6.-Buscar empleado.\n" +
			"7.-Salir.\n");
	}

}
