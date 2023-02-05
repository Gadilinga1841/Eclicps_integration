package Linga;


class ToUppar{
	void toUpper( String args)
	{
	   StringBuilder sb=new StringBuilder();
	   for(int i=0;i<args.length();i++) {
		  if(args.charAt(i)>=97&&args.charAt(i)<=122) {
			  sb.append((char)((args.charAt(i)-32)));
		  }
		  else if(args.charAt(i)>=65 && args.charAt(i)<97) {
			  sb.append((args.charAt(i)));
		  }
		  else
			  sb.append(args.charAt(i));
		 
		  
		  
	   }
	   System.out.println(sb);
	}
	
	void toLower(String args)
	{
		
		   StringBuilder sb=new StringBuilder();
		   for(int i=0;i<args.length();i++) {
			  if(args.charAt(i)>=97&&args.charAt(i)<=122) {
				  sb.append((args.charAt(i)));
			  }
			  else if(args.charAt(i)>=65 && args.charAt(i)<97) {
				  sb.append((char)((args.charAt(i))+32));
			  }
			  else
				  sb.append(args.charAt(i));
			  
		   }
		   System.out.println(sb);
		}
	
}

public class TypeChange{
	
	
	
	public static void main(String args []) {
		ToUppar obj1=new ToUppar();
     obj1.toUpper(args[0]);
     obj1.toLower(args[0]);


	 
		
}
		
		
	
	
}
