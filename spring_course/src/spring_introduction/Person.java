package spring_introduction;

public class Person {
    private Pet pet;
    private String surname;
    private int age;

    public Person() {
    }

    //    public Person(Pet pet) {
//        this.pet = pet;
//    }

    public void setPet(Pet pet) {
        System.out.println("Set pet");
        this.pet = pet;
    }

    public void setSurname(String surname) {
        System.out.println("Class Person: set surname");
        this.surname = surname;
    }

    public void setAge(int age) {
        System.out.println("Class Person: set age");
        this.age = age;
    }

    public Pet getPet() {
        return pet;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void callYourPet() {
        System.out.println("Hello, my pet");
        pet.say();
    }
}
