class Calculator{
        public double add(double a, double b){
            System.out.println("This is add 2 method");
        return a+b;
    }
    public double add(double a, double b,double c){
        System.out.println("This is add method 3 params");
        return a+b+c;
    }
    public double add(double a, double b,double c,double d){
        System.out.println("This is add method 4 params");
        return a+b+c+d;
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

        }
        }