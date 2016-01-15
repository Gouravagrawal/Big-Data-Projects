<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="org.apache.mahout.cf.taste.model.DataModel"%>
<%@page import="org.apache.mahout.cf.taste.impl.model.file.FileDataModel"%>
<%@page import="org.apache.mahout.cf.taste.impl.neighborhood.ThresholdUserNeighborhood"%>
<%@page import="org.apache.mahout.cf.taste.impl.recommender.GenericUserBasedRecommender"%>
<%@page import=" org.apache.mahout.cf.taste.impl.similarity.PearsonCorrelationSimilarity"%>
<%@page import="org.apache.mahout.cf.taste.neighborhood.UserNeighborhood"%>
<%@page import="org.apache.mahout.cf.taste.recommender.RecommendedItem"%>
<%@page import="org.apache.mahout.cf.taste.recommender.UserBasedRecommender"%>
<%@page import="org.apache.mahout.cf.taste.similarity.UserSimilarity"%>
<%@page import="java.io.File"%>
<%@page import="java.io.IOException"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.hashtag.recommendation.*"%>
<%
  
/* App ap=new App();
     
    List<String> hashTags = ap.getClass() */
    		
    		
    ArrayList<Integer> al=new ArrayList<Integer>();
	//HashTagstoID htag=new HashTagstoID();
	UserWithHashTags uHashtag=new UserWithHashTags();
	//htag.convert();
	int userID=100067049;
	
	DataModel model = new FileDataModel(new File("DataSet/dataset_iid.csv"));
	UserSimilarity similarity = new PearsonCorrelationSimilarity(model);
	UserNeighborhood neighborhood = new ThresholdUserNeighborhood(0.1, similarity, model);   	
 	
	
	UserBasedRecommender recommender = new GenericUserBasedRecommender(model, neighborhood, similarity);
	
  	List<RecommendedItem> recommendations = recommender.recommend(userID,3);
	for (RecommendedItem recommendation : recommendations) {
		al.add((int) recommendation.getItemID());
	  System.out.println(recommendation.getItemID());
	}
    		
 
    /* Iterator<String> iterator = hashTags.iterator();
    while(iterator.hasNext()) {
        String hashTag = (String)iterator.next();
        out.println(hashTag);
    } */
%>