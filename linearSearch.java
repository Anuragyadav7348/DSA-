public class linearSearch {
    public static void main(String[] args) {
        
    }
    
}

static int linearSearch(int[] arr, int target){
    if (arr.lenght ==0){
        return -1;

    }
for (int index = 0; index < arr.length; index++){
    int element = arr[index];
    if (element == target){
        return index;
    }
}

}
