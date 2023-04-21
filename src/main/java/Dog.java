public class Dog extends Animal{
    private String name;
    private int age;
    private String owner;
    public Dog(String name, int age, String owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    void play() {
        System.out.println("Dog " + name + " is chasing its tail");
    }
}
