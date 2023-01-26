import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class ListTests {
    
    @Test
    public void testMerge() {
        List<String> list1 = new ArrayList<>();
        list1.add("apple");
        list1.add("banana");

        List<String> list2 = new ArrayList<>();
        list2.add("onion");
        list2.add("corn");

        assertArrayEquals(new String[]{"apple", "appleonion", "onion", "onionbanana", 
                                        "banana", "bananacorn", "corn"},
                                        ListExamples.merge(list1, list2).toArray());
    }
}
