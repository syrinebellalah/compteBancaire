package compteBancaire;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Account {
private double amount;
public Account(){}
public Account(double amount) {
	this.amount = amount;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
/* V�rifier le solde de compte est suffisant ou non */
public boolean checkCompte(double amount){
	if(this.amount>=amount)
			{return true;}
	else return false;
}
/* date */
Date day=new Date();
DateFormat dateFormat=DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT);

/* Afficher les details de l'op�ration R�trait de l'argent */
public void withdraw(double amount,Account account){
	String name=account.getClass().getName();
	
	System.out.println(" R�trait "+dateFormat.format(day));
	System.out.println( name+" \n Start  "+getAmount());
	System.out.println(" withdraw: "+amount+"euro");
	if(checkCompte(amount)) 
	{this.amount-=amount;}
	else{
		System.out.println("Not enough money");
	}
	System.out.println(" End "+getAmount());
	System.out.println("--------------------");
}

/* Afficher les details de l'op�ration d�pot de l'argent */
public void addMoney(double amount,Account account)
{String name=account.getClass().getName();
System.out.println(" D�pot "+dateFormat.format(day));
System.out.println( name+ " \n Start "+getAmount());
System.out.println(" add: "+amount+"euro");
this.amount+=amount;
System.out.println(" End "+getAmount());
	}



}

