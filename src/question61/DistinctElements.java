package question61;

public class DistinctElements {

	public static void main(String[] args) {
		int[] nums = {20,24,7,64,56,7,8,24,7};
        DistinctElements.printDistinctElements(nums);

	}
	
	public static void printDistinctElements(int[] arr){
        
        for(int i=0;i<arr.length;i++){
            boolean isDistinct = false;
            for(int j=0;j<i;j++){
                if(arr[i] == arr[j]){
                    isDistinct = true;
                    break;
                }
            }
            if(!isDistinct){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
