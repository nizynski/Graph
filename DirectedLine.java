//File:DirectedLine.java

/*
*
* @author katie nizynski
*/
public class DirectedLine
{
   private Arrow a;
   private Node start;
   private Node end; 
   public DirectedLine(Node s ,Node e, GameArena arena) 
    {
       
       start = s;
       end = e;
         a = new Arrow(s.getX(),s.getY(),e.getX(),e.getY(), 6.0,"WHITE",arena);
        a.setArrowHeadPosition(85.0);
       // arena.addArrow(a);
        arena.update();
    }


   public void displayDirected()
    {
      System.out.println("Node " + start.getName() + " is connected to " + end.getName());
    }

}

 
    