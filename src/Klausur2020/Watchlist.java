package Klausur2020;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Watchlist {
	
		List<Share> shares = new ArrayList<Share>();
		
		void addShare(Share s) {
			shares.add(s);
		}
		
		void filterShares(FilterPredicate<Share> filterPredicate) {
			List<Share> resultList = new ArrayList<>();
			for (Share s : shares) {
				if(filterPredicate.isMatching(s)) {
					resultList.add(s);
				}
			}
			
			
			shares = resultList;
			
		}
		void printShares() {
			for (Share s: shares) {
				System.out.println(s.name + "," + s.wkn + ", " + s.price);
			}
		}
	public static void main(String[] args) {
		Watchlist wl = new Watchlist();
		 wl.addShare(new Share("Facelook", "F12345", 200.0));
		 wl.addShare(new Share("Hellotrash", "H12345", 40.0));
		 wl.addShare(new Share("Microloft", "M12345", 150.0));
		 Collections.sort(wl.shares);
		 wl.printShares();
		 
		 System.out.println("_____");
		 Collections.sort(wl.shares, new Comparator<Share>() {
			 @Override
			 public int compare(Share s1, Share s2) {
			 return s1.name.compareTo(s2.name);
			 }
			 });
			 wl.printShares();
			 
			 wl.filterShares(s -> s.price > 50);
			 wl.printShares();
	}
	
}
