import java.util.*;
class ListMapper{
	public int addFive(int number){
		return number+5;
	}
}

class FilterMapper{
	public boolean isEven(int number){
		return number%2==0;
	}
}

public class Collections{

	public static List<Integer> map(List<Integer> list, ListMapper listMapper){
		List<Integer> result = new ArrayList<Integer>();
		for(int element: list){
			result.add(listMapper.addFive(element));
		}
		return result;
	}

	public static List<Integer> filter(List<Integer> list, FilterMapper fm){
		List<Integer> result = new ArrayList<Integer>();
		for(int element: list){
			if(fm.isEven(element) == true){
				result.add(element);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		FilterMapper fm = new FilterMapper();
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(2);
		numbers.add(3);
		numbers.add(5);
		numbers.add(6);
		List<Integer> re = filter(numbers,fm);
		System.out.println(re.get(0));
	}


}