package org.ibm.training;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String[] args) {
		String str = "divyansh+-.awasthi.arizona@blac-krock----.com9.com9.com10.au";
		String regex = "^[A-Za-z0-9-\\+]+(\\.[A-Za-z0-9-]+)*"
				+ "@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		//boolean match = Pattern.matches(regex, str);
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		int groupCount = matcher.groupCount();
		//boolean match = matcher.matches();
		while(matcher.find()) {
			for(int i=1; i<=groupCount; i++) {
				//System.out.println("Group:"+i+matcher.group(i));
			}
			/*
			 * System.out.println(matcher.group()+"\n"+matcher.groupCount()+"\n"+
			 * matcher.start()+"\n"+matcher.end());
			 */
			 
		}
		//System.out.print(Pattern.matches("\\d+", "123"));
		// TODO Auto-generated method stub
		
		String str1 = "639-446-7300";
		String regex1 = "^(\\d{3})-\\d{3}-\\d{4}$";
		Pattern pattern1 = Pattern.compile(regex1);
		Matcher matcher1 = pattern1.matcher(str1);
		while(matcher1.find()) {
			//System.out.println(matcher1.replaceFirst("$1-xxx-xxxx"));
			
		}
		
		String str2 = "[Google]      (http://google.com) [IBM]";
		//<a href="http://google.com"></a>
		String regex2 = "^\\[(.*)\\]\\s+\\((.*?)\\)$";
		Pattern pattern2 = Pattern.compile(regex2);
		Matcher matcher2 = pattern2.matcher(str2);
		while(matcher2.find()) {
			//System.out.println(matcher2.group()/*matcher1.replaceFirst("$1-xxx-xxxx")*/);
			System.out.println(matcher2.replaceFirst("<a href=\"$2>$1\"</a>"));
			
		}
		
		

	}

}
