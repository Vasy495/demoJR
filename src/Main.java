import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        String str = "I love java";

        String[] words = str.split(" ", 2);

        Arrays.stream(words).forEach(System.out::println);


    }

}