import  java.util.Scanner;
public class Calculater {
    public static void main (String[]args){
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Give first number: ");
        double x1= keyboard.nextDouble();
        System.out.print("Give second number: ");
        double x2= keyboard.nextDouble();
        System.out.println("Give: (*,+,-,/)");
        char c=keyboard.next().charAt(0);
        double result=0;
        switch (c){
            case '+':
                result=add(x1,x2);
                break;
            case '-':
                result=substract(x1,x2);
                break;
            case '*':
                result=multiply(x1,x2);
                break;
            case '/':
                if (x2 != 0) {
                    result=divide(x1,x2);
                }
                    else{
                        System.out.println("Impossible to divide with 0");
                        System.exit(0);
                }
                    break;
            default:
                    System.out.println("absurd operation");

        }
            System.out.println("The result is : "+result);
    }
    public static double add(double num1,  double num2){
        return num1+num2;
    }
    public static double substract(double num1,  double num2){
        return num1*-num2;
    }
    public static double multiply(double num1,  double num2){
        return num1*num2;
    }
    public static double divide(double num1,  double num2){
        return num1/num2;
    }

}
