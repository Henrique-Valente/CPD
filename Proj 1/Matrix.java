import java.util.Scanner;

public class Matrix {
    public static int line;
    public static int column;
    public static int selected;

    static void onMult(){

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

        System.out.println("Selected: "+ selected);
        System.out.println("Column: "+ column);
        System.out.println("Line: "+ line);

        in.close();
    }
}
