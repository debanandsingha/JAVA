public class binarySearch {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int x=binSearch(arr, 3);

        if(x==-1){
            System.out.println("Not Found!");
        }else{
            System.out.println("Found at index: "+x+" and position: "+(x+1));
        }
    }

    static int binSearch(int arr[], int size){
        int item=3;
        int low=0;
        int high=size-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==item){
                return mid;
            }else if(item>arr[mid]){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
}
