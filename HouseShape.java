import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;


/**
 * Definition for a house object that implements CompositeShape
 */
public class HouseShape implements CompositeShape {
    private int width;

    /**
     * Creates an instance of the House shape object based on a given width
     * @param width
     */
    public HouseShape(int width) {
        this.width = width;
    }

    /**
     * Returns the width of the house shape object.
     * @return width
     */
    @Override
    public int getIconWidth() {
        return width;
    }


    /**
     * Returns the height of the house icon object.
     * @return height
     */
    @Override
    public int getIconHeight() {
        return width;  // Height is approximately equal to the width to make it square-like
    }

    /**
     * Paints the house icon object on the JPanel based on where user clicks.
     * @param c  a {@code Component} to get properties useful for painting
     * @param g the graphics context
     * @param x the x-coordinate of the shape's position
     * @param y the y-coordinate of the shape's position
     */
    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        Graphics2D g2 = (Graphics2D) g;

        // Define colors
        Color wallColor = Color.BLUE;
        Color roofColor = Color.DARK_GRAY;
        Color doorColor = Color.BLACK;

        // Draw the main body of the house (rectangle)
        g2.setColor(wallColor);
        Rectangle2D.Double body = new Rectangle2D.Double(x, y + width / 3, width, width / 2);
        g2.fill(body);

        // Draw the roof of the house (triangle)
        g2.setColor(roofColor);
        Polygon roof = new Polygon();
        roof.addPoint(x, y + width / 3);               // Left corner of the roof
        roof.addPoint(x + width / 2, y);               // Top corner of the roof
        roof.addPoint(x + width, y + width / 3);       // Right corner of the roof
        g2.fill(roof);

        // Draw the door (small rectangle at the bottom center of the house)
        g2.setColor(doorColor);
        Rectangle2D.Double door = new Rectangle2D.Double(x + width / 2.5, y + width / 2, width / 5, width / 4);
        g2.fill(door);

        // Draw windows (small squares on each side of the door)
        //g2.setColor(Color.WHITE);
        //Rectangle2D.Double leftWindow = new Rectangle2D.Double(x + width / 6, y + width / 2.5, width / 6, width / 6);
        //Rectangle2D.Double rightWindow = new Rectangle2D.Double(x + width * 2 / 3, y + width / 2.5, width / 6, width / 6);
        //g2.fill(leftWindow);
        //g2.fill(rightWindow);




        // Draw the bottom circle (body)
        g2.setColor(Color.WHITE);
        Ellipse2D.Double bottomCircle = new Ellipse2D.Double(x + width * 2 / 3, y + width / 2.5, width / 6, width / 6);
        g2.fill(bottomCircle);
        g2.setColor(Color.WHITE);
        g2.draw(bottomCircle);

        // Draw the top circle (head)
        g2.setColor(Color.WHITE);
        Ellipse2D.Double topCircle = new Ellipse2D.Double(x + width / 6, y + width / 2.5, width / 6, width / 6);
        g2.fill(topCircle);
        g2.setColor(Color.WHITE);
        g2.draw(topCircle);
    }
}
