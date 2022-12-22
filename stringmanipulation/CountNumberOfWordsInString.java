package stringmanipulation;

public class CountNumberOfWordsInString {
	public static void main(String[] args) {
			
			countNumberOfWords("My name is Pankaj");
			countNumberOfWords("I Love Java Programming");
			countNumberOfWords(" This	is  not   properly formatted		line ");
	
		}
	
		private static void countNumberOfWords(String line) {
			//System.out.println(line.split(" ").length); //won't work with tabs and multiple spaces
			
			String linetrtrimed = line.trim();
			int count = linetrtrimed.split("\\s+").length;
			System.out.println(count);
		}
}
