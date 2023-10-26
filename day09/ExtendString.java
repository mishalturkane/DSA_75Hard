package day09;

public class ExtendString {
    public static  void extendString(String str){
        StringBuffer output=new StringBuffer();
        int i,j,k,n;
        for(i=0;i<str.length();i++){
            char ch=str.charAt(i);
            n=ch-'0';      /** 3 */
            StringBuffer temp=new StringBuffer();
            for(j=i+2;str.charAt(j)!=')';j++){

                temp.append(str.charAt(j));    /** ab*/

            }
            for(k=1;k<=n;k++){
                output.append(temp);
            }
            i=j;
        }
        System.out.println(output);
    }
    public static void main(String[] args) {
        extendString("3(missu)4(bc)");
    }
}
