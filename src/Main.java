import java.util.Scanner;

class ScannerInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Read the name input from the user


        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Read the age input from the user


        System.out.println("Hello, " + name + "! You are " + age + " years old.");


        scanner.close();
}
}