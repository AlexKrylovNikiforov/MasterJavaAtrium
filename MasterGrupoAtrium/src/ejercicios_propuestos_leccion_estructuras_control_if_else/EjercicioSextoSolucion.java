package ejercicios_propuestos_leccion_estructuras_control_if_else;

public class EjercicioSextoSolucion {
	
	private static float getSalaryIncrease(Empleado empleado) {
		float result = empleado.salary < 15000 ? 0.15F : 0.12F;
		
		if(empleado.isWoman && empleado.children == 0) {
			result += 0.02F; 
		}
		else if (empleado.isWoman && empleado.children > 0) {
			result += 0.02 + (0.01F * empleado.children);
		}
		
		return result;
	}

	public static void main(String[] args) {
		Empleado empleado1 = new Empleado (13700, false, 2);
		Empleado empleado2 = new Empleado (16300, true, 2);
		
		System.out.println("El aumento de salario será " + getSalaryIncrease(empleado1));
		System.out.println("El aumento de salario será " + getSalaryIncrease(empleado2));

	}

}

class Empleado {
	
	public final float salary;
	public final boolean isWoman;
	public final int children;
	
	public Empleado (float salary, boolean isWoman, int children) {
		this.salary = salary;
		this.isWoman = isWoman;
		this.children = children;
	}
	
}
