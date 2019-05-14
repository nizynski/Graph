public class Node


{
    private Ball b;

    public Node(double x,double y,String colour)
    {
        //super(x,y,diameter,colour);
        b = new Ball(x,y,20,colour);
        //a.addBall(b);
    }   

    public Ball getNode()
    {
        return b; 
    }

 //   public int getX()
   // {
    //    return b.getX(); 
    //}

    //public int getY()
    //{
      //  return b.getY();
    //}

   
}