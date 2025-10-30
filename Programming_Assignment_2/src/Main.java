import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter 1 to check if number if even or odd");
        System.out.println("Enter 2 to find the largest of three numbers");
        System.out.println("Enter 3 for grade calculator");
        System.out.println("Enter 4 for simple calculator");
        System.out.print("Enter 5 to exit: ");
        int select = a.nextInt();
        switch (select) {
            case 1:
                System.out.print("Enter an integer: ");
                float numInput = a.nextFloat();
                if ((numInput % 2) == 0) {
                    System.out.print(numInput + " is Even");
                } else if ((numInput % 2) == 1) System.out.print(numInput + " is Odd");
                if (numInput > 0) System.out.print(" and is Positive");
                if (numInput == 0) System.out.print(" and is Equal to Zero");
                if (numInput < 0) System.out.print(" and is Negative");
                break;
            case 2:
                System.out.print("Enter 1st Number: ");
                double x = a.nextDouble();
                System.out.print("Enter 2nd Number: ");
                double y = a.nextDouble();
                System.out.print("Enter 3rd Number: ");
                double z = a.nextDouble();
                if (x > y) {
                    if (x > z) {
                        System.out.println(x);
                    } else if (z > x) System.out.println(z);
                } else if (y > x) {
                    if (y > z) {
                        System.out.println(y);
                    } else if (z > y) System.out.println(z);
                }
                break;
            case 3:
                System.out.println("Enter Grade Percentage: ");
                int A = a.nextInt();
                if (A > 89) {
                    System.out.println("A");
                }else if (A > 79) {
                    System.out.println("B");
                }else if (A > 69) {
                    System.out.println("C");
                }else if (A > 59) {
                    System.out.println("D");
                }else System.out.println("F");
                break;
            case 4:
                System.out.print("Enter 1st Number: ");
                int f = a.nextInt();
                Scanner l = new Scanner(System.in);
                System.out.print("Enter Operator: ");
                String op = l.nextLine();
                System.out.print("Enter 2nd Number: ");
                int g = a.nextInt();
                switch (op) {
                    case "+":
                        System.out.println("Answer = " + (f+g));
                        break;
                    case "-":
                        System.out.println("Answer = " + (f-g));
                        break;
                    case "*":
                        System.out.println("Answer = " + (f*g));
                        break;
                    case "/":
                        if ((g != 0)) {
                            System.out.println("Answer = " + (f / g));
                        } else System.out.println("Invalid Number");
                        break;
                    default: System.out.println("Invalid Input");
                }
                break;
            case 5:
                System.out.println("Goodbye!");
                break;
            default: System.out.println("Invalid menu option.");
        }
    }
}