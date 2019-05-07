public class Driver{


public static void main(String[]args){

     GameArena arena = new GameArena(500,500);
    Ball nodeArray[] = new Ball[4];

    for(int i = 0;i< 4;i++){
        if (i==0){
            nodeArray[i]= new Ball(150,250,20,"BLUE");
        }
        else if(i==1){
            nodeArray[i] = new Ball(250,150,20,"GREEN");
        }
        else if(i==2){
            nodeArray[i] = new Ball(250,250,20,"RED");
        }
        else{
            nodeArray[i]= new Ball(150,150,20,"YELLOW");
        }
    }
       
        //Ball node =new Node(250,250,20,"BLUE");
        for( int i=0;i<4;i++){
            arena.addBall(nodeArray[i]);
           
        }

        arena.update();
        
    }
}