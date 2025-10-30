import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter 1 to check if number if even or odd"); // Case 1: Even or Odd
        System.out.println("Enter 2 to find the largest of three numbers"); // Case 2: Largest of Three Numbers
        System.out.println("Enter 3 for grade calculator"); // Case 3: Grade Calculator
        System.out.println("Enter 4 for simple calculator"); // Case 4: Simple Calculator
        System.out.print("Enter 5 to exit: "); // Case 5: Exit
        int select = a.nextInt(); /* determines the which program to execute */
        switch (select) {
            case 1: /* checks if a value is even or odd and positive or negative */
                System.out.print("Enter an integer: ");
                float numInput = a.nextFloat();
                if /* number is even */ ((numInput % 2) == 0) {
                    System.out.print(numInput + " is Even");
                } else if /* number is odd */ ((numInput % 2) == 1) System.out.print(numInput + " is Odd");
                /* compares the value against zero to determine the charge of the value */
                if (numInput > 0) System.out.print(" and is Positive");
                if (numInput == 0) System.out.print(" and is Equal to Zero");
                if (numInput < 0) System.out.print(" and is Negative");
                break;
            case 2: /* compares three numbers */
                System.out.print("Enter 1st Number: ");
                double x = a.nextDouble();
                System.out.print("Enter 2nd Number: ");
                double y = a.nextDouble();
                System.out.print("Enter 3rd Number: ");
                double z = a.nextDouble();
                if (x > y) {
                    if (x > z) {
                        System.out.println(x); // the first number is the largest
                    } else if (z > x) System.out.println(z); // the last number is the largest
                } else if (y > x) {
                    if (y > z) {
                        System.out.println(y); // the second number is the largest
                    } else if (z > y) System.out.println(z); // the last number is the largest
                }
                break;
            case 3: /* checks grade */
                System.out.println("Enter Grade Percentage: ");
                int A = a.nextInt(); // user enters the grade
                if (A > 89){ System.out.println("A");
                }else if (A > 79) { System.out.println("B");

                }else if (A > 69) { System.out.println("C");

                }else if (A > 59) { System.out.println("D");

                }else /* if A does not fall into one of the other categories */ System.out.println("F");
                break;
            case 4: /* simple calculator */
                System.out.print("Enter 1st Number: ");
                int f = a.nextInt(); // user enters a number
                Scanner l = new Scanner(System.in);
                System.out.print("Enter Operator: ");
                String op = l.nextLine(); // determines the operation performed against the two numbers
                System.out.print("Enter 2nd Number: ");
                int g = a.nextInt(); // user enter a number
                switch (op) /* performs the operation for the entered values */{
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
                        if ((g != 0)) { /* checks if the denominator is not zero */
                            System.out.println("Answer = " + (f / g));
                        } else System.out.println("Invalid Number");
                        break;
                    /* if the operator is not "+", "-", "*", or "/" */default: System.out.println("Invalid Input");
                }
                break;
            case 5:
                System.out.println("Goodbye!");
                break;
            /* if the user enters a value other than 1-5 */ default: System.out.println("Invalid menu option.");
        }
    }
}