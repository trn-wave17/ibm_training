package org.ibm.training;

public class StringBufferDemo {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str = new StringBuffer("abc");//Faster than string, Mutable, Synchronized - Thread safe
		str.append("xyz");
		System.out.println(str);
		StringBuilder builder = new StringBuilder("xyz");//Mutable, More-efficient
		builder.append("abc");
		System.out.println(builder);
		
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");
		System.out.println(s1==s2);
		System.out.println(s3==s2);
		
		Integer n = 10;
		Integer n1 = new Integer(10);
		int n2 = 10;
		int n3 = new Integer(10).intValue();
		System.out.println(n==n1);
		System.out.println(n2==n);
		
		String s = "select count(*) from iml.csv";
		String[] arr = s.split("\s");
		for(String s10: arr) {
			System.out.println(s10);
		}

	}

}
