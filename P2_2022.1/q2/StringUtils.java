package q2;

public class StringUtils {
	public static String processa(String str) {
		String s = str.toUpperCase();
		s = s.replaceAll("A", "4");
		s = s.replaceAll("E", "3");
		s = s.replaceAll("I", "1");
		s = s.replaceAll("O", "0");
		return s;
	}
	
	public static String inverte(String str) {
		char[] cs_inv = new char[str.length()];
		for(int i = str.length()-1, j = 0; i>=0 ;i--,j++) {
			cs_inv[j] = str.charAt(i);
		}
		return new String(cs_inv);
	}
	
	public static String inverte2(String str) {
		String inv = "";
		for(int i = str.length()-1; i>= 0; i--) {
			inv += (str.charAt(i));
		}
		return inv;
	}
}
