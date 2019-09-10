
public class NewClass {
    public static void main(String[] args) {
        
        int matriz1 [][] = new int [5][5];   //Matriz de valores solo permite 1 y 0
        int matriz2 [][] = new int [5][5];   //Matriz de signos solo permite '+','-' y '+/-' (1,2,3)

        for(int i=0;i<matriz1.length;i++)
        {
            for(int j=0; j<matriz1.length;j++){
                matriz1[i][j]=0;
                matriz2[i][j]=0;
            }
        }
        
                System.out.println("m1");
        for(int i=0;i<5;i++)
        {
            for(int j=0; j<matriz1.length;j++){
                System.out.print(matriz1[i][j]+'-');
            }System.out.println("");
        }
        System.out.println("m2");
        for(int i=0;i<matriz2.length;i++)
        {
            for(int j=0; j<5;j++){
                System.out.print(matriz2[i][j]+'-');
            }System.out.println("");
        }
}
}
