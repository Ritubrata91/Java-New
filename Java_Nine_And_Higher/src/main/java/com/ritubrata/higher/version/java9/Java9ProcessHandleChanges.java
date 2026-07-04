package com.ritubrata.higher.version.java9;

public class Java9ProcessHandleChanges {

    public static void main(String[] args) {
        ProcessHandle currentProcess = ProcessHandle.current();
        System.out.println("Process PID = " + currentProcess.pid());
    }

}
