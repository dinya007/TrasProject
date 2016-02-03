/**
 * Created by denis on 03/02/16.
 */
public class Polygon {

    private int layer;
    private Point[] coordinates;

    public Polygon(int layer, Point[] coordinates) {
        this.layer = layer;
        this.coordinates = coordinates;
    }

    public boolean isIntersected(Polygon otherPolygon) {
        return true;
    }


}
