/**
 * Created by khimin on 05.05.17.
 */
public class StringOperations {
    public static void main(String[] args) {
       String name = "Hello";
        rever(name);
        rever1(name);
        builder(name);
        String string = "Я вступлю в eleks software engineering camp склавши на успішно тести та спібесіду";
        String[] parts = string.split("\\s+");
       for(int i=0;i<parts.length; i++){
           System.out.println(parts[i]);
       }

       String a = "Nazar", b="zar";
        stringContains(a,b);

    }


    static boolean stringContains(String a, String b){
        if(a.contains(b)){
            System.out.println("True");
            return true;
        }
        return false;
    }

    static void rever1(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }

    static void rever(String str) {
        char a[] = str.toCharArray();
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(a[i]);
        }
        System.out.println();
    }

    static void builder(String str) {
        StringBuilder input1 = new StringBuilder();
        input1.append(str);
        input1 = input1.reverse();
        for (int i = 0; i < input1.length(); i++)
            System.out.print(input1.charAt(i));
    }
}
