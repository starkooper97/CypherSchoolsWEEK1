package First;

public class Abstractioneg{
	interface olaCustomer{
		void bookCab();
		void findARide();
		void rentCab();
		void rateDriver();
		void scheduleCab();
		void cancelCab();
		void addMoneyToWallet();
		void raiseTicket();
		void signUp();
		void signIn();
	}
	
	interface olaDriver{
		void acceptBooking();
		void getCustomerLocation();
		void setAvailableStatus();
		void getMyComission();
		void raiseMoneyTransferRequest();
		void callCustomer();
		void setUpYourVehicle();
		void customerFeedback();
		
	}
	
	interface olaOwner{
		void getDriverRecords();
		void getReportByDriverId();
		void getReportByRegion();
		void getTotalRevenue();
		void getCustomersFeedback();
		void addDriver();
		void removeDriver();
		void changeDriverStatus();
	}
	public class Abstractioneg implements olaCustomer, olaDriver, olaOwner {
		public static void main(String[] args) {
			olaCustomer cust = new Abstractioneg();
			olaDriver manoj = new Abstractioneg(); 
		}
	}

}
