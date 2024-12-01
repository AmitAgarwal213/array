public class SpecialSpecialCharctCharct {
    public static void main(String[] args) {
        
        String name="hhffu8474774y74$@$";

        boolean answer ;
        int count =0;
        char n[]= name.toCharArray();
    
        for(int i=0;i<name.length();i++){
             answer= Character.isAlphabetic(n[i]);
            
             if(answer==true){
                count++;
             }
        }
        
	System.out.println("how many special value  "+ count );
    }
}
