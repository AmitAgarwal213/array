public class ReverseEachSTring {
    public static void main(String[] args) {
        String input= "I am Student";
        String result = reverseString(input);
        System.out.println(result);
    }

    public static String reverseString(String str){
String words[] = str.split(" ");
for(int i=0;i<words.length;i++){
    words[i]= new StringBuilder(words[i]).reverse().toString();
    }
return String.join(" ", words);
}
}