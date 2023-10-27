package day10;

public class ExtandString {
     public static void extendString(String str){
         int i,j,k,n;
         StringBuffer output=new StringBuffer();
         for(i=0;i<str.length();i++){
             char ch=str.charAt(i);
             n=ch-'0';
             StringBuffer temp=new StringBuffer();
            for(j=i+2;str.charAt(j)!=')';j++){
                temp.append(str.charAt(j));
            }
            for(k=2;k<=n;k++){
                output.append(temp);
            }
            i=j;
         }
         System.out.println(output);
     }
    public static void main(String[] args) {
       extendString("3(ab)4(cd)");
    }
}
