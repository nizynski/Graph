public class Graph3
{
    GameArena arena = new GameArena(500,500);
    DirectedLine directedLines[] = new DirectedLine[4]; 
    Node nodeArray[] = new Node[4];



public Graph3()
    {

        nodeArray[0]= new Node(150.0,250.0,"BLUE",arena );
        nodeArray[1] = new Node(300.0,250.0,"GREEN",arena);
        nodeArray[2] = new Node(225.0,400.0,"RED",arena);
        nodeArray[3]= new Node(225.0,100.0,"YELLOW",arena);

        directedLines[0]= new DirectedLine(nodeArray[0],nodeArray[2],arena);
        directedLines[0]= new DirectedLine(nodeArray[2],nodeArray[1],arena);
        directedLines[0]= new DirectedLine(nodeArray[1],nodeArray[3],arena);
        directedLines[0]= new DirectedLine(nodeArray[3],nodeArray[0],arena);
   
         for(int i = 0 ; i < 4 ; i++)
         {
         nodeArray[i].drawNode();
         }

    

            arena.update();
        
    }
}