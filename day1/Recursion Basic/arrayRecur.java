import java.util.*;

public class arrayRecur {
   
    
        // Recursive function to generate an array from 1 to 'n'
        public static int[] generateArray(int n) {
            // Base case: when 'n' is 0, return an empty array
            if (n == 0) {
                return new int[0];
            } else {
                // Recursive case: generate array for 'n-1'
                int[] result = generateArray(n - 1);
                
                // Create a new array with one additional element
                int[] newArray = Arrays.copyOf(result, result.length + 1);
                
                // Add 'n' at the end of the new array
                newArray[result.length] = n;
                
                // Return the new array
                return newArray;
            }
        }
    
        public static void main(String[] args) {
            // Create a Scanner object for user input
            Scanner sc = new Scanner(System.in);
            
            // Prompt the user to enter a number 'n'
            System.out.print("Enter a number 'n': ");
            int n = sc.nextInt();
    
            // Call the generateArray function to generate the array
            int[] resultArray = generateArray(n);
    
            // Print the generated array using Arrays.toString()
            System.out.println("Generated array: " + Arrays.toString(resultArray));
        }
    }
    
