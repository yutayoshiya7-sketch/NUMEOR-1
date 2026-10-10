import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepPlaying;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter a number: ");
            int challenge = scanner.nextInt();

            if (challenge % 3 == 0 && challenge % 5 ==0){
                System.out.println("FIZZ BUZZ");
            } else if (challenge % 3 == 0) {
                System.out.println("Fizz");
            } else if (challenge % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println("can't math");
            }
            scanner.nextLine();
            System.out.println("Keep Playing?");
            String pencil = scanner.nextLine();
            keepPlaying = pencil.equalsIgnoreCase("no");
            if (!keepPlaying) {
                break;
            }
            }
        
        
    }
}