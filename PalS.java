public class PalS {
    public static void main(String[] args) {
        String a="race car";
        a=a.replaceAll("\\s","");
        char y[]=a.toCharArray();
        int n=y.length;
        char x[]=new char[n];
        int i=0;
        while(i!=n){
            x[n-i-1]=y[i];
            i++;
        }
        i=0;
        while(i!=n){
        if(x[i]!=y[i]){
        System.out.println("Not Palindrome Number");
        System.exit(0);
        }
        else{
            ++i;
            continue;
        }
    }
    System.out.println("Palindrome Number");
    }
}
