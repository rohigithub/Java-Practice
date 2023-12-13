package my;

abstract class main {
	
	abstract void run();
		
	
   void gear() {
	   System.out.println("Changed Gear");
   }
	
}

class Bike extends main{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike obj= new Bike();
		obj.gear();
		obj.run();
	}
		 void run() 
		{
			System.out.println("Running Bike");
		}
	}



