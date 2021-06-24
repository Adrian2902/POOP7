package poop7;

public class Animal {
    
    private String nombre;
    private String lugarOrigen;
    private String color; 

    public Animal() {
    }

    public Animal(String nombre, String lugarOrigen, String color) {
        this.nombre = nombre;
        this.lugarOrigen = lugarOrigen;
        this.color = color;
    }
    
    public void sonido(String sonido){
        System.out.println("Este es mi sonido: " + sonido);
    }
    
    public void comer(){
        System.out.println("Estoy comiendo");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugarOrigen() {
        return lugarOrigen;
    }

    public void setLugarOrigen(String lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", lugarOrigen=" + lugarOrigen + ", color=" + color + '}';
    }
    
}
