package calculator;

public class Calculadora {
    public int addition(int i, int i1){
        return i+i1;

    }

    public int subtraction(int i, int i1) {
        return i-i1;
    }

    public int divition(int i, int i1) {
        return i/i1;
    }

    public int multiplication(int i, int i1) {
        return (i*i1);
    }




    public double power(int i, int j) {return Math.pow(i,j);};

    public double squareRoot(int i) {return Math.pow(i, 0.5);}
}
