public class EqualsTester {
    public static void main(String[] args) {

        String str1, str2;
        str1 = "raz dwa trzy";

        str2 = new String("raz dwa trzy");


        //str2 = str1;
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("Ten sam obiekt? " + (str1 == str2));
        System.out.println("Ta sama zawartosc? " + (str1.equals(str2)));



        String name = "Tomek";
        System.out.println(name.getClass().getName());
        System.out.println(name.getClass().getSimpleName());

        System.out.println(" ");
        System.out.println(name instanceof String);
        System.out.println(name instanceof Object);

        Object object = new Object();
        object = new Integer (100);
        System.out.println(object instanceof Integer);



    }



}
