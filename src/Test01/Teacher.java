package Test01;

public class Teacher {
    private int age;
    private String name;
    private String content;

    public Teacher() {
    }

    public Teacher(int age, String name, String content) {
        this.age = age;
        this.name = name;
        this.content = content;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
