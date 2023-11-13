import java.util.*;
import java.util.Scanner;

public class TaskOnMonths {
    public static void main(String[] args) {
        ArrayList<Integer> inputCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number (1-12) or 'quit' to exit: ");
            String input = scanner.next();

            if (input.equals("quit")) {
                break;
            }
        System.out.println("Printing months and collection:");

        
        displaySpecialConditions(inputNumbers);
    }

    public static void displayMonthName(int number) {
                switch (number) {
                case 1:
                    System.out.println("1 - January");
                    break;
                case 2:
                    System.out.println("2 - February");
                    break;
                case 3:
                    System.out.println("3 - March");
                    break;
                case 4:
                    System.out.println("4 - April");
                    break;
                case 5:
                    System.out.println("5 - May");
                    break;
                case 6:
                    System.out.println("6 - June");
                    break;
                case 7:
                    System.out.println("7 - July");
                    break;
                case 8:
                    System.out.println("8 - August");
                    break;
                case 9:
                    System.out.println("9 - September");
                    break;
                case 10:
                    System.out.println("10 - October");
                 if (inputNumbers.contains(10)) {
            System.out.println("October - Input collection of numbers: " + inputNumbers);
                }
               break;
                case 11:
                    System.out.println("11 - November");
                    break;
                case 12:
                    System.out.println("12 - December");

                        if (inputCollection.size() >= 10) {
                            System.out.println("Collection for December: " + inputCollection);
                        } else {
                            System.out.println("Collection size for December is less than 10.");
                        }
                    
                    break;
                default:
                    System.out.println("Invalid input. Please enter a number between 1 and 12.");
            }
        }
    }
}
