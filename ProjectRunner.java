package project1;

/**
 * // -------------------------------------------------------------------------
 * /** This represents the ProjectRunner class
 * 
 * @author himabathula
 * @version Jul 13, 2024
 */
public class ProjectRunner
{
    /**
     * main method will run and display the collection of strings on the GUI
     * pane
     */

    public static void main(String[] args)
    {

        DisplayCollection display = new DisplayCollection();
        ShapeWindow shapeWindow = new ShapeWindow(display.getItemBag());

    }

}
