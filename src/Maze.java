/*Name:Jared Dunn
 * Class: JBS
 * Professors: Tim Hickey Pito Salas
 * Date:5/25/2011
 * Bugs: methods solve traverse and redesign do not work.
 * This is my maze constructor it returns an empty dimentinal array of the given size
 */
public class Maze 
{
 private int x;
 private int y;
 private int x1;
 private int y1;
 private String [][] mze;
 
// here is my constructor it creates a dimentonal array
 public Maze(int a, int b)
 {
	x = a;
	y = b;
	x1 = x*2+1;
	y1 = y*2+1;
	
	mze = new String[x1] [y1];
 }
//getMaze returns the maze at any given point
 public String[][] getMaze()
 {
	 return  mze;
 }
//getX returns x at any given point
 public int getX()
 {
	 return x;
 }
//getY returns Y at any given point
 public int getY()
 {
	 return y;
 }
//Load Accepts a string as a parameter and loads it into a maze
 public void load(String s)
 {
   int count = 0;
   for (int i = 0; i<x1; i++)
   {
	   for (int j = 0; j<y1; j++)
	   {
			if(s.charAt(count)== '1')
			{
			  mze[i][j]="@";  
			}
			else
				mze[i][j]=" "; 
			count++;
			
		}
	}
 }
//print() prints out the dimentonal array or "Maze" 
 public void print()
 {
	 for (int i = 0; i<x1; i++)
	   {
		   for (int j = 0; j<y1; j++)
		   {
			   System.out.print(mze[i][j]);
		   }
		   System.out.println();
	   }
 }
//Solve determines weather or not the maze is an actual maze and it can be solved
 public boolean solve(int begX, int begY, int endX, int endY) 
 {
	boolean swch = false;
	if (begX==endX && begY==endY) 
	{
		swch = true;
	}
	else
	{
	 boolean check = false;
		for(int i = -1; i<=1; i++)
		{
			for(int j = -1; j<=1; j++)
			{
				x= begX + i;
				y= begY + j;
				 if (x < 0 || x > mze.length || y < 0 || y > mze.length)
				 {
			            return check;
				 }
			     else
			     {
			        	check = true;
			        	return check;
			     }
				 else if(i*j==0 && i!=j && check && !swch) 
				 {
                     swch = solve(begX+i, begY+j, endX, endY);
				 }
				 
			  }
		  }	
	    return swch;
	   }
     }
//Traverse is supposed to show you step by step how to solve the maze
 public void traverse(int begX, int begY, int endX, int endY) 
 {
	 
 }
// redesign is supposed to redesign the maze
 public void redesign()
 {
	 
 }
}

