import javax.swing.JOptionPane;

public class Vowels {
	public static void main(String[] args) {

		String s = JOptionPane.showInputDialog("Give me a sentence");
		boolean a = s.contains("a");
		boolean e = s.contains("e");
		boolean i = s.contains("i");
		boolean o = s.contains("o");
		boolean u = s.contains("u");
		if (a || e || i || o || u) {
		System.out.println("vowels");
		
		}else {
			
		System.out.println("NO VOWELS");
		}
	}
}
