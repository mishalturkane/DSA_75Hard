package day08;

public class Example2 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("hello world!");
        System.out.println(sb);
       /* System.out.println(sb.charAt(0));
         sb.setCharAt(0,'L');
        System.out.println(sb);*/
       // sb.delete(1,3);
       // System.out.println(sb);
       // sb.reverse();
        sb.replace(6,11,"Ins");
        System.out.println(sb);
    }
}
