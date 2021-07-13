import java.util.*;

class SubMap {
	private static <K,V> Map<K,V> subMap(Map<K,V> m, Collection<?> c) {
		Map<K,V> result = new HashMap<>();
		for (K key : m.keySet()) {
			if(c.contains(key)) result.put(key,m.get(key));
		}
		return result;
	}

	public static void main(String[] args) {
		List<Integer> l = new LinkedList<>();
		Map<Integer,String> map = new HashMap<>();
		SubMap sm = new SubMap();

		l.add(1);
		l.add(12);
		l.add(5);
		l.add(5);
		
		map.put(1,"brad");
		map.put(12,"micheal");
		map.put(6,"lucas");
		map.put(5,"christian");

		Map<Integer,String> mapResult = subMap(map,l);

		System.out.println(mapResult);
	}
}
