package DataStructure.tweet;

import java.util.Arrays;
import java.util.Hashtable;

public class Twitter{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tweet = "Excited for match between #Ind vs #WI #IndiaForWin";
		/*Hashtable<String, Integer> hashTags = new Hashtable<>();
		TweetProcessor tP = new TweetProcessor(tweet, hashTags);
		Thread thread = new Thread(tP);
		thread.start();*/
		String pattern = "[#\\W]";
		System.out.println(tweet.matches(pattern));
		System.out.println(Arrays.asList(tweet.split(pattern)));
	}

}
