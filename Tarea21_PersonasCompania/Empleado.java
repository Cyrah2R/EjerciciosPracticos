package Tarea21_PersonasCompania;

public class Empleado extends Persona{

    private double remuneracion;
    private int empleadoId;

    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion, int empleadoId) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.remuneracion = remuneracion;
        this.empleadoId = empleadoId;
    }

    public Double getRemuneracion() {
        return remuneracion;
    }
    public int getEmpleadoId() {
        return empleadoId;
    }

    public void aumentarRemuneracion(int porcentaje){
        this.remuneracion = remuneracion * porcentaje/100;
    }

    @Override
    public String toString() {
        return super.toString() + "Es empleado, con ID: "
                + empleadoId + ", y obtiene una remuneracion de: "
                + remuneracion + " Euros extras.\n";
    }
}
