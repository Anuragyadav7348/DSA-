public class maxSubarray {

    public static void printSubarrays(int number[]){
        int currSum = 0;
        int maxsum = Integer.MIN_VALUE;

        for(int i = 0; i<number.length; i++){
            int start = i;
            for(int j=1; j<number.length; i++){
                int end = j;
                currSum = 0;
              for(int k=start; k<=end; k++);
              currSum += number[1];
              


            

            }
        }
        System.err.println(currSum);
        if(maxsum < currSum){
            maxsum = currSum;

        }
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,9,7,5};
        printSubarrays(numbers);

       

        
    }
    
}
