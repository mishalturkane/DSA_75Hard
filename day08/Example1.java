package day08;

public class Example1 {
    public static void main(String[] args) {
        StringBuffer s=new StringBuffer("D");
        System.out.println(s.length());;
        System.out.println(s.capacity());
       // s.ensureCapacity(40);
        s.append(" placement");
        System.out.println(s);
        System.out.println(s.length());;
        System.out.println(s.capacity());
       System.out.println(s);
        System.out.println(s.length());;
        System.out.println(s.capacity());
      //  s.ensureCapacity(83);
        System.out.println(s);
        System.out.println(s.length());;
        System.out.println(s.capacity());

    }
}
