import java.util.Scanner; 
public class atm{
    String cusname;
    int accnum;
    float balance;
    float roe;
    String contactno;
    String address;
    Scanner sc = new Scanner(System.in);
    public void createAccount(int k){
        System.out.println("\n------Creating Account------");
        accnum = k+1000;
        System.out.print("Enter Customer Name: ");
        cusname = sc.nextLine();
        System.out.print("Enter Address: ");
        address = sc.nextLine();
        System.out.print("Enter Contact Number: ");
        contactno = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        balance = sc.nextFloat();
        System.out.print("Enter Rate of Interest: ");
        roe = sc.nextFloat();
        System.out.println("------Account Created------\n");
    }
    public void displayAccountInfo(){
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s \n",accnum,cusname,contactno,address,balance,roe);
    }

    public void deposit(){
        System.out.println("\n-----Deposit Ammount-----");
        System.out.println("Enter Ammount: ");
        float temp = sc.nextFloat();
        balance += temp;
        System.out.println("-----Deposited Successfully (Current Balance "+balance+" )-----\n");
    }

    public void withdraw(){
        System.out.println("\n-----Withdraw Ammount-----");
        System.out.println("Enter Ammount: ");
        float temp = sc.nextFloat();
        if(temp>balance){
            System.out.println("Warning: Cannot Withdraw ammount more than current balance!\n");
        }
        else{
            balance -= temp;
            System.out.println("-----Withdraw Successfully (Current Balance "+balance+" )-----\n");
        }
    }

    public void computeinterest(){
        System.out.println("\n-----Compute Interest-----");
        System.out.println("Enter Number of Years: ");
        int time = sc.nextInt();
        float temp = (balance*roe*time)/100;
        System.out.println("Your Interest after "+time+" Years will be "+temp+" ");
    }
    public void displaybalance(){
        System.out.println("-----Current Balance: "+balance+"-----");
    }

    public static void main(String[] args) {
        atm[] user = new atm[20];
        int ch=0,k=0;
        Scanner sc = new Scanner(System.in);

        while(ch!=7){
            System.out.println("\n----MENU----");
            System.out.println("1) Create Account  \n2) Deposit \n3) Withdraw \n4) Compute ROE \n5) Display Balance \n6) Display All Accounts \n7) Exit");
            ch = sc.nextInt();
            switch(ch){
                case 1: user[k] = new atm();
                        user[k].createAccount(k);
                        k++;
                        break;
                case 2: System.out.println("Enter Account Number: ");
                    int useracc1 = sc.nextInt();
                    for(int i=0;i<k;i++){
                        if(user[i].accnum==useracc1){
                            user[i].deposit();
                        }
                        else{
                            System.out.println("Account Not found");
                        }
                    }
                    break;
                case 3: System.out.println("Enter Account Number: ");
                        int useracc2 = sc.nextInt();
                        for(int i=0;i<k;i++){
                            if(user[i].accnum==useracc2){
                                user[i].withdraw();
                            }
                            else{
                                System.out.println("Account Not found");
                            }
                        }
                        break;
                case 4: System.out.println("Enter Account Number: ");
                        int useracc3 = sc.nextInt();
                        for(int i=0;i<k;i++){
                            if(user[i].accnum==useracc3){
                                user[i].computeinterest();
                            }
                            else{
                                System.out.println("Account Not found");
                            }
                        }
                        break;
                case 5: System.out.println("Enter Account Number: ");
                        int useracc4 = sc.nextInt();
                        for(int i=0;i<k;i++){
                            if(user[i].accnum==useracc4){
                                user[i].displaybalance();
                            }
                            else{
                                System.out.println("Account Not found");
                            }
                        }
                        break;
                case 6: System.out.println("------Accounts Information (Total Acc: "+k+")-----");
                        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s \n","Acc No","Name","Contact","Address","Balance","ROE");
                        for(int i=0;i<k;i++){
                            user[i].displayAccountInfo();
                        }
                        System.out.println("\n");
                        break;
                case 7: System.out.println("-----Exited Successfully-----");
                        break;
                default: System.out.println("Enter Valid Options");
            }
        }
        sc.close();
    }
}