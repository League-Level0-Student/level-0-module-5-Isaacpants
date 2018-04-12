import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] args) {
		
		for (int i = 2; i < 1000; i++) {
			String s = JOptionPane.showInputDialog("Give me a #");
			int n = Integer.parseInt(s);

			for (int j = 2; j < n-1; j++) {

				if (n % j == 0) {
					JOptionPane.showMessageDialog(null, "not prime");
				break;
				}
			}
			JOptionPane.showMessageDialog(null, "its prime");

		}
	}
}