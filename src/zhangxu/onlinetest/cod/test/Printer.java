package zhangxu.onlinetest.cod.test;

public abstract class Printer {
	public static void printIntArrInLine(int[] A) {
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		for (int i : A) {
			sb.append(i + " , ");
		}
		sb.delete(sb.length() - 2, sb.length());
		sb.append("}");
		System.out.println(sb.toString());
	}
}
