import java.util.regex.Pattern;

public class Source {
    public static void main(String[] args) {
        String name = "Ryan";
        System.out.println(greet(name).equals("Hello, Ryan how are you doing today?"));
    }
    public static String greet(String name)
    {
        return String.format( "Hello, %s how are you doing today?",name);
    }
}
