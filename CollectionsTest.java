import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class CollectionsTest{

	@Test
	public void map_will_perform_given_operation_for_each_element_n_the_list(){
		List<Integer> l1 = new ArrayList<Integer>();
		ListMapper lm = new ListMapper();
		l1.add(2);
		l1.add(12);
		l1.add(4);
		l1.add(5);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(7);
		expected.add(17);
		expected.add(9);
		expected.add(10);
		List<Integer> result = Collections.map(l1 , lm);
		assertEquals(expected.get(0),result.get(0));
	}

	@Test
	public void map_returns_an_Integer_List_after_Sqauring_on_the_given_list(){
		ListMapper listMapper = new ListMapper();
		List<Integer> numbers = new ArrayList<Integer>();
		List<Integer> expected = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		expected.add(6);
		expected.add(7);
		expected.add(8);
		List<Integer> result = Collections.map(numbers,listMapper);
		assertEquals(expected.get(0),result.get(0));
		assertEquals(expected.get(1),result.get(1));
	}

}




