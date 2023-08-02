
public class EmpleadoSalarioBase extends Empleado {
	private double salarioBase; 
	public EmpleadoSalarioBase(String nombre, String genero, String departamento, int horasTrabajadas,double salarioBase) {
		super(nombre, genero, departamento, horasTrabajadas);
		this.salarioBase=salarioBase;
		// TODO Auto-generated constructor stub
	}
	@Override 

	public double calcularSalario() {
		if (salarioBase <= 0) {
		throw new IllegalArgumentException("El salario debe ser mayor o igual a 0");
		}

		if (getHorasTrabajadas() < 0) {
		throw new IllegalArgumentException("Las horas trabajadas deben ser mayor o igual a 0");
		}

		double salarioTotal = salarioBase;

		// Horas trabajadas normales = 40;
		if (getHorasTrabajadas() > 40) {
		salarioTotal += (getHorasTrabajadas() - 40) * 50; // Pago de horas extra
		}

		switch (getDepartamento()) {
			case "Sistemas":
			salarioTotal += 20;
			break;
			case "Contabilidad":
			salarioTotal += 10;
			break;
			default:
			break;
		}

		return salarioTotal;
		}
	@Override
    public void imprimirDetalles() {
    	super.imprimirDetalles();
    	System.out.println("Sueldo : " + salarioBase);    	
    }

	
	

}
