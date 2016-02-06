package question58;

public class SortIntegerArray {

	public static void main(String[] args) {
		//Without using Arrays.sort function
        int i;
        int value[] = {35,7,56,-169,32,43,34,-48,23};
        System.out.print("Values before sorting: \n");
        for(i = 0; i < value.length; i++)
            System.out.println( value[i]+"  ");               
        sort(value, value.length);
        System.out.print("Values after sorting: \n");       
        for(i = 0; i <value.length; i++){
            System.out.println(value[i]+"  ");
        }
    }

    private static void sort(int value[], int n) {
     for (int i = 1; i < n; i++){
          int j = i;
          int B = value[i];
          while ((j > 0) && (value[j-1] > B)){
            value[j] = value[j-1];
            j--;
          }
          value[j] = B;
        }
    }
}
