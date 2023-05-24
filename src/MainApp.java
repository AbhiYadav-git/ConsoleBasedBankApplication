import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        IciciBank bank=new IciciBank();

        System.out.println("Enter Number Of Customer");
        int numCustomer=sc1.nextInt();
        int number=1;
        for (int i=0;i<numCustomer;i++){
            System.out.println("---------------------------------------");
            System.out.println("Enter: "+number+"_No. Customer Details");
            System.out.println("Enter Name");
            String name= sc1.next();
            System.out.println("Enter Customer Account Number");
            long aN= sc1.nextLong();
            System.out.println("Enter Customer Bank Balance");
            double balance= sc1.nextDouble();
            Customer c=new Customer(name,aN,balance);
            bank.addDetails(name,aN,balance);
            number++;
        }



        boolean status=true;
        while (status){
            System.out.println("--------------------------------------");
            System.out.println("Select Mode Of Operation");
            System.out.println("1:Deposit Money");
            System.out.println("2:Withdraw Money From Bank Account");
            System.out.println("3:Display Amount");
            System.out.println("4:Exit");
            System.out.println("--------------------------------------");
            int choice= sc1.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter Account Number");
                    long acNo= sc1.nextLong();
                    System.out.println("Enter Amount For Deposit");
                    double amt= sc1.nextDouble();
                    bank.deposit(acNo,amt);
                    break;
                case 2:
                    System.out.println("Enter Account Number");
                    long no= sc1.nextLong();
                    System.out.println("Enter Amount For Withdraw");
                    double money= sc1.nextDouble();
                    bank.withdraw(no,money);
                    break;
                case 3:
                    System.out.println("Enter Account Number");
                    long num= sc1.nextLong();
                    bank.checkBalance(num);
                    break;
                default:status=false;
            }
        }
    }
}
