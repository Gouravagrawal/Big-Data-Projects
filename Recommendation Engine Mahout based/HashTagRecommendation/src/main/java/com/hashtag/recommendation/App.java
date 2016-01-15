package com.hashtag.recommendation;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.neighborhood.ThresholdUserNeighborhood;
import org.apache.mahout.cf.taste.impl.recommender.GenericUserBasedRecommender;
import org.apache.mahout.cf.taste.impl.similarity.PearsonCorrelationSimilarity;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.neighborhood.UserNeighborhood;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.UserBasedRecommender;
import org.apache.mahout.cf.taste.similarity.UserSimilarity;


public class App 
{
     	
	 public static void main( String[] args ) throws IOException, TasteException
	    {
	    	ArrayList<Integer> al=new ArrayList<Integer>();
	    	HashTagstoID htag=new HashTagstoID();
	    	UserWithHashTags uHashtag=new UserWithHashTags();
	    	htag.convert();
	    	int userID=100067049;
	    	
	    	DataModel model = new FileDataModel(new File("DataSet/dataset_id.csv"));
	    	UserSimilarity similarity = new PearsonCorrelationSimilarity(model);
	    	UserNeighborhood neighborhood = new ThresholdUserNeighborhood(0.1, similarity, model);   	
	     	
	    	
	    	UserBasedRecommender recommender = new GenericUserBasedRecommender(model, neighborhood, similarity);
	    	
	      	List<RecommendedItem> recommendations = recommender.recommend(userID,3);
	    	for (RecommendedItem recommendation : recommendations) {
	    		al.add((int) recommendation.getItemID());
	    	  System.out.println(recommendation.getItemID());
	    	}
	    uHashtag.convert(userID, al);
	    	
	    }
    
}
