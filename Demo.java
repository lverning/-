package Demo02;

/**
 * @author： 吕二宁
 * @date： 2021-05-20 16:20
 */
public class Demo {
    private String name;
    private int age;

    public Demo() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
