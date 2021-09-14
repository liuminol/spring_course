package spring_introduction;

public class Person {
    private Pet pet;

    public Person() {
    }

    //    public Person(Pet pet) {
//        this.pet = pet;
//    }

    public void setPet(Pet pet) {
        System.out.println("Set pet");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my pet");
        pet.say();
    }
}
