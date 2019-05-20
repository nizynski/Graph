//File:Graph2.java

/*
*
* @author katie nizynski
*/
public class Graph2
{
    GameArena arena = new GameArena(500,500);
    UndirectedLine undirectedLines[] = new UndirectedLine[10]; 
    Node nodeArray[] = new Node[5];



public Graph2()
    {

        nodeArray[0]= new Node("a",170.0,300.0,"BLUE",arena );
        nodeArray[1] = new Node("b",300.0,150.0,"GREEN",arena);
        nodeArray[2] = new Node("c",290.0,300.0,"RED",arena);
        nodeArray[3]= new Node("d",150.0,150.0,"YELLOW",arena);
        nodeArray[4]= new Node("e",225.0,100.0,"PURPLE",arena);

        undirectedLines[0]= new UndirectedLine(nodeArray[0],nodeArray[2],arena);
        undirectedLines[1]= new UndirectedLine(nodeArray[1],nodeArray[2],arena);
        undirectedLines[2]= new UndirectedLine(nodeArray[3],nodeArray[1],arena);
        undirectedLines[3]= new UndirectedLine(nodeArray[0],nodeArray[3],arena);
        undirectedLines[4]= new UndirectedLine(nodeArray[4],nodeArray[1],arena); 
        undirectedLines[5]= new UndirectedLine(nodeArray[4],nodeArray[3],arena); 
        undirectedLines[6]= new UndirectedLine(nodeArray[0],nodeArray[1],arena); 
        undirectedLines[7]= new UndirectedLine(nodeArray[2],nodeArray[3],arena); 
        undirectedLines[8]= new UndirectedLine(nodeArray[4],nodeArray[0],arena); 
        undirectedLines[9]= new UndirectedLine(nodeArray[4],nodeArray[2],arena); 
   
         for(int i = 0 ; i < 5; i++)
         {
         nodeArray[i].drawNode();
         undirectedLines[i].displayUndirected();
         }
       
         arena.update();
        
    }
}

