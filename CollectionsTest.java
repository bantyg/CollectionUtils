import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class CollectionsTest{

	@Test
	public void map_will_perform_given_operation_for_each_element_n_the_list(){
		List<Integer> l1 = new ArrayList<Integer>();
		ListMapper lm = new MMapper();
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
	public void map_returns_an_Integer_List_after_addint_five_to_ech_ele_of_given_list(){
		ListMapper listMapper = new MMapper();
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

	@Test
	public void filter_will_perform_given_operation_for_each_element_n_the_list(){
		List<Integer> l1 = new ArrayList<Integer>();
		FilterMapper fm = new FMapper();
		l1.add(2);
		l1.add(12);
		l1.add(4);
		l1.add(5);
		List<Integer> result = Collections.filter(l1 , fm);
		assertEquals((Integer)2,result.get(0));
	}

	@Test
	public void filter_returns_an_Integer_List_after_checking_even_or_odd_on_the_given_list(){
		FilterMapper filterMapper = new FMapper();
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		List<Integer> result = Collections.filter(numbers,filterMapper);
		assertEquals((Integer)2,result.get(0));
	}
}




