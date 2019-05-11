public class Driver{


public static void main(String[]args){

     GameArena arena = new GameArena(500,500);
     Line line[] = new Line[4]; 
    Ball nodeArray[] = new Ball[4];

    for(int i = 0;i< 4;i++){
        if (i==0){
            nodeArray[i]= new Ball(150,250,20,"BLUE");
            line[i]= new Line(150,250,150,150,2,"WHITE");
        }
        else if(i==1){
            nodeArray[i] = new Ball(250,150,20,"GREEN");
            line[i]= new Line(250,150,250,250,2,"WHITE");
        }
        else if(i==2){
            nodeArray[i] = new Ball(250,250,20,"RED");
            line[i]= new Line(250,250,150,250,2,"WHITE");
        }
        else{
            nodeArray[i]= new Ball(150,150,20,"YELLOW");
            line[i] = new Line(150,150,250,150,2,"WHITE");
        }
    }
       
        for( int i=0;i<4;i++){
            arena.addBall(nodeArray[i]);
            arena.addLine(line[i]);
            
           
        }

        

        arena.update();
        
    }
}