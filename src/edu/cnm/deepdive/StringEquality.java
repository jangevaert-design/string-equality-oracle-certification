package edu.cnm.deepdive;

public class StringEquality {

  public static void main(String[] args) {
    String name = "Joe";
    String anotherName = "Joe";
    String joe = "Jo" + "e";
    String newName = new String("Joe");

    System.out.println("name == anotherName ->" + (name == anotherName));//true
    System.out.println("name == joe -> " + (name == joe));//true
    System.out.println("name == newName -> " + (name == newName));//false

    System.out.println("name.equals(anotherName) ->" + name.equals(anotherName));//true
    System.out.println("name.equals(joe) -> " + name.equals(joe));//true
    System.out.println("name.equals(newName) -> " + name.equals(newName));//true

    System.out.println("name - identityHashCode -> " + System.identityHashCode(name));
    System.out.println("anotherName - identityHashCode -> " + System.identityHashCode(anotherName));
    System.out.println("joe - identityHashCode -> " + System.identityHashCode(joe));
    System.out.println("newName - identityHashCode -> " + System.identityHashCode(newName));

    String str1 = "abc";
    String str2 = "ab";
    String str3 = str2 + "c";
    String str4 = "ab" + "c";

    System.out.println(str1 == str2);//false
    System.out.println(str1 == str3);//false because concatenation happens at runtime so there was
    //no reference to "abc" in the string pool.
    System.out.println(str1 == str4);//true because this a concatenation of two literals or constants.


  }
}
