import java.util.*;

public class Strings {
public static void printLetters(String str){
    for(int i=0; i<str.length(); i++){
        System.err.println(str.charAt(i)+ " ");
    }
}


    public static void main(String[] args) {
        char arr[] = {'a','b','c','b'};

        String str = "abcd";

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        System.out.println(name);
        String fullName = "Tony Stark";
        System.err.println(fullName.length());

        //conacatenation
        String firstName = "Anurag";
        String lastName = "Yadav";
        String FullName = firstName + " " + lastName;
        System.out.println(fullName.charAt(0));
        printLetters(fullName);

    }
}