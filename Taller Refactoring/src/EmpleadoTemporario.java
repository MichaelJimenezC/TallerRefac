public class EmpleadoTemporario extends EmpleadoSalarioBase {
    private int mesesContrato;

    public EmpleadoTemporario(String nombre, String genero, String departamento, int horasTrabajadas,double salarioBase,int mesesContrato) {
		super(nombre, genero, departamento, horasTrabajadas,salarioBase);
        this.mesesContrato = mesesContrato;
  
    }
    @Override
    public void imprimirDetalles() {
    	super.imprimirDetalles();
    	System.out.println("Meses contratado: " + mesesContrato); 
    	
    }
   

    // Más metodos
}
