package string;

public class Stringcomparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="sachin";
		String s2="sachin";
		String s3=new String("sachin");
		String s4="saurav";
		System.out.println(s1.equals(s2)); //.equals checks the content of the reference
		System.out.println(s1.equals(s3));  //== operator checks the address
		System.out.println(s1.equals(s4));
		System.out.println(s1==s2); //the two reference are comparing the same string 
		System.out.println(s1==s3); //this is false because s1 is in the pool and s3 is in the heap
	}

}
