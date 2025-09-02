class Cpy{
    public static void main(String[] args) {
        String a="Debaleena";
        char y[]=a.toCharArray();
        int n=y.length;
        char z[]=new char[n];
        int i=0;
        while(i!=n){
            z[i]=y[i];
            i++;
        }
        System.out.println(y);
        System.out.println(z);

    }
}