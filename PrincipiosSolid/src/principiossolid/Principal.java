
package principiossolid;

import java.util.ArrayList;
import java.util.Scanner;


public class Principal {
    
    static ArrayList<Persona> persona = new ArrayList<Persona>();
    static Scanner entrada = new Scanner(System.in);
    
    static Persona futbolista1 = new Futbolista(9,"Delantero","Gonzalo","Higuain",29);
    static Persona futbolista2 = new Futbolista(21,"Delantero","Paulo","Dybala",23);
    static Persona entrenador = new Entrenador("Defensiva", "Maximiliano", "Alegri", 49);
    static Persona medico = new Medico("Licenciado en fisioterapia", 20, "Alex", "Hunter", 55);
    
    
    
    public static void main(String[] args){
        persona.add(futbolista1);
        persona.add(futbolista2);
        persona.add(entrenador);
        persona.add(medico);
        
        
        menu();
        
    }
    
    public static void menu(){
        int opcion;
        do{
            System.out.println("Menu");
            System.out.println("1. Viaje de equipo");
            System.out.println("2. Entrenamiento");
            System.out.println("3. Partido de fútbol");
            System.out.println("4. Planificar el entrenamiento");
            System.out.println("5. Entrevista");
            System.out.println("6. Curar lesión");
            System.out.println("7. Salir");  
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1:  viajarEquipo();
                    break;
                case 2:  entrenarEquipo();
                    break;
                case 3:   partidoFutbol();
                    break;
                case 4: planificarEntrenamiento();
                    break;
                case 5:   darEntrevista();
                    break;
                case 6:   curarLesion();
                    break;
                case 7:
                    break;
                default: System.out.println("Opción incorrecta");
            }
            System.out.println("");
        }while(opcion != 7);
    }
    
    public static void viajarEquipo(){
        for(Persona equipo: persona){
            System.out.print(equipo.getNombre() +" "+equipo.getApellidos()+" -> ");
            equipo.viajar();
        }
    }
    
    public static void entrenarEquipo(){
        for(Persona equipo: persona){
            System.out.print(equipo.getNombre()+" "+equipo.getApellidos()+" -> ");
            equipo.entrenamiento();
        }
    }
    
    public static void partidoFutbol(){
        for(Persona equipo: persona){
            System.out.print(equipo.getNombre()+" "+equipo.getApellidos()+" -> ");
            equipo.partidoFutbol();
        }
    }
    
    public static void planificarEntrenamiento(){
        System.out.print(entrenador.getNombre()+" "+entrenador.getApellidos()+" -> ");
        ((Entrenador)entrenador).planificarEntrenamiento();
    }
    
    public static void darEntrevista(){
        System.out.print(futbolista1.getNombre()+" "+futbolista1.getApellidos()+" -> ");
        ((Futbolista)futbolista1).entrevista();
        System.out.print(futbolista2.getNombre()+" "+futbolista2.getApellidos()+" -> ");
        ((Futbolista)futbolista2).entrevista();
    }
    
    public static void curarLesion(){
        System.out.print(medico.getNombre()+" "+medico.getApellidos()+" -> ");
        ((Medico)medico).curarLesion();
    }
   
}
