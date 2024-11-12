import java.awt.*;
import java.awt.geom.*;

/**
 * Represents a car shape that is displayed on the JPanel based on where
 * the user clicks.
 */
public class CarShape implements CompositeShape {
    // Implementation based on Cay S. Horstmann (2003). Object-Oriented Design & Patterns. 3rd ed.

    int width;

    /**
     * Creates a car object.
     * @param width
     */
    public CarShape (int width)
    {
       this.width = width;
    }


    /**
     * Returns the width of the car shape icon.
     * @return width
     */
    @Override
    public int getIconWidth() {
        return width;
    }

    /**
     * Returns the height of the car shape icon.
     * @return height
     */
    @Override
    public int getIconHeight()
    {
        return width / 2;
    }

    /**
     * Paints the car shape icon on the JPanel, based on where the user clicks.
     * @param c  a {@code Component} to get properties useful for painting
     * @param g the graphics context
     * @param x the x-coordinate of the shape's position
     * @param y the y-coordinate of the shape's position
     */
    public void paintIcon(Component c, Graphics g, int x, int y)
    {
        Graphics2D g2 = (Graphics2D) g;

        Color bodyColor = Color.RED;
        Color tireColor = Color.BLACK;
        g2.setColor(bodyColor);
        Rectangle2D.Double body = new Rectangle2D.Double(x, y + width / 4, width, width / 4);
        g2.fill(body);
        g2.setColor(tireColor);
        Ellipse2D.Double frontTire = new Ellipse2D.Double(x + width / 6, y + width / 2.5, width / 6, width / 6);
        Ellipse2D.Double rearTire = new Ellipse2D.Double(x + width * 2 / 3, y + width / 2.5, width / 6, width / 6);
        g2.fill(frontTire);
        g2.fill(rearTire);

        g2.setColor(Color.BLACK);
        Point2D.Double r1 = new Point2D.Double(x + width / 4, y + width / 4);
        Point2D.Double r2 = new Point2D.Double(x + width / 3, y);
        Point2D.Double r3 = new Point2D.Double(x + width * 2 / 3, y);
        Point2D.Double r4 = new Point2D.Double(x + width * 3 / 4, y + width / 4);

        Line2D.Double frontWindshield = new Line2D.Double(r1, r2);
        Line2D.Double roofTop = new Line2D.Double(r2, r3);
        Line2D.Double rearWindshield = new Line2D.Double(r3, r4);

        g2.draw(frontWindshield);
        g2.draw(roofTop);
        g2.draw(rearWindshield);


    }

}
