package chapter11;

import typeinfo.pets.*;

import java.util.*;

import net.mindview.util.Print.*;

public class ListFeatures {
	public static void main(String[] args) {
		Random rand = new Random(47);
        List<Pet> pets = Pets.arrayList(7);
        Hamster h = new Hamster();
        pets.add(h);
        pets.remove(h);
        Pet p = pets.get(2);
        Pet cymric = new Cymric();
        
	}
}
