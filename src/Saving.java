import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Saving {
	
public static void main(String[] args) throws IOException{
	double deposit, interest,amount=0;
	int month;
	
	Reader.init(new FileInputStream(new File("data/input.txt")));
	Reader.setDelimeter("\t ,");
	
	deposit = Reader.nextDouble();
	interest = Reader.nextDouble() /1200;
	month = Reader.nextInt();
	
	for(int m=0; m<month;m++){
		amount = (deposit + amount)*(1+interest);
		System.out.printf("Monuth %d, Saving : %10.3f\n",m+1,amount);
	}
	}
}
	
