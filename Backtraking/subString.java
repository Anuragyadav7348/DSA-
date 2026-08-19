public class subString {

    public static void findSubsets(String str,String ans,int i){
        //base case 
        if(i == str.length()){
            if(ans.length()==0) {
                System.err.println("null");
            } else {System.err.println(ans);
                
            }
           
            return;

        }
        //yes choice 
        findSubsets(str, ans+str.charAt(i), i+1);
        //No choice 
        findSubsets(str, ans, i+1);


    }

    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str,"",0); 
    }
    
}
