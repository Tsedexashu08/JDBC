package test.t1.exercise;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int choice;
		char act='s';
		Account a=null,b=null;
		String fname="",lname="",actNo="";
		double bal,amt;
		char ans='y';
		Scanner s = new Scanner(System.in);
		do {
			choice = menu();
			if(choice == 1) {
				System.out.println("Enter your First Name");
				fname = s.next();
				System.out.println("Enter your Last Name");
				lname = s.next();
				System.out.println("Enter your Account Number");
				actNo = s.next();
				System.out.println("Enter the Initial balance");
				bal = s.nextDouble();
				ch: while(true) {
					System.out.println("Choose The type of Account\n"
								+ "S: for Saving Account\n"
								+ "C: for Checking Account\n");
					act = Character.toUpperCase(s.next().charAt(0));
					if(act == 'S') {
						a = new SavingAccount(fname,lname,actNo);
						a.deposit(bal);
						break;
					}
					else if(act == 'C') {
						a = new CheckingAccount(fname,lname,actNo);
						a.deposit(bal);
						break;
					}
					else {
						System.out.println("Please enter the correct choice");
					}
				}
				System.out.print("Your New account is created and "
						+"Credited with "+bal+"\n");
				System.out.println("Your Balance is "+ bal);
			}
			else if(choice == 2) {
				System.out.println("Enter the amount you want to Withdraw");
				amt = s.nextDouble();
				//a = new SavingAccount(fname,lname,actNo);
				a.withdraw(amt);
			}
			else if(choice == 3) {
				if(act == 'S') {
					b = a;
					break;
				}
				else if(act == 'C') {
					b = a;
					break;
				}
				System.out.println("How much do you want to deposit");
				amt = s.nextDouble();
				b.deposit(amt);		
			}
			else if(choice == 4) {
				//a = new CheckingAccount();
				System.out.println("Your Balance is "
						+a.getBal());
			}
			else if(choice == 5) {
				System.out.println("Thank you ");
				System.exit(0);
			}
			else
				System.out.println("Thank you ");
			System.out.println("Do you want to continue");
			ans = s.next().charAt(0);
		}while(ans=='y'||ans=='Y');	
		s.close();
	}
	static int menu() {
		Scanner s = new Scanner(System.in);
		System.out.println("Press: \n"
				+ "1. Create Account\n"
				+ "2. to Withdraw\n"
				+ "3. to Deposit\n"
				+ "4. to Check Balance\n"
				+ "5. to Leave\n");
		return (s.nextInt());
		
	}
}
