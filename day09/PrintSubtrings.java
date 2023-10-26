package day09;

public class PrintSubtrings {
    public static  void printSubStrings(String str){
        int length=str.length();
        int total=0;
        for(int i=0;i<length;i++){
            for(int j=i;j<length;j++){
                    System.out.println(str.substring(i,j+1));
                    total++;
            }
        }
        System.out.println("Total Sub string is="+total);
    }
    public static  void printSubStrings2(String str){
        int length=str.length();
        int total=0;
       /*** StringBuffer sb=new StringBuffer();
        for(int i=0;i<length;i++){

            for(int j=i;j<length;j++){
              sb.append(str.charAt(j));
                System.out.println(sb);
            }
                sb.delete(i,str.length());
        }*/

        for(int i=0;i<length;i++){
            StringBuffer sb=new StringBuffer();
            for(int j=i;j<length;j++) {
                sb.append(str.charAt(j));
                System.out.println(sb);
            }
        }

        System.out.println("Total Sub string is="+total);
    }
    public static void main(String[] args) {
        printSubStrings2("abc");

    }
}
