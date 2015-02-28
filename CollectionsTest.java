import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

class Functions implements ListMapper<Integer,Integer>, FilterMapper<Integer>,ListReducer<Integer,Integer>{

		public Integer addFive(Integer number){
			return number+5;
		}

		public boolean isEven(Integer number){
			return number%2==0;
		}

		public Integer addAll(Integer number,Integer initial){
			return number+initial;
		}
}


public class CollectionsTest{

	@Test
	public void map_will_perform_given_operation_for_each_element_n_the_list(){

		Functions f = new Functions();
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(2);
		l1.add(12);
		l1.add(4);
		l1.add(5);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(7);
		expected.add(17);
		expected.add(9);
		expected.add(10);
		List<Integer> result = Collections.map(l1 , f);
		assertEquals(expected.get(0),result.get(0));
	}

	@Test
	public void map_returns_an_Integer_List_after_addint_five_to_ech_ele_of_given_list(){
		Functions f = new Functions();
		List<Integer> numbers = new ArrayList<Integer>();
		List<Integer> expected = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		expected.add(6);
		expected.add(7);
		expected.add(8);
		List<Integer> result = Collections.map(numbers,f);
		assertEquals(expected.get(0),result.get(0));
		assertEquals(expected.get(1),result.get(1));
	}

	@Test
	public void filter_will_perform_given_operation_for_each_element_n_the_list(){
		List<Integer> l1 = new ArrayList<Integer>();
		Functions f = new Functions();
		l1.add(2);
		l1.add(12);
		l1.add(4);
		l1.add(5);
		List<Integer> result = Collections.filter(l1 , f);
		assertEquals((Integer)2,result.get(0));
	}

	@Test
	public void filter_returns_an_Integer_List_after_checking_even_or_odd_on_the_given_list(){
		Functions f = new Functions();
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		List<Integer> result = Collections.filter(numbers,f);
		assertEquals((Integer)2,result.get(0));
	}

	@Test
	public void reduce_will_return_addition_of_all_elements_of_the_collection(){
		Functions f = new Functions();
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		Integer result = Collections.reduce(numbers,f,0);
		assertEquals(result,(Integer)6);
	}
}




