import java.util.*;
public class twodarray {
public static void main(String[] args) {
    int matrix[][] = new int[3][3];
    int n = matrix.length, m = matrix[0].length;
    Scanner sc = new Scanner(System.in);

    //Input
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            matrix[i][j] = sc.nextInt();
            
        }
        
    }
       for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            System.err.println(matrix[i][j]+"");
            System.err.println("hello");

            
        }
        System.out.println();
        
    }
    
}
    
}
