package Klausur2020;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

public class CandleStickTest {
	public static void main(String[] args) {
		List<Candle> candles = new ArrayList<>();

		candles.add(new Candle(0, 20, 25, 17, 31));
		candles.add(new Candle(1, 22, 28, 20, 29));
		candles.add(new Candle(2, 28, 19, 15, 30));

		Frame frame = new Frame("Candlestick-Chart");

		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		CandleStickPanel csp = new CandleStickPanel(candles, CandleColorScheme.REDGREEN, 4);
		csp.setPreferredSize(new Dimension(300, 200));

		frame.add(csp); // Panel zum Frame hinzufügen
		frame.pack();
		frame.setLocationRelativeTo(null); // In Bildschirmmitte zentrieren
		frame.setVisible(true); // Frame "sichtbar machen"
	}

}
