package DataStructure;

import java.util.Arrays;

public class RotatingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArray = new int[]{1,2,3,4,5,7,8};		
		int rotateTimes = 3;
		System.out.println(numArray);
		//reverse(numArray,0,2);
		rotate(numArray,rotateTimes);
		System.out.println(Arrays.toString(numArray));		
	}

	static void rotate(int[] numArray, int rotateTimes){
		int length = numArray.length;
		int temp = numArray[length-1];
		// first:  reverse the array
		reverse(numArray,0,length-1);
		// second: reverse from 0th to (rotateTimes-1) th position
		reverse(numArray,0,rotateTimes-1);
		// third: reverse from rotateTimes position to (l-1)th position
		reverse(numArray,rotateTimes,length-1);	
		
		// above code is for right side rotation, for left side rotation, put first step in last and rest same
		}
	/**
	 * 
	 * @param numArray : array
	 * @param start : start position
	 * @param end: end position
	 */
	static void reverse(int[] numArray, int start, int end){
		int temp = 0;
		for(;start!=end && start<end;start++,end--){
			temp = numArray[start];
			numArray[start] = numArray[end];
			numArray[end] = temp;
		}
		System.out.println(Arrays.toString(numArray));
	 }
}
	
