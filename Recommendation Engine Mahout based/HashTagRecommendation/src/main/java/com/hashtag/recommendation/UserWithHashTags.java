package com.hashtag.recommendation;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class UserWithHashTags {
	DummyDb db=new DummyDb();

	public List<String> convert(int userID, ArrayList<Integer> al) throws IOException {

		HashMap<Integer, ArrayList<String>> hashMap_new = new HashMap<Integer, ArrayList<String>>();
		ArrayList<String> list = new ArrayList<String>();

		for (int a : al) {
			if (a == 1) {
				list.add("#tech");
			} else if (a == 2) {
				list.add("#lap");
			} else if (a == 3) {
				list.add("#money");
			}
			else if (a == 4) {
				list.add("#win");
			} else if (a == 5) {
				list.add("#party");
			}
			else if (a == 6) {
				list.add("#cup");
			} else if (a == 7) {
				list.add("#deal");
			} else if (a == 8) {
				list.add("#style");
			} else if (a == 9) {
				list.add("#love");
			}

		}
		
		  System.out.println(userID+">><<"+ Arrays.toString(list.toArray())); 	
		
		hashMap_new.put(userID, list);
		//return db.firstMethod(hashMap_new);
		return null;

	}
}
