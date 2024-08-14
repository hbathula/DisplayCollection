package project1;

import bag.BagInterface;
import cs2.*;
import java.awt.Color;

// -------------------------------------------------------------------------
/**
 * This represents the ShapeWindow class
 * 
 * @author himabathula
 * @version Jul 12, 2024
 */
public class ShapeWindow
{
    /**
     * GUI components are created Bag (itemBag) is created
     */
    private Window window;
    private TextShape textshape;
    private Button quitButton;
    private Button chooseButton;
    private BagInterface<String> itemBag;

    /**
     * ShapeWindow Constructor
     * 
     * @param itemBag
     *            contains the bag of shape strings
     */

    public ShapeWindow(BagInterface<String> itemBag)
    {
        /**
         * instantiates GUI components add them to the window pane
         */
        window = new Window();
        window.setTitle("Project 1");
        this.itemBag = itemBag;
        quitButton = new Button("Quit");
        quitButton.onClick(this, "clickedQuit");
        window.addButton(quitButton, WindowSide.NORTH);
        chooseButton = new Button("Choose");
        chooseButton.onClick(this, "clickedChoose");
        window.addButton(chooseButton, WindowSide.SOUTH);
        textshape = new TextShape(0, 0, "");
        window.addShape(textshape);

    }


    /**
     * this method exits GUI window, when quit button is clicked
     * 
     * @param button
     *            refers to quit button
     */

    public void clickedQuit(Button button)
    {
        System.exit(0);

    }


    /**
     * this method will run when choose button is selected. If bag (itemBag) is
     * not empty the string is removed() from the bag, and put in textshape. The
     * colorText() is then executed. If there are no strings present in the bag,
     * then textshape will be set as "no more items". The color of this text
     * will be black, and all this text will be centered on the GUI pane
     * 
     * @param button
     *            represents clicked choose button on GUI
     */

    public void clickedChoose(Button button)
    {
        if (!itemBag.isEmpty())
        {
            String string = itemBag.remove();
            textshape.setText(string);
            colorText();

        }

        else
        {
            textshape.setText("No more items");
            textshape.setForegroundColor(Color.BLACK);

        }

        centerText();

    }


    /**
     * this compares the text stored in textShape with each color. If "red",
     * "blue", or "black" is contained in the text, then the string is set to
     * the respective color.
     */

    public void colorText()
    {
        String getText = textshape.getText();

        if (getText.contains("red"))
        {
            textshape.setForegroundColor(Color.RED);
        }
        else if (getText.contains("blue"))
        {
            textshape.setForegroundColor(Color.BLUE);
        }
        else
        {
            textshape.setForegroundColor(Color.BLACK);
        }

    }


    /**
     * this method centers the text in the middle of the GUI pane
     */

    public void centerText()
    {
        int x = (window.getGraphPanelWidth() - textshape.getWidth()) / 2;
        int y = (window.getGraphPanelHeight() - textshape.getHeight()) / 2;

        textshape.setX(x);
        textshape.setY(y);

    }

}
