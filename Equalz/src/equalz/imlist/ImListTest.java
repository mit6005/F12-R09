package equalz.imlist;

import static org.junit.Assert.*;

import org.junit.Test;

public class ImListTest {
    public static void main(String[] args) {
        ImList<Integer> empty = new Empty<Integer>();
        ImList<Integer> first = new Cons<Integer>(2, empty);
        ImList<Integer> second = new Cons<Integer>(3, empty);
        ImList<Integer> third = new Cons<Integer>(4, second);

        System.out.println(empty);
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }

	@Test
	public void testEquals() {
        ImList<Integer> empty = new Empty<Integer>();
        ImList<Integer> first = new Cons<Integer>(2, empty);
        ImList<Integer> second = new Cons<Integer>(3, empty);
        ImList<Integer> third = new Cons<Integer>(4, second);

        ImList<Integer> empty2 = new Empty<Integer>();
        ImList<Integer> first2 = new Cons<Integer>(2, empty);
        ImList<Integer> second2 = new Cons<Integer>(3, empty);
        ImList<Integer> third2 = new Cons<Integer>(4, second);

        assertEquals(empty, empty);
        assertEquals(first, first);

        assertEquals(empty, empty2);
        assertEquals(first, first2);
        assertEquals(second, second2);
        assertEquals(third, third2);

        assertFalse(empty.equals(first));
        assertFalse(empty.equals(first2));
        assertFalse(first.equals(second));
	}
}
