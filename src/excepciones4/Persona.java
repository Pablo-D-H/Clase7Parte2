package excepciones4;

public class Persona {
    private int nroPersona;
    private String nombre;
    private double sueldo;

    public Persona(int nroPersona, String nombre, double sueldo) {
        this.nroPersona = nroPersona;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public int getNroPersona() {
        return nroPersona;
    }

    public void setNroPersona(int nroPersona) {
        this.nroPersona = nroPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nroPersona=" + nroPersona +
                ", nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }


    //Metodos

    public double impuesto() throws ExceptionPersona {
        if (this.getSueldo() <= 0){
            throw new ExceptionPersona("El sueldo no debe ser menor a 0.");
        }

        double total=0;

        if (this.getSueldo() > 1000.0){
            total = this.getSueldo() - ((this.getSueldo() * 0.1) );
        }

        return total;
    }

    public double impuesto(double descuento) throws ExceptionPersona {
        if (this.getSueldo() <= 0){
            throw new ExceptionPersona("El sueldo no debe ser menor a 0.");
        }

        double total=0;

        total = this.getSueldo() - ((this.getSueldo() * descuento) );

        return total;
    }

    public void validarPersona() throws ExceptionPersona {
        if (this.getSueldo()<=0){
            throw new ExceptionPersona("El sueldo no debe ser menor a 0.");
        }
        if (this.getNroPersona() <=0){
            throw new ExceptionPersona("El numero no debe ser menor a 0.");
        }
        if (this.getNombre().equals("")){
            throw new ExceptionPersona("El nombre no debe estar vacio.");
        }

    }

}
