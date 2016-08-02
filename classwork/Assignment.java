package com.ssa.classwork;

public class Assignment {
	//practice comment
	public static void main(String[] args) {

		String hello = "Hello World";
		int aYear = 1492;
		boolean ifYouHaveDog = true;
		String todaysDate = "8/2/2016";
		double amount = 5.45;
		char letter = 'X';
//array1
		String[] aListOfMovies = { "Empire Records", "The Labyrinth", "Whip It", "Double Jeopardy", "Clueless",
				"Three Men and a Little Lady", "Legends of the Fall", "Troop Beverly Hills", "Silence of the Lambs",
				"Old School" };
//array2
		String[] aListOfBooks = new String[10];
		aListOfBooks[0] = "White Oleander";
		aListOfBooks[1] = "In the Woods";
		aListOfBooks[2] = "The Likeness";
		aListOfBooks[3] = "Faithful Place";
		aListOfBooks[4] = "Broken Harbor";
		aListOfBooks[5] = "Ink and Bone";
		aListOfBooks[6] = "In the Blood";
		aListOfBooks[7] = "Black Out";
		aListOfBooks[8] = "Ender's Game";
		aListOfBooks[9] = "Winnie the Pooh";

		System.out.println(hello);
		System.out.println("Columbus Sailed the world in " + aYear);

		if (ifYouHaveDog) {
			System.out.println("It is true that I have a dog at home.");
		}

		System.out.println("Today is " + todaysDate);
		System.out.println("I spent $" + amount + " on a cheeseburger");
		System.out.println(letter + " marks the spot");

	}
	//methods
		public String hiMary()
			{
			return "Hi Mary";
			}
		
		private int soccerBalls(int size, int volume)
		{
			return size;
		}
		
		public double foo()
		{	
			return 3.00d;
		}

		
		protected String personName ( String firstName, String lastName)
		{
			return "lastName" + "firstName";
		}

		private boolean areOnTime()
		{
			return true;
		}
		
		public void dogs( float age, float weight)
		{	
			
			System.out.println( age + weight);
		}
	
		public void clock(boolean isItMorning)
		{
			boolean whatTime = true;
			if (isItMorning)
			{
				whatTime = false;
			}
			System.out.println(isItMorning);
		}
			
		protected  void test(int value)
		{
			if (value ==0)
			{
				return;
				
			 }
			System.out.println(value);
		}
		
		private void display(char n)
		{
			System.out.append(n);
		}

		public int timeHours(char d)
		{
			System.out.print(d);
			return 0;
					
		}
}
//I understand the structure of methods 
//and what parts I need, but I don't think I have enough experience to make
//examples that make sense *also still a little fuzzy with parameters