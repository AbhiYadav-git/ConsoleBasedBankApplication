import java.util.ArrayList;
import java.util.Iterator;

public class IciciBank implements Bank{
    private ArrayList<Customer> data=new ArrayList<>();

    void addDetails(String name,long accNumber,double balance){
        Customer c=new Customer(name,accNumber,balance);
        data.add(c);
    }
    //=====================================================================================================================
    @Override
    public void deposit(long accountNo, double amount) {
        Iterator<Customer> itr= data.iterator();
        boolean status=false;
        while (itr.hasNext()){
            Customer c=  itr.next();
            if (c.getAccountNumber()==accountNo){
                double amt=amount;
                amount+=c.getBankBalance();
                c.setBankBalance(amount);
                System.out.println("================================");
                System.out.println("Total Amount Credited Is:"+amt);
                System.out.println("================================");
                status=true;
                break;

            }
        }
        if(!status){

            System.out.println("================================");
            System.out.println("Invalid Account Number");
            System.out.println("================================");

        }
    }
    //=====================================================================================================================
    @Override
    public void withdraw(long accountNo, double amount) {
        Iterator<Customer> itr= data.iterator();
        boolean status=false;
        while (itr.hasNext()){
            Customer c=itr.next();
            if (c.getAccountNumber()==accountNo) {
                if (amount<=c.getBankBalance()) {
                    System.out.println();
                    double amt = amount;
                    amount=c.getBankBalance()-amount;
                    c.setBankBalance(amount);
                    System.out.println("================================");
                    System.out.println("Total Amount Withdraw Is :"+amt);
                    System.out.println("================================");
                    status=true;
                    break;
                } else {
                    throw new InsufficientAccountBalanceException("Insufficient Account Balance");
                }
            }

        }if(!status){
            System.out.println("================================");
            System.out.println("Invalid Account Number");
            System.out.println("================================");
        }
    }
    //=====================================================================================================================
    @Override
    public void checkBalance(long accountN0) {
        Iterator<Customer> itr=data.iterator();
        boolean status=false;
        while (itr.hasNext()){
            Customer c=itr.next();

            if (accountN0==c.getAccountNumber()){
                System.out.println("================================");
                System.out.println("Total Account Balance Is :"+c.getBankBalance());
                System.out.println("================================");
                status=true;
                break;
            }

            //break;
        }
        if (!status){
            System.out.println("================================");
            System.out.println("Invalid Account Number");
            System.out.println("================================");

        }
    }

}
