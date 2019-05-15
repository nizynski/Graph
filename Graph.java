//File:Graph.java

/*
*
* @author katie nizynski
*/

public class Graph
{
    GameArena arena = new GameArena(500,500);
    UndirectedLine undirectedLines[] = new UndirectedLine[4]; 
    Node nodeArray[] = new Node[4];



public Graph()
    {

        nodeArray[0]= new Node(150.0,250.0,"BLUE",arena );
        nodeArray[1] = new Node(250.0,150.0,"GREEN",arena);
        nodeArray[2] = new Node(250.0,250.0,"RED",arena);
        nodeArray[3]= new Node(150.0,150.0,"YELLOW",arena);

        undirectedLines[0]= new UndirectedLine(nodeArray[0],nodeArray[2],arena);
        undirectedLines[0]= new UndirectedLine(nodeArray[1],nodeArray[2],arena);
        undirectedLines[0]= new UndirectedLine(nodeArray[3],nodeArray[1],arena);
        undirectedLines[0]= new UndirectedLine(nodeArray[0],nodeArray[3],arena);
   
         for(int i = 0 ; i < 4 ; i++)
         {
         nodeArray[i].drawNode();
         }

        // for(int i = 0; i<4; i++){
           // System.out.println(nodeArray[i]);
          //  System.out.println(undirectedLines[i]);
         //}

            arena.update();
        
    }
}
