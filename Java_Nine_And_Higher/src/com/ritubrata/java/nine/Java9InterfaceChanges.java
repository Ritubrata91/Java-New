package com.ritubrata.java11.interfaces;
public interface Java9InterfaceChanges {

    private static void sayHello() {
        System.out.println("Say Hello！");
    }

    void normalInterfaceMethod();

    default void interfaceMethodWithDefault() {
        init();
    }

    default void anotherDefaultMethod() {
        init();
    }

    private void init() {
        System.out.println("Init Method");
    }

}
