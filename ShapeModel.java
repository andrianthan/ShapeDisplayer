import javax.swing.*;
import java.awt.*;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * ShapeModel class manages the positions and icons of different shapes
 * ShapeModel manages car shapes, house shapes, snowman shapes.
 */
public class ShapeModel {
    private List<Point> carPositions = new ArrayList<>();
    private List<Point> housePositions = new ArrayList<>();
    private List<Point> snowmanPositions = new ArrayList<>();
    private Icon currentShape;
    private Icon carIcon = new CarShape(50);
    private Icon houseIcon = new HouseShape(50);
    private Icon snowIcon = new SnowManShape(50);

    /**
     * Returns the car icon shape.
     * @return car icon
     */
    public Icon getCarIcon(){
        return carIcon;
    }

    /**
     * Returns the house icon shape.
     * @return house icon
     */
    public Icon getHouseIcon(){
        return houseIcon;
    }

    /**
     * Returns the snowman icon shape.
     * @return snowman icon
     */
    public Icon getSnowIcon(){
        return snowIcon;
    }

    /**
     * Adds a car position to list of car positions
     * @param x
     * @param y
     */
    public void addCarPosition(int x, int y) {
        carPositions.add(new Point(x, y));
    }

    /**
     * Adds a house position to list of car positions
     * @param x
     * @param y
     */
    public void addHousePosition(int x, int y) {
        housePositions.add(new Point(x, y));
    }

    /**
     * Adds a snowman position to list of car positions
     * @param x
     * @param y
     */
    public void addSnowmanPosition(int x, int y)
    {
        snowmanPositions.add(new Point(x, y));
    }

    /**
     * Returns a list of all car positions
     * @return list of car positions
     */
    public List<Point> getCarPositions() {
        return carPositions;
    }

    /**
     * Returns a list of all house positions
     * @return list of house positions
     */
    public List<Point> getHousePositions(){
        return housePositions;
    }

    /**
     * Returns a list of all snowman positions
     * @return list of snowman positions
     */
    public List<Point> getSnowmanPositions(){
        return snowmanPositions;
    }

    /**
     * Sets current shape to a specified shape
     * @param shape
     */
    public void setCurrentShape(Icon shape) {
        this.currentShape = shape;
    }

    /**
     * Returns the curent shape that the user has selected
     * @return current shape
     */
    public Icon getCurrentShape() {
        return currentShape;
    }
}
