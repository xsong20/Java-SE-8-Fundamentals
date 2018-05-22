package arraylist;

//lesson 5
//Java SE 8 Fundamentals: Data Manipulation and Inheritance

import java.util.ArrayList;
public class ArrayListSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// test the output of .toString() method
		ArrayList al1 = new ArrayList();
		System.out.println(al1.toString());

		// 
		ArrayList<String> al2 = new ArrayList<String>();
		System.out.println(al2.toString());
		
		// 
		ArrayList<Integer> ay = new ArrayList<>();
		ay.add(new Integer(1));
		ay.add(1, new Integer(0));
		
		for(Integer i : ay) {
			System.out.println(i);
		}
	}

}
