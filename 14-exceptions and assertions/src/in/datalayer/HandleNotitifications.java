package in.datalayer;

public class HandleNotitifications {
    public static void main(String[] args) {
		// String[] cityNames  = null;
		String[] cityNames  = { "Delhi", "Bombay" };
		processCityNames(cityNames);
	}

	private static void processCityNames(String[] cityNames) {
		int processFlag = 0;
		
		try {
			System.out.println("City Name:" + cityNames[5]);
			processFlag = 1;
		}catch(ArrayIndexOutOfBoundsException aroobe) {
			System.out.println("Array Index value is not available");
			aroobe.printStackTrace();
			processFlag = 2;
		}catch(NullPointerException npe){
			System.out.println("cityNames is EMPTY");
			npe.printStackTrace();
			processFlag = 3;
		}finally {
			if(processFlag==1){
				System.out.println(" *** Job Completed Successfully ***");
			}else if(processFlag==2){
				System.err.println(" *** JOB FAILED. Array Index Value in invalid. ***");
			}else if(processFlag==3){
				System.err.println(" *** JOB FAILED Data is Empty ***");
			}
		}
	}
}