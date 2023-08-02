
public class EmpleadoSalarioBase extends Empleado {
	private double salarioBase; 
	public EmpleadoSalarioBase(String nombre, String genero, String departamento, int horasTrabajadas,double salarioBase) {
		super(nombre, genero, departamento, horasTrabajadas);
		this.salarioBase=salarioBase;
		// TODO Auto-generated constructor stub
	}
	@Override 

	public double calcularSalario() {
	    validarSalarioYHoras();

	    double salarioTotal = calcularSalarioBase();
	    calcularHorasExtra(salarioTotal);
	    ajustarSalarioPorDepartamento(salarioTotal);

	    return salarioTotal;
	}

	private void validarSalarioYHoras() {
	    if (salarioBase <= 0) {
	        throw new IllegalArgumentException("El salario debe ser mayor o igual a 0");
	    }

	    if (getHorasTrabajadas() < 0) {
	        throw new IllegalArgumentException("Las horas trabajadas deben ser mayor o igual a 0");
	    }
	}

	private double calcularSalarioBase() {
	    return salarioBase;
	}

	private void calcularHorasExtra(double salarioTotal) {
	    if (getHorasTrabajadas() > 40) {
	        salarioTotal += (getHorasTrabajadas() - 40) * 50; // Pago de horas extra
	    }
	}

	private void ajustarSalarioPorDepartamento(double salarioTotal) {
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
	}
	@Override
    public void imprimirDetalles() {
    	super.imprimirDetalles();
    	System.out.println("Sueldo : " + salarioBase);    	
    }

	
	

}
