import java.util.Objects;

/**
 * Created by denis on 03/02/16.
 */
public class JumpPoint {

    private Point point;

    public JumpPoint(Point point) {
        this.point = point;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JumpPoint jumpPoint = (JumpPoint) o;
        return Objects.equals(point, jumpPoint.point);
    }

    @Override
    public int hashCode() {
        return Objects.hash(point);
    }
}
