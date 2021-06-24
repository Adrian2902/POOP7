package poop7;

public class Ballena extends AnimalAcuatico{
    
    private int largo;

    public Ballena() {
    }

    public Ballena(int largo, int numAletas, String nombre, String lugarOrigen, String color) {
        super(numAletas, nombre, lugarOrigen, color);
        this.largo = largo;
    }
    
    public void pelearConPinocho(){
        System.out.println("Estor pelando con Pinocho >:(");
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return super.toString() + "Ballena{" + "largo=" + largo + '}';
    }
    
    
    
    
}
