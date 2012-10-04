package equalz.simple;

import static org.junit.Assert.*;
import org.junit.Test;

public class PersonTest {
	public static void main(String args[]) {
		Person person1 = new Person("John", "Smith", "contact@smithsonian.com");
		Person person2 = new Person("John", "Smith", "contact@smithsonian.com");
		Person person3 = new Person("Adam", "Smith", "contact@smithsonian.com");
		Person person4 = new Person("Jane", "Eyre", "jane@penguingroup.com");
		System.out.println(person1);
		System.out.println(person2);
		System.out.println(person3);
		System.out.println(person4);
	}

	@Test
	public void testEquals() {
		Person person1 = new Person("John", "Smith", "contact@smithsonian.com");
		Person person2 = new Person("John", "Smith", "contact@smithsonian.com");
		assertEquals(person1, person2);
		assertEquals(person2, person1);
	}

	@Test
	public void testEqualsSelf() {
		Person person1 = new Person("John", "Smith", "contact@smithsonian.com");
		assertEquals(person1, person1);
	}

	@Test
	public void testNotEqualsSameEmail() {
		Person person1 = new Person("John", "Smith", "contact@smithsonian.com");
		Person person2 = new Person("Adam", "Smith", "contact@smithsonian.com");
		assertFalse(person1.equals(person2));
		assertFalse(person2.equals(person1));
	}

	@Test
	public void testNotEquals() {
		Person person1 = new Person("John", "Smith", "contact@smithsonian.com");
		Person person2 = new Person("Jane", "Eyre", "jane@penguingroup.com");
		assertFalse(person1.equals(person2));
		assertFalse(person2.equals(person1));
	}

	@Test
	public void testNotEqualsNull() {
		Person person1 = new Person("John", "Smith", "contact@smithsonian.com");
		assertFalse(person1.equals(null));
	}
}
