package org.chaitulabs.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Example of Comparable vs Comparator
 *
 *
 */
public class Runner {
	
	public static void main(String[] args) {
		List<Laptop> laptops=new ArrayList<>();
		laptops.add(new Laptop("Dell", 16, 800));
		laptops.add(new Laptop("Apple", 8, 1200));
		laptops.add(new Laptop("Hp", 12, 600));
		
		Collections.sort(laptops);
		
		for(Laptop l: laptops){
			System.out.println(l);
		}
		
		List<Desktop> desktops=new ArrayList<>();
		desktops.add(new Desktop("Dell", 16, 600));
		desktops.add(new Desktop("Apple", 8, 1000));
		desktops.add(new Desktop("Hp", 32, 750));
		Comparator<Desktop> priceComparator=new Comparator<Desktop>() {
			@Override
			public int compare(Desktop o1, Desktop o2) {
				if(o1.getPrice()>o2.getPrice())
				return 1;
				else
					return -1;
			}
		};
		
		Collections.sort(desktops,priceComparator);
		System.out.println("---------------------------");
		for(Desktop d: desktops){
			System.out.println(d);
		}
		
		Comparator<Desktop> ramComparator=new Comparator<Desktop>() {
			@Override
			public int compare(Desktop o1, Desktop o2) {
				if(o1.getRam()>o2.getRam())
				return 1;
				else
					return -1;
			}
		};
		
		Collections.sort(desktops,ramComparator);
		System.out.println("---------------------------");
		for(Desktop d: desktops){
			System.out.println(d);
		}
		
	}
}
