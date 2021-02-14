package HagenKLausuren;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWTTest {

	public static void main(String[] args) {
		AWT f = new AWT();
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		f.setVisible(true);
	}
}
