package day12;

public class ConcateString {
    public  static  String concatString(String str){
        StringBuffer sb=new StringBuffer();
        int length=str.length();
        int i;
        for (i=0;i<length;i++){
                if(str.charAt(i)==' '){
                    i=i+4;
                    continue;
                }
                sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(concatString("food and door"));
    }


}
