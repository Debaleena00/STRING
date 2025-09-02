public class UpLw {
    public static void main(String[] args) {
        String a="ENGINEER DEBALEENA";
        char x[]=a.toCharArray();
        int n=x.length;
        for(int i=0;i<n;i++){
            int up=x[i]+32;
            x[i]=(char)up;
        }
        System.out.println(a);
        System.out.println(x);
    }
    
}
