public class FsLw {
    public static void main(String[] args) {
        String a="debaleena bhattacharjee";
        char x[]=a.toCharArray();
        int n=x.length;
        x[0]=(char) (x[0]-32);
        int i=1;
        while(i!=n){
            if(x[i]==' '){
                int up=x[i+1]-32;
                x[i+1]=(char) up;
            }
            ++i;
        }
        System.out.println(a);
        System.out.println(x);

    }
    
}
