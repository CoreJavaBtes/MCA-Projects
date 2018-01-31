package STRING;

public class revcapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s[] = "i am in btes".split(" ");
	     String s1= "";
	     for(int i=s.length-1;i>=0;i--)
	     {
	    	 s1+=s[i]+" ";
	     }
	     String s2 = "i am in btes";
	     String srr1[] = s2.split(" ");
	     System.out.print(srr1[srr1.length-1].toUpperCase());
	     for(int i = srr1.length-2; i>=0; i--)
	     {
	    	 System.out.print(" "+srr1[i].substring(0, 1).toUpperCase()+srr1[i].substring(1));
	     }
	     System.out.println();
	     System.out.println(s1);
		}

	}


