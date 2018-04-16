import Interfaces.*;
import BusinessEntity.*;
public class Program{

    public static void main(String []args){
        CalculadoraInteiro calc = new CalculadoraInteiro(8);
        Binary b1 = calc.CreateBinary("0111");
        Binary b2 = calc.CreateBinary("0010");
        Binary b3 = calc.Soma(b1, b2);
        Binary b4 = calc.Subtracao(b1, b2);

        System.out.println(b1.toString() + " + " + b2.toString() + " = " + b3.toString() );
        System.out.println(b1.toString() + " - " + b2.toString() + " = " + b4.toString() );

    }
}