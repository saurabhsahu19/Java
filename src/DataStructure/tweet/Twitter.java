package DataStructure.tweet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* This twitter program is written to give count of hashtags in descending order
 * Hashtags are case insensitive but result should contain the one which came first 
 * i.e. #Ind and #ind are same but #Ind will be displayed because it occurred first
 * if two hashtags are same, it should be sorted in alphabetical order
 */
public class Twitter{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tweet1 = "Excited for match between #Ind vs #WI #IndiaForWin, this should be great #ind #wi match";
		String tweet2= "Good hockey match in olympic btwn #ind and #aus , #IndiaFoRWin";
		Hashtable<String , HashTagCount> hashTags = new Hashtable<>();
		TweetProcessor tP = new TweetProcessor(tweet1, hashTags);
		Thread thread1 = new Thread(tP);
		thread1.start();
		TweetProcessor tP2 = new TweetProcessor(tweet2, hashTags);
		Thread thread2 = new Thread(tP2);
		thread2.start();		
		try {
			Thread.sleep(1000);
			Map<String, HashTagCount> m = new HashMap<>(hashTags);
			TreeMap<String, HashTagCount> map = new TreeMap<>(new ValueComparator(m));
			map.putAll(hashTags);
			System.out.println(map);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
