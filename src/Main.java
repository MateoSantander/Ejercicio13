
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		Trabajador t1= new Trabajador("Mortadelo", 1000, 8);
		Trabajador t2= new Trabajador("Filemon", 800, 4);
		Trabajador t3= new Trabajador("Ofelia", 900, 10);
		
		Jefe j1= new Jefe("Bacterio", 1500, 200);
		Jefe j2= new Jefe("Rompetechos", 1300, 100);
		
		ArrayList<Empleado> listaEmpleados1= new ArrayList<>();
		listaEmpleados1.add(t1);
		listaEmpleados1.add(t2);
		listaEmpleados1.add(j1);
		listaEmpleados1.add(j2);
		
		Directivo d1= new Directivo("Jefe de la TIA", 4000, listaEmpleados1);

		ArrayList<Empleado> listaEmpleados= new ArrayList<>();
		listaEmpleados.add(t1);
		listaEmpleados.add(t2);
		listaEmpleados.add(t3);
		listaEmpleados.add(j1);
		listaEmpleados.add(j2);
		listaEmpleados.add(d1);
	
		for(Empleado empleado : listaEmpleados){
			empleado.calcularSueldo();
			System.out.println("Sueldo de " + empleado.getNombre()+ ": " + empleado.getSueldo()+ "€");
			if(empleado instanceof Directivo) {
				System.out.println(" Trabajadores a sus pies:");
				for(Empleado subempleado : ((Directivo) empleado).getListaEmpleados()) {
					System.out.println(subempleado.getNombre());
				}
			}
			System.out.println(" ");
		}	
	}
}