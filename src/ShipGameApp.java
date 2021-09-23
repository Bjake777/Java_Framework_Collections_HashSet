import java.util.Scanner;

public class ShipGameApp {
    public static void main(String[] args) {

        int decision = 0;
        ShootsRepo shootsRepo = new ShootsRepo();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("select options");
            System.out.println("shoot - press 1");
            System.out.println("close the program - press 0");
            decision = scanner.nextInt();
            if (decision == 1) {
                System.out.println("Enter x coordinate");
                int xCoordinate = scanner.nextInt();
                System.out.println("Enter y coordinate");
                int yCoordinate = scanner.nextInt();
                shootsRepo.shoot(xCoordinate, yCoordinate);
            }

        } while (decision != 0);

    }
}
