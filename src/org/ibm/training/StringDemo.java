package org.ibm.training;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "aac";
		String s2 = "abc";//interned/cached->immutable->Thread safe->Secure
		s2 = "aef";
		String s3 = new String("abc");//never recommended
		System.out.println(s3.length());
		/*
		 * System.out.println(s1==s2);//true System.out.println(s1.equals(s2));
		 * System.out.println(s1==s3);//false System.out.println(s1.equals(s3));//true
		 */		char ch = s1.charAt(0);//a
		/*
		 * boolean isEqual = s1.equals(s2);//false int res = s1.compareTo(s2); String su
		 * = s1.toUpperCase(); String sl = s1.toLowerCase(); String sc = s1.concat(s2);
		 * String scplus = s1+s2; System.out.println(ch); System.out.println(isEqual);
		 * System.out.println(res); System.out.println(su); System.out.println(sl);
		 * System.out.println(s1); System.out.println(s2); String str =
		 * "This session is based on strings"; String[] strArr = str.split("se");
		 * for(int i=0; i<strArr.length; i++) System.out.println(strArr[i]); String str1
		 * = str.replace('s', 'd'); System.out.println(str1); String str3 =
		 * str.substring(1,5); System.out.println(str3);
		 * 
		 * //StringBuilder //StringBuffer StringBuilder sbi = new
		 * StringBuilder("abc");//Not-thread safe, better performance sbi.append("xyz");
		 * StringBuffer sbf = new StringBuffer("abc");//Synchronized - Thread safe
		 * sbf.append("xyz"); System.out.println(sbi); System.out.println(sbf);
		 * 
		 * //int->Integer Float f = new Float(1.5); Float f1 = Float.valueOf(1.5f);
		 * Integer i = new Integer(10); Integer i1 = Integer.valueOf(10); Character chs
		 * = new Character('A'); Double d = new Double(1.5); Boolean b = new
		 * Boolean(true); Byte b1 = new Byte((byte) 127); Short sh = new Short((short)
		 * 235);
		 */
		
		
		/*
		 * int num = 10; Integer num1 = new Integer(num);//boxing Integer num2 =
		 * num;//Autoboxing Integer num2_ = num; System.out.println(num1==num2);
		 * System.out.println(num1.equals(num2)); System.out.println(num2_==num2);
		 * System.out.println(num2_.equals(num2)); int num3 = new
		 * Integer(10).intValue();//unboxing int num4 = new Integer(10);//Autounboxing
		 * System.out.println(num1+" "+num2+" "+num3+" "+num4);
		 * 
		 * Float f = new Float(1.5f); Character ch = new Character('A');
		 */
		
		 Integer i = 10;
		 int i1 = 10;
		 System.out.println(i==i1);
		 System.out.println(i+4);
		
	}

}
