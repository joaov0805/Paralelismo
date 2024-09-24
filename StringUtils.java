package paralelismo;

public class StringUtils {

	public static String processa(String str) {
		// Atenção - índices vão de 0 até length MENOS UM!
		String saida = "";
		String strUpper = str.toUpperCase();
		for (int i = 0; i <= strUpper.length() - 1; i++) {
			String s = String.valueOf(strUpper.charAt(i)); // convertemos char de volta para String
			if (s.equals("A")) {
				saida = saida + "4";
			} else if (s.equals("E")) {
				saida = saida + "3";
			} else if (s.equals("I")) {
				saida = saida + "1";
			} else if (s.equals("O")) {
				saida = saida + "0";
			} else {
				saida = saida + s;
			}
			
		}
		return saida;
	}
	
	public static String inverte(String str) {
		String invertida = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			invertida = invertida + str.charAt(i);
		}
		return invertida;
	}
}
