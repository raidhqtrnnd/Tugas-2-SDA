import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        LinkedList <String> saya = new LinkedList<>();
        
        //menambahkan karakter 
        saya.add("R");
        saya.add("A");
        saya.add("I");
        saya.add("D");
        saya.add("H");
        saya.add("A");
        saya.add(" ");
        saya.add("Q");
        saya.add("A");
        saya.add("T");
        saya.add("R");
        saya.add("U");
        saya.add("N");
        saya.add("N");
        saya.add("A");
        saya.add("D");
        saya.add("A");

        System.out.println("\n"+saya);

        System.out.println("\n==== 1. Menambahkan Karakter =====\n");
        //menambahkan karakter lain
        saya.add("x");
        saya.addLast("y");

        System.out.println(saya);
 
        System.out.println("\n==== 2. Menyisipkan Karakter =====\n");
        //menyisipkan karakter lain
        saya.set(2, "z");
        saya.set(11, "w");
        

        System.out.println(saya);

        System.out.println("\n==== 3. Menghapus Beberapa Karakter =====\n");
        saya.remove(6);
        saya.removeLast();

        System.out.println(saya);

        System.out.println("\n==== 4. Fungsi POP dan PUSH =====\n");
        saya.push("a");
        saya.push("b");

        System.out.println("PUSH");
        System.out.println(saya);
        
        System.out.println("\nPOP");
        saya.pop();
        saya.pop();
        System.out.println(saya);

    }
}
