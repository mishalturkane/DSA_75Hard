package day10;

public class ReverseString {
    public  static StringBuffer getRevString(String str){
        StringBuffer sb=new StringBuffer();
        sb.append(str);
        for(int i=str.length()-1;i>=0;i--){
            sb.append(sb.charAt(i));
        }
        return sb;
    }
    public static void main(String[] args) {
        System.out.println(getRevString("Mishal"));
    }
}
