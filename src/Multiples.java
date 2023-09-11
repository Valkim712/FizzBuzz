public class Multiples {
    public static void main(String[] args) {
        int i = 1;
        int counter = 0;
        while (i < 1000) {
            if ((i % 5 == 0) || (i % 3 == 0)) {
                counter++;
            }
            i++;
        }
        System.out.println(counter);
}}
