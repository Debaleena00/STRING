public class Len {
    public static void main(String[] args) {
        String a="Riya Debu";
        a=a.concat("\0");
        char c[]=a.toCharArray();
        int i=0;
        int cn=0;
        while(c[i]!='\0'){
            cn++;
            i++;
        }
        System.out.println(cn);
    }
    
}
