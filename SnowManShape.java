import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;


/**
 * Represents the class that handles information about the snowman object.
 */
public class SnowManShape implements CompositeShape {
    private int width;

    /**
     * Instantiates a snowman object based on a given width.
     * @param width
     */
    public SnowManShape(int width) {
        this.width = width;
    }

    /**
     * Returns the width of the snowman object.
     * @return width
     */
    @Override
    public int getIconWidth() {
        return width;
    }

    /**
     * Returns the height of the snowman object
     * @return height
     */
    @Override
    public int getIconHeight() {
        return (int) (width * 1.5);  // Height is slightly more than width to fit both circles
    }

    /**
     * Displays the snowman object on the JPanel.
     * @param c  a {@code Component} to get properties useful for painting
     * @param g the graphics context
     * @param x the x-coordinate of the shape's position
     * @param y the y-coordinate of the shape's position
     */
    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        Graphics2D g2 = (Graphics2D) g;

        // Define color for the snowman
        g2.setColor(Color.WHITE);

        // Draw the bottom circle (body)
        Ellipse2D.Double bottomCircle = new Ellipse2D.Double(x, y + width / 2, width, width);
        g2.fill(bottomCircle);
        g2.setColor(Color.BLACK);
        g2.draw(bottomCircle);

        // Draw the top circle (head)
        g2.setColor(Color.WHITE);
        Ellipse2D.Double topCircle = new Ellipse2D.Double(x + width / 4, y, width / 2, width / 2);
        g2.fill(topCircle);
        g2.setColor(Color.BLACK);
        g2.draw(topCircle);
    }
}
