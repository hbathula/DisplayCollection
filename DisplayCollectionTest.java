package project1;

import bag.BagInterface;
import java.util.Arrays;
import student.TestCase;
import student.TestableRandom;

/**
 * // -------------------------------------------------------------------------
 * /** This represents test class for DisplayCollection class
 * 
 * @author himabathula
 * @version Jul 13, 2024
 */

public class DisplayCollectionTest
    extends TestCase
{

    /**
     * intentionally left empty
     */
    @Override
    public void setUp()
    {
        /**
         * intentionally left empty
         */

    }


    /**
     * this method tests the size of the bag. It does this by overriding the
     * nextInt with a known random number (0-10)+5, and gets these random number
     * of strings into itemBag for each iteration. assertTrue then checks
     * whether the current size matches the random number.
     */

    public void testBagSize()
    {
        DisplayCollection disp = new DisplayCollection();
        BagInterface<String> myBag = disp.getItemBag();
        for (int i = 5; i <= 15; i++)
        {
            TestableRandom.setNextInts(i - 5);
            DisplayCollection dc = new DisplayCollection();
            BagInterface<String> itemBag = dc.getItemBag();
            assertEquals(i, itemBag.getCurrentSize());

        }
    }


    /**
     * this method tests the bag's contents. The bag is converted to a list so
     * each string can individually be accessed through each iteration. the
     * remove() method is then called and the string is stored in "item".
     * assertTrue statement then checks whether the STRINGS array contains the
     * item.
     */

    public void testBagContents()
    {
        DisplayCollection disp = new DisplayCollection();
        BagInterface<String> myBag = disp.getItemBag();
        String[] strings = DisplayCollection.STRINGS;

        // converts bag to a list
        int bagSize = myBag.getCurrentSize();
        for (int i = 0; i < bagSize; i++)
        {
            String item = myBag.remove();
            assertTrue(Arrays.asList(strings).contains(item));
        }

    }

}
