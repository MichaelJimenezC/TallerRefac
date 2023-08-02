public class EmpleadoFijo extends EmpleadoSalarioBase { 
    private double bonoAnual; 

    public EmpleadoFijo(String nombre, String genero, String departamento, int horasTrabajadas,double salarioBase,double bonoAnual) { 
    	super(nombre, genero, departamento, horasTrabajadas,salarioBase);
        this.bonoAnual = bonoAnual; 

    } 
    @Override
    public void imprimirDetalles() {
    	super.imprimirDetalles();
    	System.out.println("Bono anual: " + bonoAnual); 
    	
    }

 

    

} 

 