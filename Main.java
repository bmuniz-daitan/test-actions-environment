public class Main {

    public static void main(String args[]) {
        var env = System.getenv("SECRET");
	System.out.println("Your secret is: " + env);
    }

}
