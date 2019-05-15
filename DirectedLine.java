public class DirectedLine
{
   private Arrow a;
   public DirectedLine(Node s ,Node e, GameArena arena) 
    {
        a = new Arrow(s.getX(),s.getY(),e.getX(),e.getY(), 6.0,"WHITE",arena);
        
       // arena.addArrow(a);
        arena.update();
    }
}
    