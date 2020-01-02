
public class DivideString {
	public static void main(String args[])
	{
		String str="ssuurraa";
		int len=str.length();
		int n=4;
		int temp=0,chars=len/n;
		
		String[] equalstr=new String [n];
		
		if(len%n!=0)
		{
			System.out.println("Sorry this string cannot be divide into"+n+"equal part");
			
		}
		else
		{
			for(int i=0;i<len;i=i+chars)
			{
				String part=str.substring(i,i+chars);
				equalstr[temp]=part;
				temp++;
			}
			System.out.println(n+"equal part of giving string are");
			for(int i=0;i<equalstr.length;i++)
			{
				System.out.println(equalstr[i]);
			}
			
		}
	}
}
