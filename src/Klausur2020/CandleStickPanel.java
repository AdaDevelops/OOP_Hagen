package Klausur2020;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Panel;
import java.util.List;

public class CandleStickPanel extends Panel {
	private List<Candle> candles;
	 private CandleColorScheme scheme;
	 private double zoom;
	 
	 public CandleStickPanel(
			 List<Candle> candles, CandleColorScheme scheme, double zoom) {
			  this.candles = candles;
			  this.scheme = scheme;
			  this.zoom = zoom;
			  }

	 public void paint(Graphics g) {
		 Graphics2D g2d = (Graphics2D) g;
		 for (Candle candle : this.candles) {
			 candle.drawOnCanvas(g2d, this.scheme);
			 }
}
}

