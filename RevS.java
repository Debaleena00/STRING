public class RevS {
    public static void main(String[] args) {
        String a="Debaleena";
        char y[]=a.toCharArray();
        int n=y.length;
        char x[]=new char[n];
        int i=0;
        while(i!=n){
            x[n-i-1]=y[i];
            i++;
        }
        System.out.println(x);
    }
    
}
