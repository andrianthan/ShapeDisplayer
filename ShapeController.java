import java.awt.event.*;


/**
 * The ShapeController class manages interactions between the ShapeModel and ShapeView.
 * Sets up action listeners for clicks and button interactions .
 */
public class ShapeController {
    ShapeModel model;
    ShapeView view;

    /**
     * Defines a ShapeController object to manage interactions between the ShapeModel and ShapeView
     * @param model
     * @param view
     */
    public ShapeController(ShapeModel model, ShapeView view) {
        this.model = model;
        this.view = view;

        // ActionListener for the Car button
        view.car.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setCurrentShape(new CarShape(50));  // Set the Car shape
                System.out.println("Current Shape: Car");
            }
        });

        view.house.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setCurrentShape(new HouseShape(50));
                System.out.println("Current Shape: House");
            }
        });

        view.snowMan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setCurrentShape(new SnowManShape(50));
                System.out.println("Current Shape: Snowman");

            }
        });

        view.shapePanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Check if the current shape is CarShape before adding a car position
                if (model.getCurrentShape() instanceof CarShape) {
                    model.addCarPosition(e.getX(), e.getY());
                    view.refresh(); // Redraw all cars at new positions
                }else if(model.getCurrentShape() instanceof HouseShape){
                    model.addHousePosition(e.getX(), e.getY());
                    view.refresh();
                }else if(model.getCurrentShape() instanceof SnowManShape)
                {
                    model.addSnowmanPosition(e.getX(), e.getY());
                    view.refresh();
                }
            }
        });
    }
}
