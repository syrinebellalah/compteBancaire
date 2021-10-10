package compteBancaire;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainApplication {
public static void main(String[] args) throws FileNotFoundException{
	Account compte =new Account(250);
	System.out.println(compte.getAmount());
	compte.withdraw(200, compte);
	compte.addMoney(200, compte);
   /*Créér un fichier basé sur la date */ 
    SimpleDateFormat filePattern = new SimpleDateFormat("ddMMyyyy_HHmm");
    String filename=filePattern.format(new Date()) + ".txt";
    /*ouvrir le fichier*/
   
        File file = new File("E://myapp_"+filename);
  
        PrintStream printStream = new PrintStream(file);
        System.setOut(printStream);
        compte.withdraw(200, compte);
        compte.addMoney(200, compte);
       
}
}
