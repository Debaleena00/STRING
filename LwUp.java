public class LwUp {
    public static void main(String[] args) {
        String a="i am an engineer";
        char x[]=a.toCharArray();
        int n=a.length(); 
        int i=0;
        while(i!=n){
            int l=x[i]-32;
            x[i]=(char)l;
            ++i;
        }
        System.out.println(a);
        System.out.println(x);
    }
}
