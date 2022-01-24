package excepciones2;

public class Main {
    public static void main(String[] args) {

        System.out.println("Ejemplo divisiones: \n");


        try {

            double resultado = 10 / 0;

        }catch(ArithmeticException e) {
            //e.printStackTrace();
            System.out.println("ERROR : " + e.getMessage());
        }finally {
            System.out.println("Ultimo mensaje a imprimir.");
        }

    }
}
