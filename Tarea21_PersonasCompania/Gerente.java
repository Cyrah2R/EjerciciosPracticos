package Tarea21_PersonasCompania;

public class Gerente extends Empleado{

    private double presupuesto;

    public Gerente(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion, int empleadoId) {
        super(nombre, apellido, numeroFiscal, direccion, remuneracion, empleadoId);
    }

    public Double getPresupuesto() {
        return presupuesto;
    }
    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return super.toString() + "Su puesto es de Gerente, y maneja un presupuesto de "
                + presupuesto;
    }
}
