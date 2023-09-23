public class TestClass {

    public void publicMethod1(String message) {
        System.out.println("Public method 1 called: " + message);
    }

    @Repeat(times = 2)
    public void publicMethod2(int number) {
        System.out.println("Public method 2 called: " + number);
    }

    protected void protectedMethod1(String message) {
        System.out.println("Protected method 1 called: " + message);
    }

    @Repeat(times = 3)
    protected void protectedMethod2(double number) {
        System.out.println("Protected method 2 called: " + number);
    }
    @Repeat(times = 3)
    private void privateMethod1(String message) {
        System.out.println("Private method 1 called: " + message);
    }

    @Repeat(times = 1)
    private void privateMethod2(boolean value) {
        System.out.println("Private method 2 called: " + value);
    }

}