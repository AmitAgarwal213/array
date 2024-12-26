public class SecondHighestArray {
    public static void main(String[] args) {
        String n= "hello";
        String output= "";
        
        for(int i =0;i<n.length()-1;i++){
char rev = n.charAt(i+1);

output = rev+output;
        }
System.out.println(n.substring(0,1)+output);
    
}

}