import java.util.Scanner;

class main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your movie rating (0 - 100000): ");
        int rating = scanner.nextInt();

        if (rating > 750000) {
            System.out.println("Out of the world");
        } else if (rating > 45000 && rating < 75000) {
            System.out.println("Best");
        } else if (rating > 25000) {
            System.out.println("Better");
        } else if (rating > 5000) {
            System.out.println("Good");
        } else {
            System.out.println("Average or no clear classification");
        }
        scanner.close();
    }
}
