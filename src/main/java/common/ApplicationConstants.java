package common;

public class ApplicationConstants {

    public static final Integer WEB_APPLICATION_PORT = 8090;
    public final static String ACCOUNT_OPERATIONS_PATH = "http://localhost:8090/account/";
    public final static String TRANSACTION_OPERATIONS_PATH = "http://localhost:8090/transfer/";
    public static final String ACCOUNT_ID_ALREADY_EXISTS = "Account id already exists: ";
    public static final String INSUFFICIENT_BALANCE = "Cannot process transaction: Insufficient balance in account id: ";
    public static final String NO_SUCH_ACCOUNT = "No such account matching with the account id: ";
    public static final String FAILED_TRANSACTION = "Reververting preveous Balence with the account id: ";
    public static final String NEGATIVE_INITIAL_BALANCE = "Initial balance cannot be negative.";
    public static final String NEGATIVE_TRANSFER_AMOUNT = "Transfer amount cannot be negative.";
    public static final String INVALID_ID = "Invalid ID: ";
    public static final String NULL_OR_EMPTY_ID = "null or empty ID";
    public static final String INVALID_TRANSFER_AMOUNT = "Invalid transfer amount: ";
    public static final String INVALID_INITIAL_BALANCE = "Invalid initial balance: ";
}
