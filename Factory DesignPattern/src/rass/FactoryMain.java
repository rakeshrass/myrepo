package rass;

import com.phone.OperatingsystemFactory;
import com.phone.Os;

public class FactoryMain {
	
	public static void main(String args[]){
		
		
		OperatingsystemFactory osf =new OperatingsystemFactory();
		
		Os obj =osf.getInstance("closed");
		obj.spec();
	}

}
