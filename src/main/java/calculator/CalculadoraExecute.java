package calculator;

public class CalculadoraExecute {
    public static void main(String[] arg){
    System.out.println("== Calculator Excecute ==");
    Calculadora c = new Calculadora();
    int addition = c.addition(1,1);
    System.out.println("c.addition(1,1)= "+addition);
        int sustract = c.subtraction(1,1);
        System.out.println(" c.subtraction(1,1)= "+sustract);
        int div = c.divition(1,1);
        System.out.println(" c.divition(1,1) = "+div);

        int mul = c.multiplication(1,1);
        System.out.println(" c.multiplication(1,1)= "+mul);
        double pow = c.power(2,3);
        System.out.println("c.power(2,3) = " + pow);
        double sr = c.squareRoot(16);
        System.out.println("c.suareRoot(16):" + sr);


    }
}
