package poop7;

public class AnimalTerrestre extends Animal{
    
    private int numPatas;

    public AnimalTerrestre() {
    }

    public AnimalTerrestre(int numPatas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numPatas = numPatas;
    }
    
    public void correr(){
        System.out.println("Estoy corriendooooo!!!");
    }

    @Override
    public void comer() {
        super.comer(); //To change body of generated methods, choose Tools | Templates.
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    @Override
    public String toString() {
        return super.toString() + "AnimalTerrestre{" + "numPatas=" + numPatas + '}';
    } 
    
}
