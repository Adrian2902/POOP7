package poop7;
/**
 * @author mardl
 */
public class Gerente extends Empleado{
    
    private int presupuesto; 

    public Gerente() {
    }

    public Gerente(int presupuesto, String nombre, int numEmpleado, int sueldo) {
        super(nombre, numEmpleado, sueldo); //super hace referencia a la clase padre 
        this.presupuesto = presupuesto;
    }
    
    public void asignarPresupuesto(int presupuesto){
        this.presupuesto = presupuesto; 
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return super.toString() + "Gerente{" + "presupuesto=" + presupuesto + '}';
    }
    
}
