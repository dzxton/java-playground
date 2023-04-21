/*
        ᓚᘏᗢ
 */

public class Cat extends Animal{

    // setter
    public void setName (String name) {
        this.name = name;
    }

    void play() {
        System.out.println("Cat " + name + " jumps on the table");
    }
    public void play(Toy toy) {
        System.out.println("Cat " + name + " is playing the toy " + toy);
    }
}
