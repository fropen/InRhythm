This is a JAVA API developed to find maximum length of a word in a sentence.
You could call:
```
	import top.sde.util.MaxLenWord;
	import top.sde.util.RetWnL;
	
	
	MaxLenWord.matchLine(line).getWord() to retrive the word.
	MaxLenWord.matchLine(line).getLength() to get the length of the word.
```
As an example, you could download the jar file target/util.1.0.0.jar and execute bellow commands in your terminal window to make a simple test:
```
	java -cp ./util-1.0.0.jar top.sde.util.Example
```
The output will be like:
```
	Please input a line to find the max length word or Enter/Return to quit:
	something you input here
	RetWnL [length=9, word=something]
```
The API definition is:
```
	/**
	 * Find the max length word of input line(s). 
	 * Any continues non-word characters make the word splitters.
	 * null input treated as ""(empty string).
	 * Also support Unicode word.
	 * @param lines - input sentence
	 * @return a RetWnL - word and its length
	 */
	public static RetWnL matchLine(String lines) {
...
```
