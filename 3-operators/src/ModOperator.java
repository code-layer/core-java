
public class ModOperator {
	public static void main(String[] args) {
		int studentCount = 200;
		int batchSize = 30;
		
		int noOfbatches = studentCount / batchSize;
		
		int remainingStudents  = studentCount % batchSize;
		
		System.out.println(" No Of Batches: " + noOfbatches);
		System.out.println(" Students without Batch: "
				 + remainingStudents );

	}

}