public class ShipGameApp {
    public static void main(String[] args) {
        ShootsRepo shootsRepo = new ShootsRepo();
        shootsRepo.shoot(12, 12);
        shootsRepo.shoot(1, 8);
        shootsRepo.shoot(5, 7);
        shootsRepo.shoot(12, 12);
        shootsRepo.shoot(1, 8);

    }
}
