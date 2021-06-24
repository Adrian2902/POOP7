package poop7;

public class Perro extends AnimalTerrestre{
    
    private String colorCollar;

    public Perro() {
    }

    public Perro(String colorCollar, int numPatas, String nombre, String lugarOrigen, String color) {
        super(numPatas, nombre, lugarOrigen, color);
        this.colorCollar = colorCollar;
    }
    
    public void hacerTrucos(){
        System.out.println("Se atrapar mi pelota");
    }

    public String getColorCollar() {
        return colorCollar;
    }

    public void setColorCollar(String colorCollar) {
        this.colorCollar = colorCollar;
    }

    @Override
    public String toString() {
        return super.toString() + "Perro{" + "colorCollar=" + colorCollar + '}';
    }
    
    
    
}
