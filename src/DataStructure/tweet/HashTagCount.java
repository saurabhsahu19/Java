package DataStructure.tweet;

public class HashTagCount {
 String hashTag;
 int count;
 
 
public HashTagCount(String hashTag, int count) {
	super();
	this.hashTag = hashTag;
	this.count = count;
}

public String getHashTag() {
	return hashTag;
}

public int getCount() {
	return count;
}

public void setHashTag(String hashTag) {
	this.hashTag = hashTag;
}

public void setCount(int count) {
	this.count = count;
}

@Override
public String toString() {
	return "HashTagCount [hashTag=" + hashTag + ", count=" + count + "]";
}



}
