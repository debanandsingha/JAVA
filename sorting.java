public class sorting {
    public static void main(String[] args) {
        int arr[]={3,2,1};
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]);
        // }

        // selectionSort(arr);
        // bubbleSort(arr);
        // insertionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }

    //selection sort
    static void selectionSort(int []arr){

        int min, i, j;
        for(i=0; i<arr.length-1 ;i++){
            min=i;
            for(j=i+1; j<arr.length; j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }

            if(min!=i){
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
             }
        }
        
    }
    
    //bubble sort
    static void bubbleSort(int[] arr){
        for(int i=0; i< arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
    }
    
    //insertion sort
    static void insertionSort(int[] arr){
        int i, j, temp;
        for(i=1; i<arr.length; i++){
            temp=arr[i];
            j=i-1;
            while(j>=0 && temp<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
}
