package com.ritubrata.java11.processor;

public class Java9ProcessHandleChanges {

    public static void main(String[] args) {
        ProcessHandle currentProcess = ProcessHandle.current();
        System.out.println("Process PID = " + currentProcess.pid());
    }

}
