package com.hashtag.recommendation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class DummyDb {

	List<String> hashtags;

	public List<String> firstMethod(HashMap<Integer, ArrayList<String>> hashMap) {

		for (int key : hashMap.keySet()) {
			hashtags = hashMap.get(key);
		}
		
		//return this.getData(query);
		return null;
	}

	public List<String> getData(String query) {
		String hTags = null;
		query = query.toLowerCase();
		List<String> matched = new ArrayList<String>();
		for (int i = 0; i < hashtags.size(); i++) {
			hTags = hashtags.get(i).toLowerCase();
			if (hTags.startsWith(query)) {
				matched.add(hashtags.get(i));
			}
		}
		
		System.out.println("@@@"+ Arrays.toString(matched.toArray()));
		
		return matched;
	}
}
