
public class ArrayDeclareAndInit {
	public static void main(String[] args) {
		// declaration
		int[ ]  marks;

		// initialization
		marks = new int[3];
		marks[0] = 50;
		marks[1] = 60;
		marks[2] = 70;

		// access array elements
		for(int index=0; index<3; index++ ){
			System.out.println( marks[index] );
		}

		// in one line
		int[ ]  marks1 = { 40,50,60 };
		int[ ]  marks2 = new int[ ] { 40,50,60 };
	}

}