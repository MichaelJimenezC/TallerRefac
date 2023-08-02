public class EmpleadoPorHoras extends Empleado {
	private double tarifaHora;
	private double salario;
    public EmpleadoPorHoras(String nombre, String genero, String departamento, int horasTrabajadas,double tarifaHora) {
    	super( nombre,  genero,  departamento,  horasTrabajadas);
        this.salario=calcularSalario();
        this.tarifaHora=tarifaHora;
    }
    @Override
    public void imprimirDetalles() {
    	super.imprimirDetalles();
    	System.out.println("Tarifa por hora: " + tarifaHora); 
    	System.out.println("Sueldo: " + salario); 
    }

    @Override
    public double calcularSalario() {       
        return super.getHorasTrabajadas() * this.tarifaHora;
    }

    // Más metodos
}