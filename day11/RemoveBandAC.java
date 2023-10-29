package day11;

public class RemoveBandAC {
    public  static  String removeAandBC(String str){
        StringBuffer sb=new StringBuffer();
        int length=str.length();
       for(int i=0;i<length;i++){
           if(str.charAt(i)=='a' || str.charAt(i)=='b'|| str.charAt(i)=='c' ){
               continue;
           }
           sb.append(str.charAt(i));
       }
       return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(removeAandBC("mishalbchain"));
    }
}
