package top.sde.util;

public class RetWnL {

	private int length;
	private String word;
	
	public RetWnL(String w) {
		if (w == null) {
			w = "";
		}
		this.word = w;
		this.length = w.length();
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}
	
	@Override
	public String toString() {
		return "RetWnL [length=" + length + ", word=" + word + "]";
	}

}
