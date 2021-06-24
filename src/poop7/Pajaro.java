package poop7;

public class Pajaro extends AnimalAereo{
    
    private String tipoPico;

    public Pajaro() {
    }

    public Pajaro(String tipoPico, int numAlas, String nombre, String lugarOrigen, String color) {
        super(numAlas, nombre, lugarOrigen, color);
        this.tipoPico = tipoPico;
    }
    
    public void recolectarRamas(){
        System.out.println("Estoy recolectando ramas para mi nido nuevo :)");
    }

    public String getTipoPico() {
        return tipoPico;
    }

    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }

    @Override
    public String toString() {
        return super.toString() + "Pajaro{" + "tipoPico=" + tipoPico + '}';
    }
    
    
}
