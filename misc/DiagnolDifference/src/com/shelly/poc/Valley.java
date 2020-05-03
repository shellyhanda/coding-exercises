package com.shelly.poc;

/**
 * Sample Input

8
UDDDUDUU

Sample Output

1

Explanation

If we represent _ as sea level, a step up as /, and a step down as \, Gary's hike can be drawn as:

_/\      _
   \    /
    \/\/
 * @author zh722e
 *
 */
public class Valley {

	static String input="UDDDUDUU";
	static int count=0;
	static int valleyCount=0;
	static boolean iminValley= false;
	
	public static void main(String[] arg) {
		
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)=='U')
			{
				
				count++;
			}
			else if(input.charAt(i)=='D')
			{
				count--;
			}
			if(count <0) 
			{
				iminValley =true;
			}
			if(iminValley && count ==0 )
			{
				valleyCount++;
				iminValley =false;
			}
			
		}
		
		System.out.println("Vally count="+valleyCount);
		
		
	}
	
}
