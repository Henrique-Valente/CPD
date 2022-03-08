import java.util.Scanner;

public class Matrix {
    public static int line;
    public static int column;
    public static int selected;

    static void printFullMatrix(double[][] matrix, int l, int c){
        System.out.println("-----------------------------------");
        for(int i=0; i<l; i++){
            for(int j=0; j<c; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------------");
    }

    static void printFirstLine(double[][] matrix, int c){
        System.out.println("-----------------------------------");
        for(int i=0; i<1; i++){
            for(int j=0; j<Math.min(c,10); j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------------");
    }

    static void onMult(){
        double[][] pha = new double[line][column]; 
        double[][] phb = new double[line][column]; 
        double[][] phc = new double[line][column]; 

        for(int i=0; i<line; i++)
		    for(int j=0; j<line; j++)
			    pha[i][j] = (double)1.0;

	    for(int i=0; i<column; i++)
		    for(int j=0; j<column; j++)
			    phb[i][j] = (double)(i+1);

        for(int i=0; i<line; i++)
            for(int j=0; j<column; j++)
                for(int k=0; k<line; k++)
                    phc[i][j] += pha[i][k] * phb[k][j];

        printFirstLine(phc, column); //Imprime 10 elementos da matriz
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("1. Multiplication");
        System.out.println("2. Line Multiplication");
        System.out.println("3. Block Multiplication");
        System.out.print("Selection?: ");
        selected = in.nextInt();

        System.out.print("Dimensions: lins=cols ? ");
        column = in.nextInt();
        line = column;

        switch (selected) {
            case 1:
                onMult();
                break;
        
            default:
                System.out.println("Another");
                break;
        }

        in.close();
    }
}
