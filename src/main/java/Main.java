public class Main {
    public static void main(String[] args) {
        Cat coco = new Cat("coco", 14);
        Dog winston = new Dog("winston", 7, "Daxton");
        Toy curiousGeorge = new Toy("ABC Corp");

        Toy legoCar = new Toy("lego truck");

        Animal[] animals = new Animal[2];
        animals[0] = coco;
        animals[1] = winston;

        for (Animal animal : animals) {
            animal.play();
        }

        curiousGeorge.play();
        coco.play();
        winston.play();

    }
}
