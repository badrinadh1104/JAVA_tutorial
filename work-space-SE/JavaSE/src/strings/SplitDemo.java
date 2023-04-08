package strings;

public class SplitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "this is an Orange juice";
		String cmp="orange";
		String[] words = name.split(" ");
		for (String string : words) {
			if(string.equalsIgnoreCase(cmp)) {
				System.out.println("present");
			}
		}

	}

}
