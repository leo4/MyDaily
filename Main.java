import java.math.BigInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

class Calculator{

    private final static Logger LOGGER = Logger.getLogger("bitacora.subnivel.Control");
    public BigInteger add(BigInteger  a, BigInteger  b){
        System.out.println("This is add 2 method");

        BigInteger result =a.add(b);
        LOGGER.log(Level.INFO, "added succesfully 2 params :"+a+"+"+b+" Result is:"+result);

        return result;
    }

    public BigInteger add(BigInteger a, BigInteger b,BigInteger c){
        System.out.println("This is add method 3 params");

        BigInteger result =a.add(b).add(c);
        LOGGER.log(Level.INFO, "added succesfully 3 params :"+a+"+"+b+"+"+c+" Result is:"+result);

        return result;

    }
    public BigInteger add(BigInteger a, BigInteger b,BigInteger c,BigInteger d){
        System.out.println("This is add method 4 params");
        BigInteger result =a.add(b).add(c).add(d);
        LOGGER.log(Level.INFO, "added succesfully 4 params :"+a+"+"+b+"+"+c+"+"+d+" Result is:"+result);

        return result;
    }
    public double subtract(double a, double b){
        return a-b;
    }
    public double division(double a, double b){
        if (b!=0) return a/b;
        else
            return 0;
    }
    public double mult(double a, double b){
        return a*b;
    }
    public double sqrt(double a){
        return java.lang.Math.sqrt (a);
    }
}

public class Main{
    public static void main(String[] args){
        Calculator calc = new Calculator();
 calc.add(BigInteger.valueOf(2),BigInteger.valueOf(3));
        calc.add(BigInteger.valueOf(2),BigInteger.valueOf(3),BigInteger.valueOf(4));
        }
        }