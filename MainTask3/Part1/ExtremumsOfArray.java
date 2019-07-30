package epam.javatraining.maintask3;

public class ExtremumsOfArray {
    public static int toFindMinimum(double[] arr){
        int length = arr.length;
        double min = arr[0];
        int indexOfExtremum=0;
        //int flag=0; //

        for( int i=1;i<length;i++){
            if(arr[i]<min) {
                min = arr[i];
                indexOfExtremum = i;
                //flag = 0;
            }else if(arr[i]==min) {
                indexOfExtremum = -1;
            }
        }
        return indexOfExtremum;
    }
    public static int toFindMaximum(double[] arr){
        int length = arr.length;
        double max = arr[0];
        int indexOfExtremum=0;
        //int flag=0; //

        for( int i=1;i<length;i++){
            if(arr[i]>max) {
                max = arr[i];
                indexOfExtremum = i;
                //flag = 0;
            }else if(arr[i]==max) {
                indexOfExtremum = -1;
            }
        }
        return indexOfExtremum;
    }

    public static int toFindLocalMaximum(double [] arr){
        int length = arr.length;

        for (int i=1;i<length-1;i++){
            if ( arr[i]>arr[i-1]&&arr[i]>arr[i+1]) {
                return i;
            }
        }
        return -1;
    }
    public static int toFindLocalMinimum(double [] arr){
        int length = arr.length;

        for (int i=1;i<length-1;i++){
            if ( arr[i]<arr[i-1]&&arr[i]<arr[i+1]) {
                return i;
            }
        }
        return -1;
    }
}
