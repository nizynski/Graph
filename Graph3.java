//File:Graph3.java

/** 
* This class calls the nodes and lines to create graph 3 
*
* @author katie nizynski
*/


public class Graph3
{
    GameArena arena = new GameArena(500,500); // creates a game arena which is 500 by 500
    DirectedLine directedLines[] = new DirectedLine[4]; // creates an array which can hold 5 elements
    Node nodeArray[] = new Node[4];

 /**Graph3 Method.
     * 
     * This method is used to call all the nodes and lines to be created to make the graph
     * @param 
     * @return 
     */

public Graph3()
    {
        /** fills the array with nodes and properties */
        nodeArray[0]= new Node("A",150.0,250.0,"BLUE",arena );
        nodeArray[1] = new Node("B",300.0,250.0,"GREEN",arena);
        nodeArray[2] = new Node("C",225.0,400.0,"RED",arena);
        nodeArray[3]= new Node("D",225.0,100.0,"YELLOW",arena);

        directedLines[0]= new DirectedLine(nodeArray[0],nodeArray[2],arena);
        directedLines[1]= new DirectedLine(nodeArray[2],nodeArray[1],arena);
        directedLines[2]= new DirectedLine(nodeArray[1],nodeArray[3],arena);
        directedLines[3]= new DirectedLine(nodeArray[3],nodeArray[0],arena);
       
   
         for(int i = 0 ; i < 4 ; i++)
         {
         nodeArray[i].drawNode(); // adds the node 
         directedLines[i].displayDirected();// displays the connections
         }

    

            arena.update();
        
    }
}
