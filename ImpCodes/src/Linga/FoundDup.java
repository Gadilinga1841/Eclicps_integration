package Linga;

public class FoundDup {

	public static void main(String[] args) {

       int[] a= {34,56,77,89,54,32,56,34,23,21};
       int m=0;
      
       l1:for(int i=0;i<a.length;i++) {
    	   l2:for(int j=i+1;j<a.length;j++) {
    		 if(a[i]==a[j]) {
    			System.out.println(" duplicate values found");
    			m+=1;
    			break l1;
    		 }
    	   }
       }
       if(m==0)
    	  System.out.println("no duplicate values found");
	}

}

