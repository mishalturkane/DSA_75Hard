package day13;

public class RemoveSpecificChar {
    public static  String removeSpecific(String str){
        int length=str.length();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<length;i++){
            if(str.charAt(i)=='#'){
                continue;
            }
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(removeSpecific("test#string"));
    }
}
