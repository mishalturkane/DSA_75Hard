package day16;

public class ToUpper {
    public static String getToLoweCase(String str){
        StringBuffer sb=new StringBuffer();
        sb.append(str.toUpperCase());
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(getToLoweCase("Mishal"));
    }
}
