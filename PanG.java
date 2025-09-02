public class PanG{
    public static void main(String[] args) {
        String 
        a=a.replace(" ","");
        int n=a.length();
        
                for(char j='a';j<='z';j++){
                    if(a.indexOf(j)<0){
                        System.out.println("not pangram");
                        System.exit(0);
                    }
                }
                System.out.println("yes");
    }
}