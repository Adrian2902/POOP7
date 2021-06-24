package poop7;

public class POOP7 {
    
    public static void main(String[] args) {
        
        
        System.out.println(" ");
        System.out.println("*****EJERCICIO 1*****");
        System.out.println(" ");
        Gerente gerente = new Gerente();
        gerente.setNombre("Juan Perez");
        gerente.setNumEmpleado(6574);
        gerente.setSueldo(16000);
        
        System.out.println(gerente);
        System.out.println(gerente.getNombre());
        System.out.println(gerente.getNumEmpleado());
        System.out.println(gerente.getSueldo());
        
        gerente.aumentarSueldo(10);
        System.out.println(gerente.getSueldo());
        
        gerente.asignarPresupuesto(100000);
        System.out.println(gerente);
        System.out.println(gerente.getPresupuesto());
        
        System.out.println(" ");
        System.out.println("*****EJERCICIO 2*****");
        System.out.println(" ");
        //Composición 
        if(gerente instanceof Gerente){
            System.out.println("Instancia de Gerente");
        }
        if(gerente instanceof Empleado){
            System.out.println("Instancia de Empleado");
        }
        if(gerente instanceof Object){
            System.out.println("Instancia de Object");
        }
        
        System.out.println(" ");
        System.out.println("*****EJERCICIO 3*****");
        System.out.println(" ");
        
        Gerente gerente2 = new Gerente(500000, "Paula Garcia",9875, 25000);
        System.out.println(gerente2);
        
        System.out.println(" ");
        System.out.println("*****ACTIVIDAD EXTRA*****");
        System.out.println(" ");
        
        System.out.println("-----Clase Animal-----");
        Animal ani = new Animal();
        ani.setNombre("Juancho");
        ani.setColor("Cafe");
        ani.setLugarOrigen("Mexico");
        System.out.println(ani);
        
        System.out.println(" ");
        System.out.println("-----Clase Perro y Animal Terrestre-----");
        System.out.println(" ");
        Perro perro = new Perro("Azul",4,"Trufa","Mexico","Blanco");
        perro.comer();
        perro.sonido("Ladrido");
        System.out.println(perro);
        
        System.out.println(" ");
        System.out.println("-----Clase Ballena y Animal Acuatico-----");
        System.out.println(" ");
        Ballena ballena = new Ballena(); 
        ballena.setLargo(15);
        ballena.setNombre("Ballena - Eubaleana Glacialis");
        ballena.setLugarOrigen("Atlantico Norte");
        ballena.setNumAletas(2);
        ballena.setColor("Negra");
        ballena.sonido("Canto");
        ballena.comer();
        System.out.println(ballena);
        
        System.out.println(" ");
        System.out.println("-----Clase Pajaro y Animal Aereo-----");
        System.out.println(" ");
        Pajaro pajaro = new Pajaro("Pequeno", 2, "Cotorra Argentina", "Argentina", "Verde");
        pajaro.comer();
        pajaro.sonido("Canto");
        System.out.println(pajaro);
        
        
        
    }
    
}
