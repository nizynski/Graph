public class Driver
{
    

    public static void main(String[]args)
    {
        GameArena arena = new GameArena(500,500);
        Node node =new Node(250,250,20,"BLUE");
        
        arena.addBall(node);
        arena.update();
        
        //arena.node(arena);
    }
}