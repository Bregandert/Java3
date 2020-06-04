import java.util.Arrays;

public class Lesson6 {

    public static void main(String[] args) {
        int[] inArray = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        System.out.println("Входной массив " + Arrays.toString(inArray));
        System.out.println("Выходной массив "+Arrays.toString(afterLastFour(inArray)));
        int[] arr1={1, 1, 1, 4, 4, 1, 4, 4};
        int[] arr2={1, 1, 1, 1, 1, 1};
        int[] arr3={4, 4, 4, 4};
        int[] arr4={1, 4, 4, 1, 1, 4, 3};
        System.out.println();
        System.out.println("Массив "+Arrays.toString(arr1)+" -> "+array14(arr1));
        System.out.println("Массив "+Arrays.toString(arr2)+" -> "+array14(arr2));
        System.out.println("Массив "+Arrays.toString(arr3)+" -> "+array14(arr3));
        System.out.println("Массив "+Arrays.toString(arr4)+" -> "+array14(arr4));
    }


    public static int[] afterLastFour(int[] inArray) {
        for (int i=inArray.length-1; i>=0; i--){
            if (inArray[i]==4){
                return Arrays.copyOfRange(inArray,i+1,inArray.length);
            }
        }
        throw new RuntimeException("4 not found");
    }

    public static boolean array14(int[] inArray){
        boolean be1=false, be4=false;
        for(int i=0;i<inArray.length;i++){
            if (inArray[i]==1) {
                be1 = true;
            }
            else if (inArray[i]==4){
                be4=true;
            } else {
                return false;
            }
        }
        return be1 & be4;
    }
}
