package in.datalayer;

public class ReadElectionNews {
	public static void main(String[] args) {
		int noOfOnlineUsers = 1000;
		try {
			processElectionNews(noOfOnlineUsers);
		} catch (NewsFeedException e) {
			System.out.println("*** FAILED *** ");
			System.out.println("Actual Message: " + e.getMessage());
			System.out.println("Message Code:" + e.getCustMessageCode());
			System.out.println("Additional Details:" + e.getCustDetails());
			e.printStackTrace();
		}
	}

	private static void processElectionNews(int onlineUser) throws NewsFeedException {
		if(onlineUser <= 100) {
			System.out.println(" *** Processed ALL Election News **** ");
		} else {
			NewsFeedException nfe = new NewsFeedException("More Online Users. System Failed.",
						1020, "Only Paid Online Users effected.");
			throw nfe;
		}
	}

}