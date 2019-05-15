public class UndirectedLine
{
   private Line a;
   public UndirectedLine(Node s ,Node e, GameArena arena) 
    {
        a = new Line(s.getX(),s.getY(),e.getX(),e.getY(), 2, "WHITE");
        arena.addLine(a);
    }
    
}