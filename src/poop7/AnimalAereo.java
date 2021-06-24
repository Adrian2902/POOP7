package poop7;

public class AnimalAereo extends Animal{
    
    private int numAlas;

    public AnimalAereo() {
    }

    public AnimalAereo(int numAlas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numAlas = numAlas;
    }
    
    public void volar(){
    
    }

    @Override
    public void comer() {
        super.comer(); //To change body of generated methods, choose Tools | Templates.
    }

    public int getNumAlas() {
        return numAlas;
    }

    public void setNumAlas(int numAlas) {
        this.numAlas = numAlas;
    }

    @Override
    public String toString() {
        return super.toString() + "AnimalAereo{" + "numAlas=" + numAlas + '}';
    }
    
    
}
