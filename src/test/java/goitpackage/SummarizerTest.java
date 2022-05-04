package goitpackage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SummarizerTest {
    @Test
    public void testThatPriseForACountedCorrect(){
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
