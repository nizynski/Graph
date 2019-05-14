//File:Graph.java

/*
*
* @author katie nizynski
*/

public class Graph
{
 GameArena arena = new GameArena(500,500);
     Line line[] = new Line[4]; 
    Node nodeArray[] = new Node[4];



public Graph(){
    for(int i = 0;i< 4;i++)
    {
        if (i==0){
            nodeArray[i]= new Node(150.0,250.0,"BLUE",arena );
            line[i]= new Line(150,250,150,150,2,"WHITE");
        }
        else if(i==1){
            nodeArray[i] = new Node(250.0,150.0,"GREEN",arena);
            line[i]= new Line(250,150,250,250,2,"WHITE");
        }
        else if(i==2){
            nodeArray[i] = new Node(250.0,250.0,"RED",arena);
            line[i]= new Line(250,250,150,250,2,"WHITE");
        }
        else{
            nodeArray[i]= new Node(150.0,150.0,"YELLOW",arena);
            line[i] = new Line(150,150,250,150,2,"WHITE");
        }
    }
       
        for( int i=0;i<4;i++)
        {
            arena.addBall(nodeArray[i].getNode());
            arena.addLine(line[i]);
            
           
        }

        

        arena.update();
        
    }
}








