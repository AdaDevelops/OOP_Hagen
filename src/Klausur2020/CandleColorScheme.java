package Klausur2020;

import java.awt.Color;

enum CandleColorScheme {
	 REDGREEN, MONOCHROME;
	 public Color getRiseColor() {
	 return (this == MONOCHROME) ? Color.WHITE : Color.GREEN;
	 }
	 public Color getDeclineColor() {
	 return (this == MONOCHROME) ? Color.BLACK : Color.RED;
	 }
	
}
