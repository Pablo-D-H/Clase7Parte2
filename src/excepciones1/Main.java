package excepciones1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {

        //https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/Exception.html
        //https://docs.oracle.com/en/java/javase/12/docs/api/java.base/java/lang/Throwable.html
        //https://docs.oracle.com/javase/8/docs/api/allclasses-noframe.html
        try{
            FileInputStream file = new FileInputStream("archivo/archivo.txt");
            System.out.println(file);

        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            //System.out.println("El archivo no existe.");
            //System.out.println(e.getMessage());
            System.out.println("ERROR: "+ e.getMessage());

        }
    }
}
