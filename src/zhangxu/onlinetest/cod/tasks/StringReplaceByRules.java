package zhangxu.onlinetest.cod.tasks;

import java.util.ArrayList;
import java.util.List;

public class StringReplaceByRules {
	public String solution(String S) {
		Object[] rules = checkRules(S);
		int index = randomPickRule(rules);
		String result = applyRule(S, index);
		return result;
	}

	private Object[] checkRules(String S) {
		List<Integer> arrList = new ArrayList<Integer>();
		if (S.contains("AB"))
			arrList.add(1);
		if (S.contains("BA"))
			arrList.add(2);
		if (S.contains("CB"))
			arrList.add(3);
		if (S.contains("BC"))
			arrList.add(4);
		if (S.contains("AA"))
			arrList.add(5);
		if (S.contains("CC"))
			arrList.add(6);
		return arrList.toArray();
	}

	private int randomPickRule(Object[] rules) {
		int i = (int) (Math.random() * rules.length);

		return ((Integer) rules[i]).intValue();
	}

	private String applyRule(String S, int index) {
		switch (index) {
		case 1:
			return S.replaceFirst("AB", "AA");
		case 2:
			return S.replaceFirst("BA", "AA");
		case 3:
			return S.replaceFirst("CB", "CC");
		case 4:
			return S.replaceFirst("BC", "CC");
		case 5:
			return S.replaceFirst("AA", "A");
		case 6:
			return S.replaceFirst("CC", "C");
		default:
			return null;

		}
	}
}
