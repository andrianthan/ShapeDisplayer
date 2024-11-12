/**
 * ShapeDisplayer class initializes a ShapeModel, ShapeView, ShapeController.
 * Manages display and interaction of different shapes within the GUI.
 */
public class ShapeDisplayer {
    public static void main(String args[])
    {
        ShapeModel model = new ShapeModel();
        ShapeView view = new ShapeView(model);
        ShapeController controller = new ShapeController(model, view);

    }

}
