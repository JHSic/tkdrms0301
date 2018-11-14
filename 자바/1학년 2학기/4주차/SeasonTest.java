public class SeasonTest {
	public enum Season {
		SPRING ("3-5 month"),
		SUMMER ("6-8 month"),
		FALL ("9-11 month"),
		WINTER ("12-2 month");
		private String span;
		public String getSpan() { return span; }

		Season(String span) { this.span = span; }
	}
	public static void main(String[] args) {
		for (Season s : Season.values())
	    	System.out.println(s.getSpan());
   	}
} 