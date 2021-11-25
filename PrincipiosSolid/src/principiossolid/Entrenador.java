
package principiossolid;

public class Entrenador extends Persona{
    private String estrategia;

    public Entrenador(String estrategia, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.estrategia = estrategia;
    }

    public String getEstrategia() {
        return estrategia;
    }
    
    @Override
    public void partidoFutbol(){
        System.out.println("Dirige el partido de fútbol");
    }
    @Override
    public void entrenamiento(){
        System.out.println("Dirige el entrenamiento");
    }
    
    public void planificarEntrenamiento(){
        System.out.println("Planificar entrenamiento");
    }
    
    
}
