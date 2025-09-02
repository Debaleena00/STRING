public class CnVwSc {
    public static void main(String[] args) {
        String a="I am an Engineer Debaleena";
        char x[]=a.toCharArray();
        int n=x.length;
        int i=0;
        int c=0,s=0,v=0;
        while(i!=n){
            if((x[i]>=65 && x[i]<=96)||(x[i]>=97 && x[i]<=128)){
         if((x[i]=='a' || x[i]=='e' || x[i]=='i' || x[i]=='o' || x[i]=='u')||(x[i]=='A' || x[i]=='E' || x[i]=='I' || x[i]=='O' || x[i]=='U')){v++;}
        else{c++;}
        }
        else{s++;}
            i++;}
        System.out.println(c);System.out.println(s);System.out.println(v);
     }
}
