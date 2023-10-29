package day12;

public class DuplicateString {
    public  static  String dupliString(String str){
         int i,j,k,count=0;
         StringBuffer sb=new StringBuffer();
         int length=str.length();
         for(i=0;i<length;i++){
             for(j=i+1;j<length;j++){
                 if(str.charAt(i)==str.charAt(j)){
                     count++;
                     sb.append(str.charAt(i));
                 }
             }
         }
        System.out.println("count is="+count);
         return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(dupliString("mishalii"));
    }
}
