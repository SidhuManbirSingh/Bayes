# **Probability Calculator Using Java**

### **Overview**
This Java program is a simple console-based application that helps you calculate probability-related values using arrays of probabilities and their respective conditional probabilities. It uses the **Scanner** class for user input and follows a series of logical steps to ensure that the user enters valid probability values.

---

### **Features**
- **Input Validation**: Ensures that the probability values entered are between `0` and `1`, and that the sum of certain probabilities equals `1`.
- **Array Operations**: Collects arrays of probabilities and computes various probability metrics.
- **Error Handling**: Handles invalid inputs gracefully by prompting the user to enter values again.
- **Calculation and Output**:
  - Computes the product of prior probabilities and event-based probabilities.
  - Outputs the results in a formatted manner.

---

### **How to Run the Program**
1. **Compile the Program**:
   Open your command-line interface (CLI) or terminal, navigate to the directory containing the `prob.java` file, and compile it using:
   ```sh
   javac prob.java
   ```
2. **Run the Program**:
   Execute the compiled program using:
   ```sh
   java prob
   ```

---

### **User Guide**
1. **Number of Arguments**:
   - The program first asks for the number of probability values (`A(i)`) you want to input.
   - You must enter a positive integer. The program will prompt you again if you enter `0`.

2. **Entering Prior Probabilities**:
   - You will be prompted to input each probability value for `A(i)`. 
   - Each value must be between `0` and `1`. If any value is out of this range, you will be asked to enter it again.
   - The total sum of all `A(i)` probabilities must equal `1`. If not, you will need to re-enter the values.

3. **Entering Conditional Probabilities**:
   - The program will then prompt you to enter values for the event-based probabilities `E_A`.
   - Each value must also be between `0` and `1`.

4. **Calculations and Output**:
   - The program computes the **posterior probabilities** by multiplying the corresponding elements of `A` and `E_A`.
   - The total probability is calculated and displayed.

5. **Output**:
   - The arrays and the total probability are printed in a well-formatted manner.

---

### **Sample Output**
```sh
Enter the number of arguments [A(i)]: 3
Enter the A(i) probability values (must be between 0 and 1):
Enter a number to append to the array: 0.5
Number added to the array!
Enter a number to append to the array: 0.3
Number added to the array!
Enter a number to append to the array: 0.2
Number added to the array!
The sum of the probabilities must equal 1. Please enter the values again.

Enter the A(i) probability values (must be between 0 and 1):
Enter a number to append to the array: 0.4
Number added to the array!
Enter a number to append to the array: 0.4
Number added to the array!
Enter a number to append to the array: 0.2
Number added to the array!
Enter the probability over the A(i) due to Event (any real numbers):
Enter a number to append to the array: 0.7
Number added to the array!
Enter a number to append to the array: 0.6
Number added to the array!
Enter a number to append to the array: 0.5
Number added to the array!
Array is now full.

Prior_Proability(A):      0.400    0.400    0.200    
Conditional_Proability(E_A):      0.700    0.600    0.500    
Posterial_Proabiltiy(P):      0.280    0.240    0.100    

Total Proabiltity: 0.620
```

---

### **Code Structure**
1. **Main Class**: `prob`
   - Contains the main method and initiates the program logic.
2. **Methods**:
   - `size(Scanner sc)`: Prompts for and returns the number of arguments.
   - `setA(Scanner sc, int size)`: Collects and validates prior probabilities.
   - `setE_A(Scanner sc, int size)`: Collects and validates event-based probabilities.
   - `setP(int size, double[] A, double[] E_A)`: Computes the product of probabilities.
   - `summation(double[] P)`: Calculates the total probability.
   - `printArray(String arrayName, double[] array)`: Utility to print arrays in a formatted way.

---

### **Important Notes**
- **Input Validation**: The program repeatedly prompts for valid input if incorrect values are entered, ensuring robustness.
- **Probability Constraint**: The sum of all `A(i)` values must equal `1`. This is a critical requirement in probability theory.

---

### **Future Enhancements**
- Add support for more complex probability models.
- Implement a graphical user interface (GUI) for a more user-friendly experience.
- Provide options for exporting results to a file.

---

### **Contact**
For questions or issues, please contact: [Your Email/Contact Information]

Enjoy using the Probability Calculator!
