
package principiossolid;


public class Medico extends Persona {
    private String titulacion;
    private int agnoExperiencia;

    public Medico(String titulacion, int agnoExperiencia, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.agnoExperiencia = agnoExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public int getAgnoExperiencia() {
        return agnoExperiencia;
    }
    
    @Override 
    public void partidoFutbol(){
        System.out.println("Da asistencia en el partido de fútbol");
    }
    
    @Override
    public void entrenamiento(){
        System.out.println("Sa asistencia en el entrenamiento");
    }
    
    public void curarLesion(){
        System.out.println("Cura la lesión");
    }
    
}
