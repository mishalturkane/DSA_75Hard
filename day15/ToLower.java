package day15;

public class ToLower {
    public static String getToLoweCase(String str){
        StringBuffer sb=new StringBuffer();
        sb.append(str.toLowerCase());
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(getToLoweCase("Mishal"));
    }
}
