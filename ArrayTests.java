import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 4, 5, 6 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 6, 5, 4 }, input1);
	}

  @Test
  public void testReversed() {
    int[] input1 = { 1, 2, 3 };
    int[] reversed1 = { 3, 2, 1 };
    assertArrayEquals(reversed1, ArrayExamples.reversed(input1));
  }
}
