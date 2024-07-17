import java.util.Scanner;

import javax.script.ScriptContext;


class ATM{
  float balance;
  int PIN=5482;
  int code=7821;


  public void ATM(){
    Scanner bk=new Scanner(System.in);

    System.out.print("enter the PIN:- ");
    
    int User_pin=bk.nextInt();

    
    if(User_pin==PIN){
      menu();
    }
    else{
      System.out.println("your pin is invalid");
      ATM();
      
    }
  }

  public void menu(){
    System.out.println("1. check balance");
    System.out.println("2. withdraw moeny ");
    System.out.println("3. deposit moeny");
    System.out.println("4. Transfer money");
    System.out.println("5. Exit");

    Scanner bk=new Scanner(System.in);

    System.out.print("enter the option: ");

    int option=bk.nextInt();

    if(option==1){
      check_balance();
      menu(); 
    }
    else if(option==2){
      Withdraw();
      menu();
    }
    else if(option==3){
      deposit();
      menu();
    }
    else if(option==4){
      Transfer();
      menu();
    }
    else if(option==5){
      Exit();
      
    }
    else{
      System.out.println("invalid option");
      System.out.println("please enter the valid option");
    }
    ATM();
  }

  public void check_balance(){
    Scanner bk=new Scanner(System.in);
    System.out.println("please enter the your bank private code:-");
    int user_code=bk.nextInt();

    if(user_code==code){
      System.out.println("your Account balance is: "+balance);
    }
    else{
      System.out.println("please enter the valid code");
      menu();
    }
   
  }

  public void Withdraw(){
    Scanner bk=new Scanner(System.in);
    System.out.print("enter the withdraw amount: ");
    float Amount=bk.nextFloat();
    
    if(Amount>balance){
      System.out.println("your Account balance is insufficent");
      menu();
    }
    else{
      balance=balance-Amount;
      System.out.println("your transation is success");
      System.out.println("your Account balance is: "+balance);
      menu();
    }
  }

  public void deposit(){
    Scanner bk=new Scanner(System.in);

    System.out.println("enter the Amount");

    float Amount=bk.nextFloat();

    balance=balance+Amount;

    System.out.println("your money is sucessfully deposit");

    System.out.println("your Account balance is: "+balance);
  }
  
  public void Transfer(){
    Scanner bk=new Scanner(System.in);

    System.out.print("Enter the Account number: ");

    String Account_number=bk.nextLine();

    System.out.println("enter the Account holder name: ");

    String name=bk.nextLine();

    System.out.println("enter the amount: ");
    
    float Amount=bk.nextFloat();

    if(Amount>balance){
      System.out.println("your Account balance is insulfficent");
      menu();
    }
    else{
      balance=balance-Amount;
      
      System.out.println("your transaction is successfully completed");
      System.out.println("your moeny is successfullu transfer to: "+Account_number );
      System.out.println("and this account holder name is: "+name);
      System.out.println("your Account balance is : "+balance);
    }
  }

  public void Exit(){
    ATM();
  }
}

public class ATM_machine {
    public static void main(String[] args) {
    
    ATM b1=new ATM();
    b1.ATM();
  }
}