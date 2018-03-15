/*
 * Hacker Rank Day 28
 * Databases
 */
package day_28;

import java.util.HashSet;
import java.util.Set;

public class User {

    String username;
    String password;
    int age;
    Set<Integer> orderID;

    public User(String customUserName, String customPassword, int customAge, Set<Integer> orderIDs) {
        this.username = customUserName;
        this.password = customPassword;
        this.age = customAge;
        this.orderID = orderIDs;
    }


    public static void main(String[] args) {
        Set a = new HashSet();
        a.add(12121);
        User kathryn = new User("blondiebytes", "hello world", 25, a);
    }
}
