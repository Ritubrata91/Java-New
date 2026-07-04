package nine;
public interface Java9InterfaceChanges {

    private static void sayHello() {
        System.out.println("Say Hello！");
    } //new addition in Java 9 private static method

    void normalInterfaceMethod();

    default void interfaceMethodWithDefault() {
        init();
    }

    default void anotherDefaultMethod() {
        init();
    }

    private void init() {
        System.out.println("Init Method");
    } //new addition in Java 9 private method

}
