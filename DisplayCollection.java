package project1;

import bag.Bag;
import bag.BagInterface;
import student.TestableRandom;

/**
 * // -------------------------------------------------------------------------
 * /** this represents the DisplayCollection class
 * 
 * @author himabathula
 * @version Jul 13, 2024
 */

public class DisplayCollection
{
    /**
     * array of strings created for bag
     */
    public static final String[] STRINGS =
        { "red circle", "blue circle", "red square", "blue square" };
    /**
     * itemBag of type object BagInterface created
     */
    private BagInterface<String> itemBag;

    /**
     * this method generates 5-15 strings randomly and adds them to the item bag
     */
    public DisplayCollection()
    {
        this.itemBag = new Bag<>();
        TestableRandom random = new TestableRandom();
        int randNum = random.nextInt(11) + 5;
        for (int i = 0; i < randNum; i++)
        {
            // randomly select from STRINGS array
            String randStr = STRINGS[random.nextInt(STRINGS.length)];
            itemBag.add(randStr);
        }

    }


    /**
     * this method returns the itemBag
     * 
     * @return returns itemBag
     */
    public BagInterface<String> getItemBag()
    {
        return itemBag;

    }

}
