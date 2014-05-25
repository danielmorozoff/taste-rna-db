package db_boot;

public class Main {
	
	public static void main(String [] args){
		//Startup DB.
			new TasteDB();
			DBFunctions dbFun = new DBFunctions();
			//Evaluate execution arguments
			dbFun.evalArgs(args);
	}
	

}
