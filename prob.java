import java.util.Scanner;

public class prob {
    prob() {

    }

    public static int size(Scanner sc) {
        int size = 0;
        do {

            System.out.print("Enter the number of arguments [A(i)]: ");

            size = sc.nextInt();

            if (size == 0) {
                System.out.println("Input cannot be zero. Please try again.");
            }
        } while (size == 0);
        return size;
    }

    public double[] setA(Scanner sc, int size) {
        double[] A = new double[size];

        while (true) { // Infinite loop until valid input is given
            System.out.println("Enter the A(i) probability values (must be between 0 and 1):");

            int count = 0; // To track how many elements have been added
            double total = 0; // To track the sum of the elements

            // Loop to append data to the array
            while (count < size) {
                System.out.print("Enter a number to append to the array: ");
                try {
                    double input = sc.nextDouble();

                    // Check if the input is greater than 1 or less than 0
                    if (input < 0 || input > 1) {
                        System.out.println("Invalid input! Please enter a number between 0 and 1.");
                        continue; // Skip to the next iteration of the loop
                    }

                    // Append the input to the array
                    A[count] = input;
                    total += input; // Add to total
                    count++; // Increase the count after adding an element
                    System.out.println("Number added to the array!");
                } catch (Exception e) {
                    System.out.println("Invalid input! Please enter a valid number.");
                    sc.next(); // Clear the invalid input
                }
            }

            // Check if the summation is 1
            if (total != 1.0) {
                System.out.println("The sum of the probabilities must equal 1. Please enter the values again.");
                size(sc);
            } else {
                break; // Exit the loop if the total equals 1
            }
        }

        return A;
    }

    public double[] setE_A(Scanner sc, int size) {
        double[] E_A = new double[size];

        while (true) { // Keep prompting for input until valid entries are made
            System.out.println("Enter the probability over the A(i) due to Event (any real numbers):");

            int count = 0; // To track how many elements have been added

            // Loop to append data to the array
            while (count < size) {
                System.out.print("Enter a number to append to the array: ");
                try {
                    double input = sc.nextDouble();

                    // Append the input to the array
                    E_A[count] = input;

                    if (input < 0 || input > 1) {
                        System.out.println("Invalid input! Please enter a number between 0 and 1.");
                        continue; // Skip to the next iteration of the loop
                    }
                    count++; // Increase the count after adding an element
                    System.out.println("Number added to the array!");

                } catch (Exception e) {
                    System.out.println("Invalid input! Please enter a valid number.");
                    sc.next(); // Clear the invalid input
                }
            }

            // If all entries have been added, exit the loop
            if (count == size) {
                System.out.println("Array is now full.");
                break;
            }
        }

        return E_A;
    }

    public double[] setP(int size, double[] A, double[] E_A) {
        double P[] = new double[size];

        for (int i = 0; i < size; i++) {
            P[i] = A[i] * E_A[i];
        }

        return P;
    }

    public double summation(double[] P) {
        double totalProabiltity = 0;

        for (int i = 0; i < P.length; i++) {
            totalProabiltity += P[i];
        }
        return totalProabiltity;
    }

    public static void printArray(String arrayName, double[] array) {
        System.out.printf("%s: \t\t", arrayName);
        for (double value : array) {
            System.out.printf("%.3f    ", value); // Print each value with 4 decimal places
        }
        System.out.println(); // New line after printing the array
    }

    public double[] setA1(Scanner sc, int size) {
        double[] A = new double[size];

        while (true) { // Infinite loop until valid input is given
            System.out.println("Enter the A(i) probability values (must be between 0 and 1):");

            int count = 0; // To track how many elements have been added
            double total = 0; // To track the sum of the elements

            // Loop to append data to the array
            while (count < size) {
                System.out.print("Enter a number to append to the array: ");
                try {
                    double input = sc.nextDouble();

                    // Check if the input is greater than 1 or less than 0
                    if (input < 0 || input > 1) {
                        System.out.println("Invalid input! Please enter a number between 0 and 1.");
                        continue; // Skip to the next iteration of the loop
                    }

                    // Append the input to the array
                    A[count] = input;
                    total += input; // Add to total
                    count++; // Increase the count after adding an element
                    System.out.println("Number added to the array!");
                } catch (Exception e) {
                    System.out.println("Invalid input! Please enter a valid number.");
                    sc.next(); // Clear the invalid input
                }
            }

            // Check if the summation is 1
            if (total != 1.0) {
                System.out.println("The sum of the probabilities must equal 1. Please enter the values again.");
                size(sc);
            } else {
                break; // Exit the loop if the total equals 1
            }
        }

        return A;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = size(sc);

        prob instance = new prob();
        double[] A = instance.setA(sc, size);
        double[] E_A = instance.setE_A(sc, size);
        double[] P = instance.setP(size, A, E_A);
        double totalProabiltity = instance.summation(P);

        printArray("Prior_Proability(A)", A);
        printArray("Conditional_Proability(E_A)", E_A);
        printArray("Posterial_Proabiltiy(P)", P);

        System.out.printf("\nTotal Proabiltity: %.3f\n", totalProabiltity);



    }

}