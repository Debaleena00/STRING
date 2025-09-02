class AnaG{
    public static void main(String args[]){
        String a="listen";
        String b="silents";
        char x[]=a.toCharArray();
        char y[]=b.toCharArray();
        int n=a.length();
        int n1=b.length();
        int i=0;
        while(i!=n && i!=n1){
            java.util.Arrays.sort(x);
            java.util.Arrays.sort(y);
                if(x[i]!=y[i]){
                    System.out.println("No");
                    System.exit(0);
                }
                else{
                    i++;
                    continue;
                }
            }
            System.out.println("yes");
        }
    }