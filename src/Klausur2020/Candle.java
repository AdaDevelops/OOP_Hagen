package Klausur2020;

import java.awt.Color;
import java.awt.Graphics2D;

public class Candle {
	 private int index;
	 private int open;
	 private int close;
	 private int high;
	 private int low;
	 
	 public Candle(int index, int open, int close, int low, int high) {
		// Test 1
		 if (open < 0 || close < 0 || high < 0 || low < 0) {
		 throw new IllegalArgumentException("Kurswerte dürfen nicht < 0 sein.");
		 }
		// Test 2
		 if (low > open || low > close) {
		 throw new IllegalArgumentException(
		"low darf nicht größer als Eröffnungs- oder Schlusskurs sein.");
		 }
		// Test 3
		 if (high < open || high < close) {
		 throw new IllegalArgumentException(
		"high darf nicht kleiner als Eröffnungs- oder Schlusskurs sein.");
		 }
		// Instanzvariablen initialisieren
		 this.index = index;
		 this.open = open;
		 this.close = close;
		 this.high = high;
		 this.low = low;
}
	 public void drawOnCanvas(Graphics2D g2d, CandleColorScheme scheme) {
		 
		// Init. der Var. candleColor je nach Kurs und Farbschema. S. Aufg.-teil 2.
		 Color candleColor = this.close > this.open ? scheme.getRiseColor() : scheme.getDeclineColor();
		 g2d.setColor(candleColor); }
		} // END class Candle
