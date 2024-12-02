public class NumerivValueFromStrinf {
    public static void main(String[] args) {
        int count=0;
        String name= "amitit3984";
        boolean answer ;
        char n[]= name.toCharArray();
        for(int i=0;i<name.length();i++){
answer= Character.isDigit(n[i]);
if(answer==true){
    count++;

}
        }
        
	System.out.println("how many string value  "+ count );

    }
}
