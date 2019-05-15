public class Node

{
    private Ball b;
    private GameArena a;

    public Node(double x,double y,String colour, GameArena arena)
    {
        a = arena;
        b = new Ball(x,y,20,colour);
        //arena.addBall(b);
    }   

    public void drawNode()
    {
        a.addBall(b);
    }

    public Ball getNode()
    {
       return b; 
    }

    public double getX()
    {
       return b.getXPosition(); 
    }

   public double getY()
    {
      return b.getYPosition();
    }

   
}