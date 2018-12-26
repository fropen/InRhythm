package top.sde.util;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Example 
{
    public static void main( String[] args )
    {
    	Scanner scan = new Scanner(System.in);
    	while (true) {
    		System.out.println("Please input a line to find the max length word or Enter/Return to quit:");
    		String line = scan.nextLine();
    		System.out.println(MaxLenWord.matchLine(line));
    		System.out.println("");
    		if (line.length() == 0) {
    			break;
    		}
    	}
        System.out.println( "" );
        scan.close();
    }
}
