package dmtir.example;

public class Person {

    private String name;
    private float age;
    private float weight;
    private float height;
    private transient String think;

    public Person(String name, float age, float weight, float height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public float getAge() {
        return age;
    }

    public float getWeight() {
        return weight;
    }

    public float getHeight() {
        return height;
    }

    public String getThink() {
        return think;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setThink(String think) {
        this.think = think;
    }

    @Override
    public String toString() {
        return String.format("[ Name: %s; Age: %.2f; Weight: %.2f; Height: %.2f; Think: %s ]", name, age, weight, height, !(think == null || think.isEmpty()) ? think : "-").replaceAll(",", ".");
    }

}
