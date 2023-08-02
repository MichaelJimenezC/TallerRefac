public abstract class Empleado {
	private String nombre; 

    private String genero; 

    private String departamento; 

    private int horasTrabajadas; 
    
    public Empleado(String nombre, String genero, String departamento, int horasTrabajadas) { 

        this.nombre = nombre; 

        this.genero = genero; 

        this.departamento = departamento; 

        this.horasTrabajadas = horasTrabajadas; 

    } 

 

    public abstract double calcularSalario(); 

 

    public void imprimirDetalles() { 

        System.out.println("Nombre: " + nombre); 

        System.out.println("Genero: " + genero); 

        System.out.println("Departamento: " + departamento); 

        System.out.println("Horas trabajadas: " + horasTrabajadas); 

    } 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

   

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}

    // Más metodos
}
