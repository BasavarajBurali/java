public class Main {
    public static void main(String[] args) {
        String name="MADAM";
        String org_String="MADAM";
        String rev="";//comment
        for(int i=name.length()-1;i>=0;i--){
            rev=rev+name.charAt(i);
        }
        if(org_String.equals(rev)){
            System.out.println("its palindrome");
        }else{
            System.out.println("Its not palindrome");
        }
    }
}