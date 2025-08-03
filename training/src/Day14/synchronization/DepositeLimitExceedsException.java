package Day14.synchronization;


	public class DepositeLimitExceedsException extends Exception {

		public DepositeLimitExceedsException()
		{
			super("Daily limit of Deposit is exceeded..");
		}
		public DepositeLimitExceedsException(String message)
		{
			super(message);
		}

}
