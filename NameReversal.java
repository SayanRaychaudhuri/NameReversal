import java.util.*;
public class NameReversal {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter your name.");
	String name = input.nextLine();
	String lcname = name.toLowerCase();
	for (int i=lcname.length()-1; i>=0;i--){
		System.out.print(lcname.charAt(i));
		}
	}

}

