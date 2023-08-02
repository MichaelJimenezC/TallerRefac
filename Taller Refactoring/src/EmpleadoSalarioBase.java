
public class EmpleadoSalarioBase extends Empleado {
	private double salarioBase; 
	public EmpleadoSalarioBase(String nombre, String genero, String departamento, int horasTrabajadas,double salarioBase) {
		super(nombre, genero, departamento, horasTrabajadas);
		this.salarioBase=salarioBase;
		// TODO Auto-generated constructor stub
	}
	@Override 

    public double calcularSalario() { 

		double salarioTotal = salarioBase;
        if (salarioBase>0) {
            if (getHorasTrabajadas() >= 0) {
                // Horas trabajadas normales = 40;
                if (getHorasTrabajadas() > 40) {
                    salarioTotal += (getHorasTrabajadas() - 40) * 50; // Pago de horas extra
                }
            }else {
                throw new IllegalArgumentException("Las horas trabajadas deben ser mayor o igual a 0");
            }
        } else {
            throw new IllegalArgumentException("El salario debe ser mayor o igual a 0");
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
