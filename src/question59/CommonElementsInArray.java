package question59;

public class CommonElementsInArray {

	public static void main(String a[]){
        int[] arr1 = {5,56,10,8,65};
        int[] arr2 = {56,7,88,9,65,8,5};
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}
