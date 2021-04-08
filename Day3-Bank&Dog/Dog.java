package day3_task1;

public class Dog {
	private String name;
	private int age;
	private int weight;
	
	public void setName(String name)
	{
		this.name = name;
		
		// current calling object
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		// --- business operation ---
		// non-functional requirements ----
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
		//System.out.println(this);
	}

	// Business method
	public void doFeedAnimal()
	{
		this.weight+=10;
		System.out.println("Feeded successfully");
		
	}
	public void playGames()
	{
		
		// dog cannot play
		
			if(weight<2 || weight>30) {
				System.out.println("Dog cannot play games"); 
				status = false;
			}
			else{
				System.out.println("Dog is playing");
				weight -= 1;
			}	
		// whenever dog playGame weight will be decreased by 1kg
		
	}
}
