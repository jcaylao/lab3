import static org.junit.Assert.*;

import java.lang.reflect.Array;

import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test
  public void testReverseInPlaceFail() {
    int[] input2 = {8,9,10};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{10,9,8}, input2);
  }

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedFail() {
    int[] input2 = {8, 9, 10};
    assertArrayEquals(new int[]{10,9,8}, ArrayExamples.reversed(input2));
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] input1 = {1,1,2,1,3};
    assertEquals(1.25, ArrayExamples.averageWithoutLowest(input1), 0.01);
  }
}
