package empleadoHashSet;

public class Empleado
{
	private String nombre;
	private double sueldo;
	public Empleado(String nombre, double sueldo)
	{
		this.nombre = nombre;
		this.sueldo = sueldo;
	}
	public String getNombre()
	{
		return nombre;
	}
	public double getSueldo()
	{
		return sueldo;
	}
	@Override
	public boolean equals(Object obj)
	{
		return nombre.equals(((Empleado)obj).getNombre()) && sueldo == ((Empleado)obj).getSueldo();	
	}
	@Override
	public int hashCode()
	{
		int hash = 7;
		return 97 * hash + (int)this.sueldo;
	}
}
