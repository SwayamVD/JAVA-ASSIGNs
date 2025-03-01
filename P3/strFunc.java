import java.util.Scanner;
public class strFunc {
    String str1;
    String str2;
    Scanner sc = new Scanner(System.in);
    strFunc(){
        System.out.print("Enter First String: ");
        str1 = sc.nextLine();
        System.out.print("Enter Second String: ");
        str2 = sc.nextLine();
    }
    public void stringOperations(){
        System.out.println("----------------String Operations-----------------");
        System.out.println("\n1. charAt(): Charactor at 2nd index in '"+str1+"' is ("+str1.charAt(2)+")");
        System.out.println("\n2. compareTo(): Comparing '"+str1+"' and '"+str2+"' we get: "+str1.compareTo(str2));
        System.out.println("\n3. concat(): Concatinating '"+str1+"' and '"+str2+"' we get: "+str1.concat(str2));
        System.out.println("\n4. equal(): Check if '"+str1+"' and '"+str2+"' are Equal: "+str1.equals(str2));
        System.out.println("\n5. replace(): Replacing 'aya' in '"+str1+"' with 'non' "+str1.replace("aya","non"));
        System.out.println("\n6. trim(): Triming '"+str1+"' : "+str1.trim());
    }
    public static void main(String[] args) {
        strFunc a = new strFunc();
        a.stringOperations();
    }
}
