package goitpackage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//The idea of unit testing - isolation.
//When we are testing Summarizer class we have to exclude read objects of all internal dependencies
//It will be a good practice to learn use Mockito to mock ShopItems for Summarizer class. It's very important and useful tool
//so I suggest implement it
public class SummarizerTest {
    @Test
    public void testThatPriseForACountedCorrect(){
        //try to extract Summarizer to global variable. But we must be sure that we have a new object for each test
        //we can use before/after each for it
        Summarizer summarizer = new Summarizer();
        float actual = summarizer.sum("A");
        Assertions.assertEquals(1.25f, actual);
    }

    @Test
    public void testThatPriseForABCDAAACCountedCorrect() {
        Assertions.assertEquals(11.25f, new Summarizer().sum("ABCDAAAC"));
    }

    @Test
    public void testThatPriseForIncorrectItemWorksCorrect() {
        Assertions.assertThrows(
                IllegalArgumentException.class,
                ()->  new Summarizer().sum("1"));
    }
}
