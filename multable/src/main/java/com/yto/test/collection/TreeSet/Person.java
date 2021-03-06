package com.yto.test.collection.TreeSet;

public class Person{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 属性
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;

    // 构造方法
    public Person() {
        super();

    }
    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    // 要让哈希表存储不重复的元素，就必须重写hasCode和equals方法
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;}
        if (obj == null){
            return false;}
        if (getClass() != obj.getClass()){
            return false;}
        Person other = (Person) obj;
        if (age != other.age){
            return false;}
        if (name == null) {
            if (other.name != null){
                return false;}
        } else if (!name.equals(other.name)
                ) {
            return false;
        }

        return true;
    }


    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }


}



