/**
 * Created by denis on 02/02/16.
 */
public class MCU implements MElement {

    private int id;
    private Point point;
    private Double diameter = 0.2;

    public MCU(Integer id, Double x, Double y) {
        this.id = id;
        this.point = new Point(x, y);
    }


    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public Point getPoint() {
        return point;
    }

    public Double getDiameter() {
        return diameter;
    }
}
