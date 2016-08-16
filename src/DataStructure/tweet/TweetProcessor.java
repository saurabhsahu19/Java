package DataStructure.tweet;

import java.util.Hashtable;

public class TweetProcessor implements Runnable{
	String tweet;
	Hashtable hashTags;
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
		
	}
}
