package com.mgy.demo;

/**
 * @author mgy
 * @date 2021/4/18 23:19
 */

public class Dog {
    private int id;
    private String name;


    public Dog(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        System.out.println("如果是Git客户端的话，就进入你的项目目录，然后右键，点击Git Bash Here 如果是在IDEA里打开git命令页面的话，头部导航栏-->View-->Tool Windows-->Termina" +"E:\\workspace\\sit>git config --global http.sslVerify \"false\"\n");
    }
}
