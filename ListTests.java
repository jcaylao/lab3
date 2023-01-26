import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class ListTests {
    
    @Test
    public void testFilter() {
        List<String> list1 = new ArrayList<>();
        list1.add("apple");
        list1.add("banana");
        list1.add("strawberry");
        list1.add("kiwi");

        List<String> list2 = new ArrayList<>();
        list2.add("onion");
        list2.add("corn");
        list2.add("lettuce");
        list2.add("broccoli");
    }
}
