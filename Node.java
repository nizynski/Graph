//File:Node.java

/*
*
* @author katie nizynski
*/
public class Node

{
    private Ball b;
    private GameArena a;
    private String Name;

    public Node(String name ,double x,double y,String colour, GameArena arena)
    {
        Name = name;
        a = arena;
        b = new Ball(x,y,20,colour);
        
    }   

    public String getName()
    {

        return Name; 
    }

    public void drawNode()
    {
        a.addBall(b);
       // arena.update()
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