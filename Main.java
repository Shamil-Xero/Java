import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main{
    public static void Simple_Details() {
        Scanner scanner = new Scanner(System.in);
        scanner.close();

        System.out.println("What is your name?");
        String name = scanner.nextLine();
        
        System.out.println("Hello "+name);
        
        System.out.println("What is your age?");
        int age = scanner.nextInt();
        
        System.out.println("You are "+age+" years old");
    }
    
    public static void Address(){

        Scanner scanner = new Scanner(System.in);
        scanner.close();

        // printf = "System.out.print"
        
        System.out.println("Enter your Address Details: \n");
        System.out.print("Door No: ");
        String DoorNo = scanner.nextLine();
        System.out.print("Street: ");
        String Street = scanner.nextLine();
        System.out.print("City: ");
        String City = scanner.nextLine();
        System.out.print("Pin Code: ");
        int Pin = scanner.nextInt();
        
        System.out.println();
        System.out.println("Address Details: \n");
        System.out.printf("Door No: %s\nStreet: %s\nCity: %s\nPin code: %d", DoorNo, Street, City, Pin);
        System.out.print("\n\n\n");
    }
    
    public static void AreaOfCircle(){
        Scanner scanner = new Scanner(System.in);
        scanner.close();
        System.out.print("\nEnter the radius of the Circle: ");
        double radius = scanner.nextDouble();
        double area = 3.14*radius*radius;
        System.out.printf("\nArea of the Circle: %.3f", area);
        System.out.print("\n\n");
    }
   
    public static void SimpleInterest() {
        Scanner scanner = new Scanner(System.in);
        scanner.close();

        System.out.print("\nEnter the Principle Amount: ");
        double Principle = scanner.nextDouble();
        
        System.out.print("Enter the Interest: ");
        double Rate = scanner.nextDouble();

        System.out.print("Enter the Tenure: ");
        double Tenure = scanner.nextDouble();

        double Interest = (Principle+Rate+Tenure)/100;

        System.out.printf("Interest for %.1f years = %.3f\n", Tenure, Interest);

    }
    
    public static void Arrays_Example(){
        Integer ArraySize = Integer.valueOf(JOptionPane.showInputDialog("Enter the number of elements: "));
        
        Integer[] elements = new Integer[ArraySize];

        for(int i=0; i<ArraySize; i++){
            elements[i] = Integer.valueOf(JOptionPane.showInputDialog("Enter the element at index " + i + ": "));
        }

        System.out.print("The elements are...\n");
        for(int i=0; i<ArraySize; i++){
            System.out.print(elements[i]+"\t");
        }
    }

    public static void Array_List_Example(){    

        ArrayList<String> fruitList = new ArrayList<>();       
        
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Cherry");
        fruitList.add("Dragon fruit");
        
        System.out.print("The fruit list is...\n");
        // for(int i = 0; i < fruitList.size(); i++){
        //     System.out.print(fruitList.get(i)+"\t");
        // }
        System.out.println(fruitList);

        fruitList.remove("Dragon fruit");

        System.out.print("After removing, the fruit list is...\n");
        // for(int i = 0; i < fruitList.size(); i++){
        //     System.out.print(fruitList.get(i)+"\t");
        // }
        System.out.println(fruitList);
    }

    public static void Find_Hypotenuse(){
        Scanner scanner = new Scanner(System.in);
        scanner.close();
        System.out.print("Enter the adjacent side : ");
        double x = scanner.nextDouble();
        
        System.out.print("Enter the opposite side : ");
        double y = scanner.nextDouble();
        
        double z = Math.sqrt((x*x)+(y*y));
        System.out.print("The Hypotenuse side is "+z);
    }    

    public static void main(String[] args){
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        scanner.close();
        boolean exit = false;
        
        do{
            System.out.println("\n1. Address");
            System.out.println("2. Area of Circle");
            System.out.println("3. Simple Interest");
            System.out.println("0. Exit");
            System.out.print("Enter the program number :");
            int program = scanner.nextInt();
            scanner.nextLine();

            switch (program) {
                case 1 -> Address();
                case 2 -> AreaOfCircle();
                case 3 -> SimpleInterest();
                case 0 -> {
                    System.out.println("Exiting...\n");
                    exit = true;
                }
                default -> System.out.println("Enter a valid number");
            }
        }while (exit != true);
        

        System.out.println();
    }
}