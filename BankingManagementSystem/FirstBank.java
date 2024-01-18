package Assignments;
import java.util.Scanner;


class Bank {
	int acNo;
	String name;
	int bal;
	Bank(int acNo, String name, int bal){
		this.acNo = acNo;
		this.name = name;
		this.bal = bal;
	}
}

public class FirstBank {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of accounts: ");
		int n = sc.nextInt();
		sc.nextLine();
		Bank obj1[];
		obj1 = new Bank[n];
		for(int i=0;i<obj1.length;i++) {
			System.out.println("Enter name. of " + (i+1) + "a/c holder:");
			String name = sc.nextLine();
			System.out.println("Enter ac no. of " + (i+1) + "a/c holder:");
			int acNo = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter balance of " + (i+1) + "a/c holder:");
			int bal = sc.nextInt();
			sc.nextLine();
			obj1[i] = new Bank(acNo, name, bal);
			
		}
		
		System.out.println("Enter id of a particular account: ");
		int id = sc.nextInt();
		sc.nextLine();
		int option;
		
		do {
			System.out.println("Choose 1 to display: ");
			System.out.println("Choose 2 to withdraw: ");
			System.out.println("Choose 3 to deposit: ");
			System.out.println("Choose 4 to search: ");
			System.out.println("Choose 5 to End: ");
			
			System.out.println("Choose the option: ");
			option = sc.nextInt();
			sc.nextLine();
		
			if(option == 1) {
				for(int i=0;i<obj1.length;i++) {
					if(obj1[i].acNo == id) {
						System.out.println("Account no: " + obj1[i].acNo);
						System.out.println("Name: " + obj1[i].name);
						System.out.println("Balance: " + obj1[i].bal);
					}
				}
			}else if(option == 2) {
				System.out.println("Enter the withrawl money amount: ");
				int withMoney = sc.nextInt();
				sc.nextLine();
				for(int i=0;i<obj1.length;i++) {
					if(obj1[i].acNo == id) {
						obj1[i].bal = obj1[i].bal - withMoney;
						System.out.println("Balance: " + obj1[i].bal);
					}
				}
				
			}else if(option == 3) {
				System.out.println("Enter the deposit money amount: ");
				int depMoney = sc.nextInt();
				sc.nextLine();
				for(int i=0;i<obj1.length;i++) {
					if(obj1[i].acNo == id) {
						obj1[i].bal = obj1[i].bal + depMoney;
						System.out.println("Balance: " + obj1[i].bal);
					}
				}
				
			}else if(option == 4) {
				System.out.println("Choose the id : ");
				id = sc.nextInt();
				sc.nextLine();
			}else if(option == 5){
				break;
			}else {
				System.out.println("Invalid");
			}
		
		
		}while(option != 5);	
		
		sc.close();
	}
	
	

}
