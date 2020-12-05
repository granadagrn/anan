public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello Java World");
        System.out.print("I am Seda Celebi");
        System.out.print(" or may be Gundogdu");
        System.out.println();
        System.out.println("I am not sure about myself now");


        String word = "Budapeest";
        String[] alp;
        alp = word.split("");
        System.out.println();


        for (int i = 0; i<alp.length; i++) {
            System.out.println(alp[i]);
        }
    }
}
