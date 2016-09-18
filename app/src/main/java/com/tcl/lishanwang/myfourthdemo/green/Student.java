package com.tcl.lishanwang.myfourthdemo.green;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

/**
 * Created by lishan on 2016/8/23.
 * 16:02
 */
@Entity
public class Student {
    @Id(autoincrement = true)
    private long id;
    private String name;
    private int age;
    private String address;
@Generated(hash = 1478670709)
public Student(long id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
}
    @Generated(hash = 1556870573)
public Student() {
}
    public String getAddress() {
        return this.address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getId() {
        return this.id;
    }
    public void setId(long id) {
        this.id = id;
    }

}
