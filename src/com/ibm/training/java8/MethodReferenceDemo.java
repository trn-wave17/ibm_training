package com.ibm.training.java8;

@FunctionalInterface
interface Parser{
	String parse(String str);
}

class StringParser{
	public static String convert(String str) {
		return str.length()<=3?str.toUpperCase():str.toLowerCase();
	}
}

class GenericPrint{
	void print(String str, Parser parser) {
		System.out.println(parser.parse(str));
	}
}

public class MethodReferenceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "Divyansh Awasthi";
		GenericPrint _printConsole = new GenericPrint();
		//_printConsole.print(string, (str) -> str.length()<=3?str.toUpperCase():str.toLowerCase());
		//_printConsole.print(string, StringParser::convert);
		//Parser parser = StringParser::convert;
		_printConsole.print(string, StringParser::convert);//CALL BY FUNCTION

	}

}
