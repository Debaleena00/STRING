public class SpcLw {
    public static void main(String[] args) {
        String a="i am a engineer debaleena bhattacharjee";
        char y[]=a.toCharArray();
        int n=y.length;
        int i=0;
        while(i!=n){
            if(y[i]!=' '){
                int lw=y[i]-32;
                y[i]=(char)lw;
            }
            ++i;
        }
        System.out.println(a);
        System.out.println(y);
    }
}
