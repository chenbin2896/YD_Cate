package top.axbt.to.domain;

/**
 * @Author: 张晨彬
 * @Date: 2018/11/15/015 21:13
 */


public class Test {

    private String name;
    private String pass;

    public Test(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }

    public Test() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}

