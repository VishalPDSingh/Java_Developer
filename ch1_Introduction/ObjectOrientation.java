package ch1_Introduction;


class Car // type of object
{
	// object has
	String name;
	float cost;
	float miliage;
	
	// object dose
	void start()
	{
		// body of the method
	}
	
	void accelerate()
	{
		// body of the method
	}
	
	void stop()
	{
		// body of the method
	}
}


public class ObjectOrientation {
	public static void main(String args[])
	{
		// object creation
		Car c1 = new Car(); 
		
		c1.name = "Royal BMW";
		c1.cost = 4564.5f;
		c1.miliage = 56.5f;
		
		
	}
}
