public class StrInt {
    public static void main(String[] args) {
        String a="12";
        char y[]=a.toCharArray();
        int n=y.length;
        int i=0;
        while(i!=n){
            if((y[i]!='A' && y[i]>='Z')||(y[i]!='a' && y[i]>='z')){
                System.out.println("String contain no Integer");
                System.exit(0);
            }
            else{
                i++;
                continue;
            }
        }
        System.out.println("String contain Integer");
    }
    
}
