package excepciones3;

public class Main {
    public static void main(String[] args){

        Division division = new Division(10,0);

        try {
            System.out.println(division.calcularDivision());
        }catch (ArithmeticException e){
            System.out.println("ERROR: "+e.getMessage());
        }

        try {
            System.out.println(division.mostrarDivision());
        }catch (ArithmeticException e){
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
