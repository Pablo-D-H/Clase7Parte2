package excepciones4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)  {

        Persona p1 = new Persona(0, "Pablo", 10);
        Persona p2 = new Persona(002, "Ari", 0);
        Persona p3 = new Persona(003, "Mariano", 4000.0);
        Persona p4 = new Persona(001, "Maria", 6000.0);
        Persona p5 = new Persona(001, "Maribel", 10000.0);

        List<Persona> personaList = new ArrayList<>();

        personaList.add(p1);
        personaList.add(p2);
        personaList.add(p3);
        personaList.add(p4);
        personaList.add(p5);



        try {
            double sueldoTotalPersona = p1.impuesto();
            System.out.println("\nSueldo total de la persona " + p1.getNombre()+ " es: "+sueldoTotalPersona);
        }catch (ExceptionPersona e){
            System.out.println("ERROR: "+e.getMessage());
        }

        try {
        double sueldoTotalPersona2 = p2.impuesto(0.5);
        System.out.println("\nSueldo total de la persona " + p2.getNombre()+ " es: "+sueldoTotalPersona2);
        }catch (ExceptionPersona e){
        System.out.println(e.getMessage());
        }

        System.out.println("");

        try {
            p1.validarPersona();
        }catch (ExceptionPersona e){
            System.out.println(e.getMessage());
        }

    }
}
