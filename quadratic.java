
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double a,b,c;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Solution to quadratic equations");
        System.out.print("Enter the value of the first coefficient:  a = "); a = Double.parseDouble(scanner.nextLine()); System.out.println();
        System.out.print("Enter the value of the second coefficient: b = "); b = Double.parseDouble(scanner.nextLine()); System.out.println();
        System.out.print("Enter the value of the third coefficient:  c = "); c = Double.parseDouble(scanner.nextLine()); System.out.println();
        scanner.close();

        quadraticSolution(a,b,c);

        }

        public static void quadraticSolution(double a, double b, double c){

        if(a!=0 && b!=0 && c!=0){

            System.out.println("The form of the given quadratic equation: ");
            System.out.println(a+"*x*x + "+b+"*x + "+c+" = 0");
            System.out.println();

            double x,x1,x2, D;

            D = b*b-4*a*c;

            if(D<0){
                System.out.println("The equation has no solution");
            }

            if(D==0){
                x = -(b/(2*a));
                System.out.println("The only solution to the equation: x = "+x);
            }

            if(D>0){
                x1 = (-b-Math.sqrt(D))/(2*a);
                x2 = (-b+Math.sqrt(D))/(2*a);
                System.out.println("The equation has two solutions: x1 = "+x1);
                System.out.println("                                x2 = "+x2);
            }
        }else{
            System.out.println("The specified coefficients are not appropriate");
        }
        }
    }


