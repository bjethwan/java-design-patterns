package sample1;

/**
 * StringBuilder was introduced in Java 1.5 as people were not using String class correctly.
 * StringBuffer is not good as it does some locking.
 * 
 * 
 * @author bjethwan
 *
 */
public class BuilderEverydayExample {

	public static void main(String[] args) {

		StringBuilder builder = new StringBuilder();
		builder.append("This is an example ");
		builder.append("of the builder pattern. ");
		builder.append("It has methods to append ");
		builder.append("almost we want to a S†ring. ");
		builder.append(42);
		
		System.out.println(builder.toString());

	}
}
