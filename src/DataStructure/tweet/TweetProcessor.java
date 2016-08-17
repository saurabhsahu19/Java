package DataStructure.tweet;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TweetProcessor implements Runnable{
	String tweet;
	Hashtable<String , HashTagCount> hashTags;
	TweetProcessor(String tweet,Hashtable hashTags){
		this.tweet = tweet;
		this.hashTags = hashTags;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		processTweet();
	}
	
	private void processTweet(){
		String regEx = "#\\w*";
		Matcher matcher = Pattern.compile(regEx).matcher(tweet);
		while(matcher.find()){
			//System.out.println(matcher.group(0));
			String hashtag = matcher.group(0);
			if(!hashTags.containsKey(hashtag.toLowerCase())){
				//create object
				HashTagCount hC = new HashTagCount(hashtag,1);
				hashTags.put(hashtag.toLowerCase(), hC);
			}
			else{
				//increase count
				HashTagCount hC = hashTags.get(hashtag.toLowerCase());
				hC.setCount(hC.getCount()+1);
			}
		}
		System.out.println(hashTags);
	}
}
