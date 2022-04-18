
import java.util.ArrayList;

public class Directivo extends Empleado {
	
	private ArrayList<Empleado> listaEmpleados;
	
	public Directivo(String nombre, int sueldoBase, ArrayList<Empleado> listaEmpleados) {
		super(nombre, sueldoBase);
		this.listaEmpleados=listaEmpleados;
	}

	public ArrayList<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}
	public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}
	
	@Override
	public void calcularSueldo() {
		this.sueldo+= this.listaEmpleados.size() * 100;
	}
}