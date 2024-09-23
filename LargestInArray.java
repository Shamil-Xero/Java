
public class LargestInArray {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter the size of the array: ");
        // int max = scanner.nextInt();
        // int[] numbers = new int[max];
        // for (int i = 0; i < numbers.length; i++) {
        //     numbers[i] = scanner.nextInt();
        // }

        int[] numbers = {24,65,3,84,12,54,67,34,98,43};
        int largest = numbers[0];
        
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("The largest element in the array is: " + largest);
    }
}
