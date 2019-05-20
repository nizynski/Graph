//File:Node.java

/** 
* This class creates a node using ball to add paramters such as name and game arean which then can be assigned when a ball is created
* @author katie nizynski
*/
public class Node

{

    /**instance variables  */

    private Ball b;
    private GameArena a;
    private String Name;


 /**Node Method.
     * 
     * This method is used to create a node
     * @param string, double , double , string , GameArena
     * @return Node
     */


    public Node(String name ,double x,double y,String colour, GameArena arena)
    {
        Name = name;
        a = arena;
        b = new Ball(x,y,20,colour);
        
    }   


     /**getName Method.
     * 
     * This method is used to get the name of the node which is asigned when created
     * @param nothing
     * @return String
     */

    public String getName()
    {

        return Name; 
    }

     /**drawNode Method.
     * 
     * This method is used to draw the node
     * @param 
     * @return 
     */
    public void drawNode()
    {
        a.addBall(b);
       
    }


 /**getNode Method.
     * 
     * This method is used to get a node
     * @param nothing.
     * @return Ball
     */

    public Ball getNode()
    {
       return b; 
    }

     /**getx Method.
     * 
     * This method is used to get the x coordinate for the node 
     * @param nothing.
     * @return double
     */

    public double getX()
    {
       return b.getXPosition(); 
    }
 /**getY Method.
     * 
     * This method is used to get the y coordinate of the node
     * @param nothing.
     * @return double
     */

   public double getY()
    {
      return b.getYPosition();
    }

   
}