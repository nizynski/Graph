//File:Graph.java

public class Graph{

private int matrix[][];
private int verticies;


public Graph(int verticies)
{
    matrix = new int[verticies][verticies];
}

public void addEdge(int i , int j)
{
    matrix[i][j] = 1;
    matrix[j][j] = 1;
}

public void removeEdge(int i , int j)
{
    matrix[i][j] = 0; 
    matrix[j][i]= 0;
}

public int isEdge(int i , int j)
{
    return matrix[i][j];
}

public boolean pairs(int i, int j )
{
    if (matrix[i][j] = 1){
    return true; }
}

public static void main(String args[])
{
}
}

