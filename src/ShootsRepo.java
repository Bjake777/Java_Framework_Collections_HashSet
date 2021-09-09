import java.util.HashSet;
import java.util.Set;

public class ShootsRepo {
    Set<Shoot> shoots = new HashSet<>();

    public void shoot(int x, int y) {
        Shoot shoot = new Shoot(x, y);
        if (!shoots.contains(shoot)) {
            shoots.add(shoot);
        } else {
            System.out.println("Już strzelałeś w to miejsce");
        }
    }
}
