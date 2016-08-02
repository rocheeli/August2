package com.ssa.classwork;

public class Epic 
{
	
	public static void main(String[] args) 
{
		
	
	String[][] myStuff = new String[4][5];
    
    myStuff [0][0] = "Pizza";
    myStuff [0][1] = "Crabs";
    myStuff [0][2] = "Bagels";
    myStuff [0][3] = "Fries";
    myStuff [0][4] = "Pasta";
    
    myStuff [1][0] = "Tragic Kingdom";
    myStuff [1][1] = "Hot Fuss";
    myStuff [1][2] = "Day and Age";
    myStuff [1][3] = "Jukebox the Ghost";
    myStuff [1][4] = "Sound of Change";
    
    myStuff [2][0] = "White Oleander";
    myStuff [2][1] = "The Likeness";
    myStuff [2][2] = "In the Blood";
    myStuff [2][3] = "Ender's Game";
    myStuff [2][4] = "In the Woods";
    
    myStuff [3][0] = "Empire Records";
    myStuff [3][1] = "The Labyrinth";
    myStuff [3][2] = "Silence of the Lambs";
    myStuff [3][3] = "Legends of the Fall";
    myStuff [3][4] = "Troop Beverly Hills";
    
    int rows=4; //number of arrays
	int columns=5; //number of items in each array
	int i,j;
	
	for( i=0; i < 4; i++)
			{
			for(j=0; j < 5; j++)
			{
				System.out.println(myStuff[i][j] + " ");
			}
		System.out.println();
			}
}

}//I understood making the array in general but I had to google to get it done 
//and I'm still fuzzy on how the for loops and sysouts are working
