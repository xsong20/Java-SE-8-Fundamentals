package arraylist;

//lesson 5
//Java SE 8 Fundamentals: Data Manipulation and Inheritance

import java.util.ArrayList;
public class ArrayListTrial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> ay = new ArrayList<>();
		ay.add(new Integer(1));
		ay.add(1, new Integer(0));
		
		for(Integer i : ay) {
			System.out.println(i);
		}
	}

}
