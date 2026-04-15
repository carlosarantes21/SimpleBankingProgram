import java.util.Scanner;

public class Main{
    static void main(String[] args) throws InterruptedException {

        int choice, choice2;
        double balance=0,deposit,withdraw;
        Scanner scan1 = new Scanner(System.in);

        do {
            System.out.println("***************");
            System.out.println("BANKING PROGRAM");
            System.out.println("***************");
            System.out.println("1. Show Balance\n" +
                    "2. Deposit\n" +
                    "3. Withdraw\n" +
                    "4. Exit");
            System.out.println("************************");
            System.out.println("Enter your choice (1-4):");
            System.out.println("************************");
            choice = scan1.nextInt();
            choice2=1;
            while(choice2!=2) {
                switch (choice) {
                    case 1:
                        System.out.println("****************");
                        System.out.println("CURRENT BALANCE: ");
                        System.out.printf("$%.2f\n" , balance);
                        System.out.println("****************");
                        System.out.println("Type '2' to go back");
                        choice2=scan1.nextInt();
                        break;
                    case 2:
                        System.out.println("***************************");
                        System.out.println("Type the amount of deposit: ");
                        System.out.println("***************************");
                        deposit = scan1.nextDouble();
                        if (deposit > 0) {
                            balance += deposit;
                            for (int i = 3; i > 0; i--) {
                                System.out.println(i + "...");
                                Thread.sleep(1000);
                            }
                            System.out.println("*****************");
                            System.out.println("DEPOSIT CONFIRMED");
                            System.out.println("*****************");
                            System.out.println("Type '2' to go back");
                            choice2=scan1.nextInt();
                        } else {
                            System.out.println("*************************");
                            System.out.println("INVALID AMOUNT, TRY AGAIN");
                            System.out.println("*************************");

                        }
                        break;
                    case 3:
                        System.out.println("****************************");
                        System.out.println("Type the amount of withdraw: ");
                        System.out.println("****************************");
                        withdraw = scan1.nextDouble();
                        if (withdraw <= balance) {
                            balance -= withdraw;
                            System.out.println("CHECKING BALANCE");
                            for (int i = 3; i > 0; i--) {
                                System.out.println(i + "...");
                                Thread.sleep(1000);
                            }
                            System.out.println("******************");
                            System.out.println("WITHDRAW CONFIRMED");
                            System.out.println("******************");
                            System.out.println("Type '2' to go back");
                            choice2=scan1.nextInt();
                        } else {
                            System.out.println("CHECKING BALANCE");
                            for (int i = 3; i > 0; i--) {
                                System.out.println(i + "...");
                                Thread.sleep(1000);
                            }
                            System.out.println("******************");
                            System.out.println("NOT ENOUGH BALANCE");
                            System.out.println("******************");
                        }
                        break;
                    case 4:
                        System.out.println("*************");
                        System.out.println("SESSION ENDED");
                        System.out.println("*************");
                        choice2=2;
                        break;
                }
            }
        }while(choice!=4);
    }
}

//TO DO: ADD OPTION TO GO BACK OR END INSTEAD OF SHOWING ALL 4 OPTIONS AGAIN