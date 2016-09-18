package com.tcl.lishanwang.myfourthdemo.green;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by lishan on 2016/8/24.
 * 10:51
 */
@Entity
public class Bird {
    @Id(autoincrement = true)
    private Long id;
    private int age;
    private String name;
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    @Generated(hash = 604646891)
    public Bird(Long id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }
    @Generated(hash = 1154350862)
    public Bird() {
    }
}
