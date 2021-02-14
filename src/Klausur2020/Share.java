package Klausur2020;

class Share implements Comparable<Share> {

	String name;
	String wkn;
	double price;

	Share(String name, String wkn, double price) {
		this.name = name;
		this.price = price;
		this.wkn = wkn;
	}

	@Override
	public int compareTo(Share o) {
// Liste der Wertpapiere wird absteigend sortiert
		if (this.price == o.price) {
			return 0;
		} else if (this.price < o.price) {
			return 1;
		} else {
			return -1;
		}
	}
}
