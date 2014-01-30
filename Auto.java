//Curry Williams

public class Auto
 
{
	int year=0;
	String  model=" ";
	double miles=0.0;
	

	int currentID=0;
	//ADD THE PROPER STATIC VARIABLE TO CREATE UNIQUE ID NUMBBERS FOR EACH 
	//OBJECT OF THIS CLASS
    static int id=0;



	//default constructor
	public Auto()
	{
		year=2010;
		model="Chrysler";
		miles=10.5;
		//ADD CODE TO ADVANCE ID FOR EACH OBJECT
		id++;
		currentID=id;
	}

	public Auto(int y, String m, double mi)
	{
	   
	   year=y;
	   model=m;
	   miles=mi;
	   // ADD COD ETO ADVANCE ID FOR EACH OBJECT
	   id++;
	   currentID=id;
	 }

	public int getYear()
	{
		return year;
	}
	 public String getModel()
	 {
		return model;
	 }

	public double getMiles()
	{

		return miles;
	}
	
	public int getCurrentID()
	{
		return currentID;
	}

	public int getID()
	{
		return id;

	}

	public void setYear(int ye)
	{
		year=ye;
	}

	public void setModel(String mo)
	{
		model=mo;

	}

	

	public void setMiles(double mg)
	{
		miles=mg;
	}

	

	public void setCurrentID(int cid)
	{
		currentID=cid;
	}

	//ADD A toString METHOD THAT INCLUDES ALL INSTANCE VARIABLES


	public String toString()
	{
		String output=" ";
		output= "The year is:"+" "+year+" "+"The model is"+" "+model+" "+"The miles are:"+" "+miles+" "+
		"The id is"+" "+currentID+" "+"The static id is:"+" "+id;
		return output;
	}





	//ADD AN EQUALS METHOD. TWO AUTO OBJECTS ARE EQUAL IF THE MODEL AND MILESDRIVEN ATTRIBUTES 
	//HAVE THE SAME VALUES
     public boolean equals(Auto obj)
	 {
	   if((obj.getMiles()==this.getMiles())&&(obj.getModel().equals(this.getModel())))
			return true;
	   else
			return false;
	}

}
