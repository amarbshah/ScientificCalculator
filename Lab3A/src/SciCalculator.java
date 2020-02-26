import java.util.Scanner;

public class SciCalculator {

// We are learning functions of GIT
    public static void main(String[] args) {

        /*
        sumCalculations = Sum of calculations
        numberCalculations = Number of calculations
        average = Average of calculations
        output = Current Result
         */
        double sumCalculations = 0.00;
        int numberCalculations = 0;
        double average = 0.00;
        double output = 0.00;

        /*
        declare boolean variables
         */
        boolean displayMenu = true;
        boolean run = true;

        Scanner scanner = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("Current Result: " + 0.0);

        while (run == true) {

            System.out.println(" ");

            if (displayMenu) {
                System.out.println("Calculator Menu ");
                System.out.println("--------------- ");
                System.out.println("0. Exit Program ");
                System.out.println("1. Addition ");
                System.out.println("2. Subtraction ");
                System.out.println("3. Multiplication ");
                System.out.println("4. Division ");
                System.out.println("5. Exponentiation ");
                System.out.println("6. Logarithm ");
                System.out.println("7. Display Average ");
                System.out.println(" ");
            }
            displayMenu = true;
            System.out.println("Enter Menu Selection: ");

            int operation = scanner.nextInt();


            if (operation == 0) {
                run = false;
                System.out.println(" ");
                System.out.println("Thanks for using this calculator. Goodbye!");
            }

            else if (operation == 1) {
                // operation for addition
                System.out.println("Enter first operand: ");
                //double firstOperand = scanner.nextDouble();
                double firstOperand = 0;
                String fo = scanner.next();
                if(fo.equals("RESULT")) {
                    firstOperand = output;
                } else {
                    firstOperand = Double.parseDouble(fo);
                }
                System.out.println("Enter second operand: ");
                //double secondOperand = scanner.nextDouble();
                double secondOperand = 0;
                String so = scanner.next();
                if(so.equals("RESULT")) {
                    secondOperand = output;
                } else {
                    secondOperand = Double.parseDouble(so);
                }

                output = firstOperand + secondOperand;
                System.out.println(" ");
                System.out.println("Current Result:  " + output);
                numberCalculations = numberCalculations + 1;
                sumCalculations = sumCalculations + output;
                average = sumCalculations / numberCalculations;


            } else if (operation == 2) {
                // operation for subtraction
                System.out.println("Enter first operand: ");
                //double firstOperand = scanner.nextDouble();
                double firstOperand = 0;
                String fo = scanner.next();
                if(fo.equals("RESULT")) {
                    firstOperand = output;
                } else {
                    firstOperand = Double.parseDouble(fo);
                }
                System.out.println("Enter second operand: ");
                //double secondOperand = scanner.nextDouble();
                double secondOperand = 0;
                String so = scanner.next();
                if(so.equals("RESULT")) {
                    secondOperand = output;
                } else {
                    secondOperand = Double.parseDouble(so);
                }

                output = firstOperand - secondOperand;
                System.out.println(" ");
                System.out.println("Current Result:  " + output);
                numberCalculations = numberCalculations + 1;
                sumCalculations = sumCalculations + output;
                average = sumCalculations / numberCalculations;


            } else if (operation == 3) {
                // operation for multiplication
                System.out.println("Enter first operand: ");
                //double firstOperand = scanner.nextDouble();
                double firstOperand = 0;
                String fo = scanner.next();
                if(fo.equals("RESULT")) {
                    firstOperand = output;
                } else {
                    firstOperand = Double.parseDouble(fo);
                }
                System.out.println("Enter second operand: ");
                //double secondOperand = scanner.nextDouble();
                double secondOperand = 0;
                String so = scanner.next();
                if(so.equals("RESULT")) {
                    secondOperand = output;
                } else {
                    secondOperand = Double.parseDouble(so);
                }

                output = firstOperand * secondOperand;
                System.out.println(" ");
                System.out.println("Current Result:  " + output);
                numberCalculations = numberCalculations + 1;
                sumCalculations = sumCalculations + output;
                average = sumCalculations / numberCalculations;


            } else if (operation == 4) {
                // opearation for division
                System.out.println("Enter first operand: ");
                //double firstOperand = scanner.nextDouble();
                double firstOperand = 0;
                String fo = scanner.next();
                if(fo.equals("RESULT")) {
                    firstOperand = output;
                } else {
                    firstOperand = Double.parseDouble(fo);
                }
                System.out.println("Enter second operand: ");
                //double secondOperand = scanner.nextDouble();
                double secondOperand = 0;
                String so = scanner.next();
                if(so.equals("RESULT")) {
                    secondOperand = output;
                } else {
                    secondOperand = Double.parseDouble(so);
                }

                if (secondOperand != 0.0) {
                    output = firstOperand / secondOperand;
                    System.out.println(" ");
                    System.out.println("Current Result:  " + output);
                    numberCalculations = numberCalculations + 1;
                    sumCalculations = sumCalculations + output;
                    average = sumCalculations / numberCalculations;

                } else
                    System.out.println("Invalid Division");


            } else if (operation == 5) {
                // operation for exponentiation
                System.out.println("Enter first operand: ");
                //double firstOperand = scanner.nextDouble();
                double firstOperand = 0;
                String fo = scanner.next();
                if(fo.equals("RESULT")) {
                    firstOperand = output;
                } else {
                    firstOperand = Double.parseDouble(fo);
                }
                System.out.println("Enter second operand: ");
                //double secondOperand = scanner.nextDouble();
                double secondOperand = 0;
                String so = scanner.next();
                if(so.equals("RESULT")) {
                    secondOperand = output;
                } else {
                    secondOperand = Double.parseDouble(so);
                }

                output = Math.pow(firstOperand, secondOperand);
                System.out.println("");
                System.out.println("Current Result:  " + output);
                numberCalculations = numberCalculations + 1;
                sumCalculations = sumCalculations + output;
                average = sumCalculations / numberCalculations;


            } else if (operation == 6) {
                // operation for logarithm
                System.out.println("Enter first operand: ");
                //double firstOperand = scanner.nextDouble();
                double firstOperand = 0;
                String fo = scanner.next();
                if(fo.equals("RESULT")) {
                    firstOperand = output;
                } else {
                    firstOperand = Double.parseDouble(fo);
                }
                System.out.println("Enter second operand: ");
                //double secondOperand = scanner.nextDouble();
                double secondOperand = 0;
                String so = scanner.next();
                if(so.equals("RESULT")) {
                    secondOperand = output;
                } else {
                    secondOperand = Double.parseDouble(so);
                }

                double Numerator, Denominator;
                Denominator = Math.log(firstOperand);
                Numerator = Math.log(secondOperand);
                output = Numerator / Denominator;
                System.out.println(" ");
                System.out.println("Current Result:  " + output);
                numberCalculations = numberCalculations + 1;
                sumCalculations = sumCalculations + output;
                average = sumCalculations / numberCalculations;


            } else if (operation == 7) {
                // operation for displaying average
                if (numberCalculations == 0) {
                    System.out.println(" ");
                    System.out.println("Error: No calculations yet to average! ");
                    displayMenu = false;
                }

                else {
                    System.out.println(" ");
                    System.out.println("Sum of calculations: " + sumCalculations);
                    System.out.println("Number of calculations: " + numberCalculations);
                    String roundAVG = String.format("Average of calculations: %.2f",  average);
                    System.out.println(roundAVG);
                    displayMenu = false;
                }
            }

            else {
                // operation for invalid selection
                System.out.println(" ");
                System.out.println("Error: Invalid selection!");
                displayMenu = false;
            }
        }

    }

}

