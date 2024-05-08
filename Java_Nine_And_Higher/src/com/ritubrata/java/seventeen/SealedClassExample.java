package com.ritubrata.java.seventeen;
  sealed class SealedClassExample permits Manish, Anjali
    {
        public void printName()
        {
            System.out.println("Default");
        }
    }
    non-sealed class Manish extends SealedClassExample
    {
        public void printName()
        {
            System.out.println("Manish Sharma");
        }
    }
   /* sealed class Vartika extends SealedClassExample //Sealed class must have subclasses
    {
        public void printName()
        {
            System.out.println("Vartika Dadheech");
        }
    }*/
    final class Anjali extends SealedClassExample
    {
        public void printName()
        {
            System.out.println("Anjali Sharma");
        }
    }


