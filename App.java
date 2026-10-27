import java.util.Scanner;

public class App {

    public static double addition(double term1, double term2) {
        return term1 + term2;
    }

    public static double subtract(double minuend, double subtrahend) {
        return minuend - subtrahend;    
    }       

    public static double multiplication(double factor1, double factor2) {
        return factor1 * factor2;
    }

    public static double division(double dividend, double divisor) {
        return dividend / divisor;
    }
    
    public static double sinCalculator(double degree) {
        double radian = Math.toRadians(degree);
        double sinValue = Math.sin(radian);
        return sinValue;
    }

    public static double power(double base, int exponent) {
        
        double result = 1;

        if (base == 0 && exponent < 0) {
            System.out.println("Error: Division by zero is undefined.");
            return 0;
        }
        else if (exponent > 0) {
            for(int i = 1; i <= exponent; i++) {
                result *= base;
            }
            return result;
        }
        else {
            for(int i = 1; i <= -exponent; i++) {
                result *= base;
            }
            return 1/result;
        }
    }

    public static int ggt(int a, int b) {

        int c;
        int r;

        if (b > a) {
            c = a;
            a = b;
            b = c;
        }
        do {
            r = a % b;
            a = b;
            b = r;
        } while (r != 0);
        
        return a;

        }
    
    public static double fibonacci(int number) {

        double result = 0;
        double phi = (1 + Math.sqrt(5)) / 2;

        result = ((power(phi, number)-power((1-phi), number)) / Math.sqrt(5));
        
        return result;
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int selection;


        do {

            System.out.println("CALCULATOR - Please select: ");
            System.out.println("0: End Program");
            System.out.println("1: Addition");
            System.out.println("2: Subtraction");
            System.out.println("3: Multiplication");
            System.out.println("4: Division");
            System.out.println("5: sin(x)");
            System.out.println("6: Exponentiation");
            System.out.println("7: Greatest Common Divisor");
            System.out.println("8: Fibonacci Serie");
            selection = scanner.nextInt();

            switch (selection) {
                case 1:
                    System.out.print("Term 1: ");
                    double term1 = scanner.nextDouble();
                    System.out.print("Term 2: ");
                    double term2 = scanner.nextDouble();
                    System.out.println("Result: " + addition(term1, term2));
                    break;
                case 2:
                    System.out.print("Minuend: ");
                    double minuend = scanner.nextDouble();
                    System.out.print("Subtrahend: ");
                    double subtrahend = scanner.nextDouble();
                    System.out.println("Result: " + subtract(minuend, subtrahend));
                    break;
                case 3:
                    System.out.print("Factor 1: ");
                    double factor1 = scanner.nextDouble();
                    System.out.print("Factor 2: ");
                    double factor2 = scanner.nextDouble();
                    System.out.println("Result: " + multiplication(factor1, factor2));
                    break;
                case 4:
                    System.out.print("Dividend: ");
                    double dividend = scanner.nextDouble();
                    System.out.print("Divisor: ");
                    double divisor = scanner.nextDouble();
                    System.out.println("Result: " + division(dividend, divisor));
                    break;
                case 5:
                    System.out.print("Degree: ");
                    double degree = scanner.nextDouble();
                    System.out.println("Result: " + sinCalculator(degree));
                    break;
                case 6:
                    System.out.print("Base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Exponent: ");
                    int exponent = scanner.nextInt();
                    System.out.println("Result: " + power(base, exponent));
                    break;
                case 7:
                    try {
                        System.out.print("Integer 1: ");
                        int a = scanner.nextInt();
                        System.out.print("Integer 2: ");
                        int b = scanner.nextInt();
                        
                        if (a <= 0 || b <= 0) {
                            System.out.println("Error: Integers must be bigger than 0!");
                        } else {
                            int ergebnis = ggt(a, b);
                            System.out.println("Result: " + ergebnis);
                        }
                    
                    } catch (Exception e) {
                        System.out.println("Please enter valid numbers.");
                        scanner.nextLine();
                    }    
                    break;
                case 8:
                    System.out.print("Number: ");
                    int number = scanner.nextInt();
                    System.out.println("Result: " + fibonacci(number));
                    break;
                default:
                    break;
            }

        } while (selection != 0);

        scanner.close();
    }
}
