import java.util.Objects;

public class Shoot {
    int x;
    int y;

    public Shoot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shoot shoot = (Shoot) o;
        return x == shoot.x && y == shoot.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
