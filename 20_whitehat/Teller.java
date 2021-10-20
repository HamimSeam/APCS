/**
Ocho!: Nora,, Tasnim, Hamim
10-19-2021

DISCO:
Accidentally putting a character after a semicolon messes up the next line, which makes sense since whitespace doesnt matter
It's good to keep track of how operations change certain values and how methods may be affected (ex: depositing a negative amount to make balance negative and then withdrawing gives an error)


QCC:
The error messages could be a bit more specific for the user's sake
Maybe authenticate could include the pin


**/

public class Teller {
	public static void main(String[] args) {
		//You can deposit negative values to get negative balance, but not withdraw from it
		BankAccount ba = new BankAccount();
		ba.setName("John");
    		ba.setPasswd("password");
    		ba.setPin((short) 1234);
    		ba.setAcctNum(123456789);
    		ba.setBalance(50.00);
    		ba.deposit(-500.00);
    		ba.withdraw(10.00);

		//Returns a message of "true" or "false", which may help the programmer but not so much a user
		System.out.println(ba.authenticate(123456789, "password"));
		System.out.println(ba.authenticate(123726287, "password"));
		System.out.println(ba.authenticate(123456789, "pass"));

    		System.out.println(ba.toString());

    		//Testing negative balance and pin/Acct #
    		BankAccount acc = new BankAccount();
		acc.setName("bob");

		//Password can be a mere one character
		acc.setPasswd("p");

		//Pin became 9999, Acct# became 999999999, "Try Again" message (is it the most helpful message???)
		acc.setPin((short) 12345);
		acc.setAcctNum(1234567890);
		acc.setBalance(-50.00);
		acc.deposit(55.00);

		//There is no error message for withdrawing more than the balance, as long as its >= 0, it simply doesnt withdraw
    		acc.withdraw(10.00);

    		System.out.println(acc.toString());
		}

}
