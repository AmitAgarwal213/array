public class CountChar {
    public static void main(String[] args) {
        String n= "aaabbc";
        int count =0;
char r[]= n.toCharArray();
for(int i =0;i<r.length;i++){
    if(r[i]==r[i+1]){
    ++count;
    System.out.println(count);
    }
    else{
        System.out.println();
    }

}
        
        }
    }

