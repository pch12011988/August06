package mydemo;

public class StringDemo {

	public static void main(String[] args) {
		String s1=new String ("prashant");
		String s2= new String ("prashant");
		System.out.println(s1==s2);//false
		System.out.println(s1.equals(s1));//true
		String s3="prashant";
		System.out.println(s1==s3);//false
		
		String s4="prashant";
		System.out.println(s3==s4);//true

	}

}
