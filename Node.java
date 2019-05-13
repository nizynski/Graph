public class Node// extends Ball
{
    public Node(double x,double y,double diameter,String colour, GameArena a )
    {
        Ball b = new Ball(x,y,diameter,colour);
        a.addBall(b);
    }   

   
}