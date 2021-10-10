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
/* Vérifier le solde de compte est suffisant ou non */
public boolean checkCompte(double amount){
	if(this.amount>=amount)
			{return true;}
	else return false;
}
/* date */
Date day=new Date();
DateFormat dateFormat=DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT);

/* Afficher les details de l'opération Rétrait de l'argent */
public void withdraw(double amount,Account account){
	String name=account.getClass().getName();
	
	System.out.println(" Rétrait "+dateFormat.format(day));
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

/* Afficher les details de l'opération dépot de l'argent */
public void addMoney(double amount,Account account)
{String name=account.getClass().getName();
System.out.println(" Dépot "+dateFormat.format(day));
System.out.println( name+ " \n Start "+getAmount());
System.out.println(" add: "+amount+"euro");
this.amount+=amount;
System.out.println(" End "+getAmount());
	}



}

