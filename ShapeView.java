import javax.swing.*;
import java.awt.*;
import java.util.List;

public class ShapeView {

    JFrame frame;
    JButton snowMan;
    JButton car;
    JButton house;
    ShapeModel model;
    JPanel shapePanel;

    /**
     * Instantiates a ShapeView object to handle the display of the program
     * @param model
     */
    public ShapeView(ShapeModel model) {
        this.model = model;
        frame = new JFrame("Shape Displayer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout());

        // Create button panel and set layout to left-aligned
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));

        // Initialize buttons and set icons
        snowMan = new JButton("Snowman");
        car = new JButton("Car");
        house = new JButton("House");

        snowMan.setIcon(new SnowManShape(50));
        car.setIcon(new CarShape(50));
        house.setIcon(new HouseShape(50));

        // Add buttons to the button panel
        buttonPanel.add(snowMan);
        buttonPanel.add(car);
        buttonPanel.add(house);

        // Add the button panel to the top of the frame
        frame.add(buttonPanel, BorderLayout.NORTH);

        // Panel for displaying shapes
        shapePanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                // Draw each shape at its stored position
                List<Point> carPositions = model.getCarPositions();
                List<Point> housePositions = model.getHousePositions();
                List<Point> snowPositions = model.getSnowmanPositions();

                for (Point p : carPositions) {
                    model.getCarIcon().paintIcon(this, g, p.x, p.y);
                }

                for (Point p : housePositions) {
                    model.getHouseIcon().paintIcon(this, g, p.x, p.y);
                }

                for (Point p : snowPositions) {
                    model.getSnowIcon().paintIcon(this, g, p.x, p.y);
                }
            }
        };

        // Add shape panel to the center of the frame
        frame.add(shapePanel, BorderLayout.CENTER);

        // Set frame visibility
        frame.setVisible(true);
    }

    /**
     * Repaints the JPanel to redisplay more items.
     */
    public void refresh() {
        shapePanel.repaint();
    }
}
