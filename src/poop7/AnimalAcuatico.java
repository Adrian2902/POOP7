package poop7;

public class AnimalAcuatico extends Animal{
    
    private int numAletas;

    public AnimalAcuatico() {
    }

    public AnimalAcuatico(int numAletas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numAletas = numAletas;
    }

    public int getNumAletas() {
        return numAletas;
    }

    public void setNumAletas(int numAletas) {
        this.numAletas = numAletas;
    }
    
    
    public void nadar(){
        System.out.println("Estoy nadando :)");
    }

    @Override
    public void comer() {
        super.comer(); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString() {
        return super.toString() + "AnimalAcuatico{" + "numAletas=" + numAletas + '}';
    }
    

}
