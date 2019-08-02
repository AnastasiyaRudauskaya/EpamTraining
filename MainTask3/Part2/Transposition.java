package epam.javatraining.maintask3Matrix;

public class Transposition {
    public static boolean isMainDiagSymmetric(double [][] matrix){
        if (matrix.length!=matrix[0].length) return false;

        for (int i=1;i<matrix.length;i++){
            for (int j=i+1;i<matrix.length;i++){
                if (matrix[i][j]!=matrix[j][i]){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isSecondaryDiagSymmetric(double [][] matrix){
        if (matrix.length!=matrix[0].length) return false;

        for (int i=matrix.length-1;i>0;i--){
            for (int j=i+1;j<matrix.length;j++){
                if (matrix[i][j]!=matrix[j][i]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void transponMatrix(double [][] matrix){
        double temp;

        for (int i=0;i<matrix.length;i++){
            for (int j=i+1;i<matrix.length;j++){
                temp=matrix[j][i];
                matrix[j][i]=matrix[i][j];
                matrix[i][j]=temp;
            }
        }
    }
}
