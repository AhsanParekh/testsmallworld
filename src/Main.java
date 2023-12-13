import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String inp1 = "Good afternoon";
        String inp2 = "Hello, how are you?";
        String inp3 = "Are you twenty-one years old?";
        String exp1 = "afternoon Good";
        String exp2 = "?you are how, Hello";
        String exp3="?old years twenty-one you Are";
        System.out.println("Expected:::::afternoon Good");
        System.out.println(exp1.equals(reverseString(inp1)));
        System.out.println("Expected:::::?you are how, Hello");
        System.out.println(exp2.equals(reverseString(inp2)));
        System.out.println("Expected:::::?old years twenty-one you Are");
        System.out.println(exp3.equals(reverseString(inp3)));
    }
/*
* You are given a phrase and have to invert it, but maintaining the correct word order and
punctuation marks. Word with hyphens must be respected
Some examples:
Input Expected Output
Good afternoon afternoon Good
Hello, how are you? ?you are how, Hello
Are you twenty-one years old?
* */
    public static String reverseString(String data){
        String[] dataset = data.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        int length = dataset.length - 1;
        while (length>=0){
            String word = dataset[length];
            if (word.contains("?")){
                word = word.replace("?","");
                StringBuilder sb1 = new StringBuilder("?");
                sb1.append(word);
                word = sb1.toString();
            }
            if(length>0){
                String nextWord=dataset[length-1];
                if(nextWord.contains(",")){
                    dataset[length-1] = nextWord.replace(",","");
                    StringBuilder sb1 = new StringBuilder(word);
                    sb1.append(",");
                    word = sb1.toString();

                }
            }
            stringBuilder.append(word);
            if(length!=0){
                stringBuilder.append(" ");
            }
            length--;
        }
        return stringBuilder.toString();
    }
}