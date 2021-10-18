/** 
Ocho
(Nora, Tasmin, Hamim)
APCS
HW 18 -- writing a whole class
2021-10-17
DISCOVERIES: 
 
UNRESOLVED QUESTIONS:
- Am I allowed to name my directories something more helpful, provided that they have the same numbers as everyone else's?
Q2: Given the definitions of what constructors and instances are, 
the fact that you could create an new instance of a class by invoking a method which you have not yourself defined 
indicates the existence of a default constructor. 
Q3: 
0. Create a variable representing your object
1. Print your object to the terminal. 
2. If what you see in the terminal is the same as what your object contains 
(ex. your object is an integer, and you see an integer, or your object is a string array and you see a string array)
then your object has a string representation. 
*/

public class BankAccount {
	public String holderName;
	private String password;
	private int pin;
	private int accountNum;
	private double balance;
	private static int numAccounts = 0;
	
	public BankAccount(String name, String pass, int pinn) {
		holderName = name;
		password = pass;
		pin = pinn;
		accountNum = numAccounts + 1;
		numAccounts += 1; 
		balance = 0;
	}
	
	public void changePswd(String newPass) {
		password = newPass;
	}
	
	public void changePin(int newPin) {
		pin = newPin;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	} 
	
	public void atmReceipt() {
		System.out.print("\n\nAccount " + accountNum + ": " + holderName + "\nPassword: " + password + "\nPin: " + pin + "\nBalance: " + balance);
	}
	
	public static void main(String[] args){
		BankAccount roberts = new BankAccount("Bob", "momsbday050667", 2048); // Robert's bank account - he goes by Bob
		roberts.atmReceipt();
		roberts.changePswd("dadsbday080663");
		roberts.changePin(4096); 
		roberts.deposit(500); 
		roberts.atmReceipt(); 
		
		BankAccount mayas = new BankAccount("Maya", "momsbday041569", 2048); 
		mayas.atmReceipt();
		mayas.deposit(400); 
		mayas.withdraw(200); 
		mayas.atmReceipt(); 
		
		System.out.println(roberts);
		
	}
	
}
