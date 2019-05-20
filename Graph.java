//File:Graph.java

/** 
* This class calls nodes and lines to make graph 1
*
* @author katie nizynski
*/

public class Graph
{
    GameArena arena = new GameArena(500,500);// creates a game arean 500 by 500
    UndirectedLine undirectedLines[] = new UndirectedLine[4]; 
    Node nodeArray[] = new Node[4];

/**Graph3 Method.
     * 
     * This method is used to call all the nodes and lines to be created to make the graph
     * @param 
     * @return 
     */

public Graph()
    {
        /** fills the array with nodes and properties */
        nodeArray[0]= new Node("a",150.0,250.0,"BLUE",arena );
        nodeArray[1] = new Node("b",250.0,150.0,"GREEN",arena);
        nodeArray[2] = new Node("c",250.0,250.0,"RED",arena);
        nodeArray[3]= new Node("d",150.0,150.0,"YELLOW",arena);

        undirectedLines[0]= new UndirectedLine(nodeArray[0],nodeArray[2],arena);
        undirectedLines[1]= new UndirectedLine(nodeArray[1],nodeArray[2],arena);
        undirectedLines[2]= new UndirectedLine(nodeArray[3],nodeArray[1],arena);
        undirectedLines[3]= new UndirectedLine(nodeArray[0],nodeArray[3],arena);
       
   
         for(int i = 0 ; i < 4 ; i++)
         {
         nodeArray[i].drawNode(); // draws the node 
         undirectedLines[i].displayUndirected();// displays all the connections 
         }

       

            arena.update();
        
    }
}
