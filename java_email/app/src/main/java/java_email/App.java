/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package java_email;

public class App {

    public String getGreeting(){
        return "Hello";
    }

    public static void main(String[] args) {
        Email em1 = new Email("Joe", "Tully");
        System.out.println(new App().getGreeting());
        em1.displayInfo();
    }
}
