import java.util.Scanner;

class main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (1-3) to tell your signal light");
        int light = scanner.nextInt();

        switch(light) {
            case 1:
                System.out.println("Red light");
                break;
            
            case 2:
                System.out.println("Yellow light");
                break;
            
            case 3:
                System.out.println("Green light");
                break;
            
            default:
                System.out.println("Unknown");
        }
    }
}