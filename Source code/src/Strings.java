
public class Strings {

	public static void main(String[] args) {
		
		//string literal
		String name="Max william";
		
		String s2=new String("something");
		
		//char array
		char[]c={ 'h','e','l','o'};
		String s3=new String(c);
		
		byte[]b= {65,66,67};
		String s4=new String(b);
		
		System.out.println("Name:"+name);
		System.out.println("Length of Name:"+name.length());
		
		System.out.println(s3);
		System.out.println(s4);
	}

}
