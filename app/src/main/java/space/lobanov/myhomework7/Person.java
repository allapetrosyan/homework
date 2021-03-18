package space.lobanov.myhomework7;

import java.io.Serializable;

public class Person implements Serializable {
    String name;
    String srName;
    int age;

    public Person(String name, String srName, int age) {
        this.name = name;
        this.srName = srName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSrName() {
        return srName;
    }

    public void setSrName(String srName) {
        this.srName = srName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
