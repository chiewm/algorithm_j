package c01;

public class ex13 {
    public static void transposedMatrix(int[][] matrix)
    {
        for(int i = 0; i < matrix[0].length; i++)
        {
            for(int j = 0; j < matrix.length; j++ )
            {
                System.out.printf("%4d",matrix[j][i]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        int[][] a = {{2,2,2}, {3 ,3, 3}};
        transposedMatrix(a);
        System.out.println(a[1].length);
    }
}
