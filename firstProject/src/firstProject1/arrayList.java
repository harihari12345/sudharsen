package firstProject1;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> sen= new ArrayList<Integer>();
		//ArrayList sen= new ArrayList<>();
		
		
		sen.add(10);
		sen.add(15);
		sen.add(10);
				
		System.out.println(sen);
		
		for(int i=0; i<sen.size(); i++)
		{
			System.out.println(sen.get(i));
		}
		
		Iterator<Integer> sen1 =sen.iterator();
		while(sen1.hasNext())
		{
			System.out.println(sen1.next());
		}
		
		ArrayList<String> sener= new ArrayList<String>();
		sener.add("hello");
		sener.add("they");
		for(int j=0; j<sener.size();j++)
		{
			System.out.println(sener.get(j));
		}
			

	}

}
