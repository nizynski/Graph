//File:UndirectedLine.java

/** 
* This class creates Lines without arrows to represent undriected archs connecting the nodes, which can be called in any of the graph classes.
*
* @author katie nizynski
*/


public class UndirectedLine
{
/** instance varaibles */
   private Line a;
   private Node start;
   private Node end;
   public UndirectedLine(Node s ,Node e, GameArena arena) 
    {
        start = s;
        end = e;
        a = new Line(s.getX(),s.getY(),e.getX(),e.getY(),2,"WHITE");
        arena.addLine(a);

        arena.update();
    }

    public void displayUndirected()
    {
      System.out.println("Node " + start.getName() + "is connected to " + end.getName());
    }
 
}