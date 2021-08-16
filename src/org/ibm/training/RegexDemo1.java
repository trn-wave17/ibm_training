package org.ibm.training;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* Input - char sequence - "Hello I am being searched
 * Regex - patten we need to search - "being"
 * Matcher class - 
 * boolean matches() - whether the regex matches the input string
 * boolean find() - finds the next expression that matches the regex
 * find(int start) - finds the next expression but from the starting index - start
 * String group() - returns the matched sequence
 * int start() - starting index
 * int end() - end index of matched sequence
 * int groupCount() - total number of capturing Groups
 * 
 * Pattern Class -  COmpiled version of regular expression/ defines the pattern for regex engine
 * static Pattern compile(String regex)
 * Matcher matcher(String input)
 * Static boolean matches(regex, String input)
 * String[] split() - splits the string around matches of given pattern
 * int end() - return the ending index
 * 
 * Regex Character Class
 * 
 * [abc] - a b or c(A simple class)
 * [^abc] - Any class except a b or c
 * [a-zA-Z] - a through z and A through Z
 * [a-d[m-p]] - a through d or m through p
 * [a-z&&[def]] - d e or f - intersection
 * [a-z&&[^bc]] - a through z but not b and c subtraction - a d e f gh z
 * [a-z&&[^m-p]] - a through z but not m-p
 * 
 * 
 * Regex Quantifiers
 * X? - X Occurs once or not at all
 * X+ - X occurs once or more than one time >=1
 * X* - X occurs 0 or more times >=0
 * X{n} - X occurs exactly n times
 * X{n,} - X occurs n times or more - >=n
 * X{y,z} - X occurs atleast y times but less than z times - y<=freq<=z
 * 
 * 
 * Regex Metacharacters
 * . - any character
 * \d - digit
 * \D - non-digit
 * \s - whitespace
 * \S - non white space
 * \w - word - character from a-zA-Z0-9
 * \W - non-word
 * \b- word boundary
 * \B - non-word boundary - start and end of the word
 * 
 * For accessing the group - $1, $2
 */
public class RegexDemo1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		/*
		 * Pattern pattern = Pattern.compile(regex); Matcher matcher =
		 * pattern.matcher(inputSequence); boolean isMatching = matcer.matches();
		 *//*
			 * System.out.println(Pattern.matches("^[a-zA-Z]?$", "a"));//true
			 * System.out.println(Pattern.matches("^[a-zA-Z]?$", "bA"));//true
			 * System.out.println(Pattern.matches("^[a-zA-Z]?$", "c"));//true
			 * System.out.println(Pattern.matches("^[a-zA-Z0-9]+$", "def123"));//true - -
			 * false System.out.println(Pattern.matches("^[a-zA-Z]+$", "abc"));//true
			 */		 
		// System.out.println(Pattern.matches("^[a-d[m-p]]{2,3}$", "abco"));
		
		//System.out.println(Pattern.matches("^\\w*$", "abco%"));
		
		/*
		 * 123-456-7890 -> 123-xxx-xxxx
		 * 213-456-9763 -> 213-xxx-xxxx
		 */
		System.out.println("Enter the number to be searched");
		String input = sc.next();
		String regex = "^(\\d{3})-\\d{3}-\\d{4}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		while(matcher.find()) {
			/*
			 * int groupCount = matcher.groupCount(); for(int i=1; i<=groupCount; i++) {
			 * System.out.println("Group:"+i+": "+matcher.group(i)); }
			 */		
			System.out.println(matcher.replaceFirst("$1-xxx-xxxx"));
		}
		

	}

}


