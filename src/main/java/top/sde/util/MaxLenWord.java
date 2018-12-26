/**
 * 
 */
package top.sde.util;

import java.util.Comparator;
import java.util.stream.Stream;

/**
 * @author wbm
 *
 */
public class MaxLenWord {
	/**
	 * Find the max length word of input line(s). 
	 * Any continues non-word characters make the word splitters.
	 * null input treated as ""(empty string).
	 * Also support Unicode word.
	 * @param lines - input sentence
	 * @return a RetWnL - word and its length
	 */
	public static RetWnL matchLine(String lines) {
		
		if (lines == null) {
			lines = "";
		}
		String[] words = lines.split("[^\\p{L}]+");

		String longWord = Stream.of(words).max(Comparator.comparingInt(String::length)).orElse("");
		
		return new RetWnL(longWord);
	}

}
