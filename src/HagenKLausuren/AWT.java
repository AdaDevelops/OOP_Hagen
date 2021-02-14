package HagenKLausuren;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;

public class AWT extends Frame {
	protected Button b1;
	protected TextField t1, t2, t3;

	public AWT() {
		setLayout(new FlowLayout());
		setSize(300,300);
		b1 = new Button("addierer");
		t1 = new TextField("4",4);
		t2 = new TextField("2",2);
		t3 = new TextField(4);
		t3.setEditable(false);
		
		add(t1);
		add(t2);
		add(t3);
		add(b1);
	}
	
}
