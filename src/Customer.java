public class Customer {
    private String name;
    private long accountNumber;
    private double bankBalance;

    public Customer(String name, long accountNumber, double bankBalance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.bankBalance = bankBalance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(double bankBalance) {
        this.bankBalance = bankBalance;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", accountNumber=" + accountNumber +
                ", bankBalance=" + bankBalance +
                '}';
    }
}
