/*Name:Jared Dunn
 * Class: JBS
 * Professors: Tim Hickey Pito Salas
 * Date:5/25/2011
 * Bugs: parts 4,5,6 do not work
 * 
 */

// this is my main method its creates a maze, then it loads the maze with a string and then prints the maze.
public class MazeClient 
{
	public static void main(String[] args)
	{
		Maze  m = new Maze(4,4);
		System.out.println("here");
		m.load("111111111100010001111010101100010101101110101100000101111011101100000101111111111");
		m.print();
	}


}
