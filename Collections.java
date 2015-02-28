import java.util.*;
class ListMapper{
	public int addFive(int number){
		return number+5;
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

}