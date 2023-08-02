public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();


        EmpleadoPorHoras emp1 = new EmpleadoPorHoras("Dario Laborde", "Masculino", "Sistemas", 45,15);
        EmpleadoFijo emp2 = new EmpleadoFijo("Jorge Gaibor", "Masculino", "Contabilidad", 45,700,40);
        EmpleadoTemporario emp3 = new EmpleadoTemporario("Jordan Salinas","Masculino", "Medico", 20,200,6) ;

        empresa.contratarEmpleado(emp1);
        empresa.contratarEmpleado(emp2);
        empresa.contratarEmpleado(emp3);

        emp1.imprimirDetalles();
        emp2.imprimirDetalles();
        emp3.imprimirDetalles();
    }
}