import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterCount {

	public static void main(String[] args) {

		String str = "Multibank io @#$";

		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (ch == ' ') {
				continue;
			}

			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.print(entry.getKey() + ":" + entry.getValue() + ", ");
		}
	}
}
