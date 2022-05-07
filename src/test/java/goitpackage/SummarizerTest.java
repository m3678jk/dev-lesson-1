package goitpackage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import java.util.HashMap;
import static org.mockito.Mockito.when;

//The idea of unit testing - isolation.
//When we are testing Summarizer class we have to exclude read objects of all internal dependencies
//It will be a good practice to learn use Mockito to mock ShopItems for Summarizer class. It's very important and useful tool
//so I suggest implement it

public class SummarizerTest {
    @Mock
    private ShopItems shopItems = Mockito.mock(ShopItems.class);
    private Summarizer summarizer;

    @BeforeEach
    public void beforeEach() {
        summarizer = new Summarizer(shopItems);
    }

    @Test
    public void testThatPriceForACountedCorrect() {
        //try to extract Summarizer to global variable. But we must be sure that we have a new object for each test
        //we can use before/after each for it
        when(shopItems.getItems()).thenReturn(new HashMap<String, Item>(){{
            put("A", new Item(1.25f, 3, 3.0f));
        }
        });
        Assertions.assertEquals(1.25f, summarizer.sum("A"));
    }


    @Test
    public void testThatPriseForABCDAAACCountedCorrect() {
        // Minor: you can create the Map in global state to reuse it for second test
        when(shopItems.getItems()).thenReturn(new HashMap<String, Item>(){{
            put("A", new Item(1.25f, 3, 3.0f));
            put("B", new Item(4.25f));
            put("C", new Item(1.0f,6,5.0f));
            put("D", new Item(0.75f));
        }
        });
        Assertions.assertEquals(11.25f, summarizer.sum("ABCDAAAC"));
    }

    @Test
    public void testThatPriseForIncorrectItemWorksCorrect() {
        when(shopItems.getItems()).thenReturn(new HashMap<String, Item>(){{
            put("A", new Item(1.25f, 3, 3.0f));
            put("B", new Item(4.25f));
            put("C", new Item(1.0f,6,5.0f));
            put("D", new Item(0.75f));
        }
        });
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> summarizer.sum("1"));
    }

}
