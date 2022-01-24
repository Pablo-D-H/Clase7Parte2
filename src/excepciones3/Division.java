package excepciones3;

public class Division {
    private int dividendo;
    private int divisor;

    public Division(int dividendo, int divisor) {
        this.dividendo = dividendo;
        this.divisor = divisor;
    }

    public int getDividendo() {
        return dividendo;
    }

    public void setDividendo(int dividendo) {
        this.dividendo = dividendo;
    }

    public int getDivisor() {
        return divisor;
    }

    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }

    public double calcularDivision() throws ArithmeticException{
        if (divisor==0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }

        return dividendo/divisor;
    }

    public String mostrarDivision() throws ArithmeticException {
        double resultado = calcularDivision();
        return "La division de: "+ dividendo +"/"+ divisor +" es " + resultado;
    }
}
