import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */

    /**
     * Types of banking accounts.
     */
    public enum BankAccountType {
        /**
         * type.
         */
        CHECKINGS,
        /**
         * type.
         */
        SAVINGS,
        /**
         * type.
         */
        STUDENT,
        /**
         * type.
         */
        WORKPLACE
    }

    /**
     * Number of Account.
     */
    private int accountNumber;
    /**
     * Type of Account
     */
    private BankAccountType accountType;
    /**
     * Account Balance
     */
    private double accountBalance;
    /**
     * Name of Owner.
     */
    private String ownerName;
    /**
     * Number of Account.
     */
    private double interestRate;
    /**
     * Interest Earned.
     */
    private double interestEarned;


    /**
     * Bank account constructor.
     * @param name Name of the bank account owner.
     * @param accountCategory type of bank account.
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        ownerName = name;

        accountType = accountCategory;

        Bank.totalAccounts = Bank.totalAccounts + 1;
    }

    /**
     * @return account number.
     */
    public int getAccountNumber() {

        return accountNumber;
    }

    /**
     * sets account number.
     * @param number number to set.
     */
    public void setAccountNumber(final int number) {

        accountNumber = number;
    }

    /**
     * @return account type
     */
    public BankAccountType getaccountType() {

        return accountType;
    }

    /**
     * sets account type.
     * @param newaccountType account type to be set.
     */
    public void setAccountType(final BankAccountType newaccountType) {

        accountType = newaccountType;
    }

    /**
     * @return account balance
     */
    public double getAccountBalance() {

        return accountBalance;
    }

    /**
     * sets account balance.
     * @param amount amount to set.
     */
    public void setAccountBalance(final double amount) {

        accountBalance += amount;
    }
    /**
     * @return owner's name
     */
    public String getOwnerName() {

        return ownerName;
    }

    /**
     * sets owner name
     * @param newname new name of owner.
     */
    public void setOwnerName(final String newname) {
        ownerName = newname;
    }

    /**
     * @return interest rate.
     */
    public double getInterestRate() {

        return interestRate;
    }

    /**
     * sets new rate
     * @param newrate new amount to set rate to.
     */
    public void setInterestRate(final double newrate) {

        interestRate = newrate;

    }
    /**
     * @return interest earned
     */
    public double getInterestEarned() {

        return interestEarned;
    }

    /**
     * sets new interest earned
     * @param newvalue new values to set interest to
     */
    public void setInterestEarned(final double newvalue) {

        interestEarned = newvalue;
    }




    /*
     * Implement getters and setters as appropriate for private variables.
     */
}
