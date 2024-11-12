import javax.swing.*;
import java.awt.*;

/**
 * This interface defines the structure for composite shapes that can be drawn.
 */
public interface CompositeShape extends Icon {

    /**
     * Draws the composite shape on the specified graphics context at the given location.
     *
     * @param g the graphics context
     * @param x the x-coordinate of the shape's position
     * @param y the y-coordinate of the shape's position
     */

    void paintIcon(Component c, Graphics g, int x, int y);

    /**
     * Gets the width of the composite shape.
     *
     * @return the width of the composite shape
     */

    int getIconWidth();

    /**
     * Gets the height of the composite shape.
     *
     * @return the height of the composite shape
     */

    int getIconHeight();


}
