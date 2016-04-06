package zhangxu.utils;

public abstract class MessageUtils {
	
	public static String buildAssertMessage(int para){
		return null;
	}
	
	public static String castIntArrAsLineString(int[] A){
		StringBuilder sb = new StringBuilder();
		sb.append("{");
		for(int i : A){
			sb.append(i);
			sb.append(", ");
		}
		sb.delete(sb.length() - 2, sb.length());
		sb.append("}");
		return sb.toString();
	}

}
