/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hashTable;

import hashTable.structure.HashMap;

public class App {


    public static void main(String[] args) {

        HashMap<String,String>hashMap = new HashMap<>();

        hashMap.set("JAVA", "JAVA");
        hashMap.set("Amman", "Amman");
        hashMap.set("Jordan", "Jordan");
        hashMap.set("J", "J");
        hashMap.set("Bob", "Bab");
        hashMap.set("Carl", "Carl");

        System.out.println(hashMap.contain("J"));

        System.out.println(hashMap.get("Bob"));
        System.out.println(hashMap.getSize());
    }
}