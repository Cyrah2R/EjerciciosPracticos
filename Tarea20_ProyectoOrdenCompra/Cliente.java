/*
Crear la clase Cliente con dos atributos nombre y apellido, inicializar todos sus valores en el constructor e implementar
sus respectivos métodos getter.
*/

package Tarea20_ProyectoOrdenCompra;
public class Cliente {
    private String nombre;
    private String apellido;
    public Cliente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public String getNombre(){ return nombre; }
    public String getApellido(){ return apellido; }

    @Override
    public String toString() {
        return nombre + " " + apellido;
    }
}
