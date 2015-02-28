import java.util.*;

interface ListMapper<E,K>{
	public K addFive(E number);
}

interface FilterMapper<E>{
	public boolean isEven(E number);
}

interface ListReducer<E,K>{
	public K addAll(E number,K initial);
}

public class Collections{

	public static <E,K> List<K> map(List<E> list, ListMapper<E,K> listMapper){
		List<K> result = new ArrayList<K>();
		for(E element: list){
			result.add(listMapper.addFive(element));
		}
		return result;
	}

	public static <E> List<E> filter(List<E> list, FilterMapper<E> fm){
		List<E> result = new ArrayList<E>();
		for(E element: list){
			if(fm.isEven(element) == true){
				result.add(element);
			}
		}
		return result;
	}

	public static <E,K> K reduce(List<E> list, ListReducer<E,K> reducer, K initial){
		K previous = initial;
		for(E element: list){
				previous = (reducer.addAll(element,previous));
		}
		return previous;	
	}

	// public static void main(String[] args) {
	// 	FilterMapper fm = new FMapper();
	// 	List<Integer> numbers = new ArrayList<Integer>();
	// 	numbers.add(2);
	// 	numbers.add(3);
	// 	numbers.add(5);
	// 	numbers.add(6);
	// 	List<Integer> re = filter(numbers,fm);
	// 	System.out.println(re.get(0));
	// }


}