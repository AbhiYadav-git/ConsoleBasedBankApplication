public interface Bank {
    void deposit(long accountNo,double amount);
    void withdraw(long accountNo,double amount);
    void checkBalance(long accountNo);
}
