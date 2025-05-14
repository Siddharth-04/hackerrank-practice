class PeakIndexInMountainArray {
    public static int binarySearch(int start,int end,int[] arr){
        int mid = start + (end-start)/2;

        if(arr[mid] >= arr[mid+1] && arr[mid] >= arr[mid-1]){
            return mid;
        }
        else if(arr[mid] > arr[mid+1]){
            return binarySearch(start,mid-1,arr);
        }
        else{
            return binarySearch(mid+1,end,arr);
        }
    }
    public int peakIndexInMountainArray(int[] arr) {
        return binarySearch(0,arr.length-1,arr);
    }
}