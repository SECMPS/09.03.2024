/*
Class: a blueprint that the dictates how an object is created. When we create classes, we create TYPES.

Object: an actual entity that was created by using a class. When we create objects, we are declaring & initializing "variables".

Parts of a class:
- Constructors: Special methods used to initialize an object.
- Attributes / DataFields / Properties: the characteristics of an object.
- Methods: Defines the behavior of the object. Actions the object can do.

 */

class Pet {
    // ATTRIBUTES: Always at the top
    String name;
    String skin;
    int age;

    // CONSTRUCTOR(S)
    Pet(String petName, String petSkin, int petAge) {
        name = petName;
        skin = petSkin;
        age = petAge;
    }
    void sit() {
        System.out.println(name + " is sitting");
    }
    void bark() {
        System.out.println(name + " is barking");
    }
    void eat() {
        System.out.println(name + " is eating");
    }
}

public class Main {
    public static void main(String[] args) {
        Pet pippin = new Pet("Pippin", "Black, white, caramel", 5);
        System.out.println("Pet name:" + pippin.name);
        System.out.println("Pet skin:" + pippin.skin);
        System.out.println("Pet age:" + pippin.age);
        pippin.age += 1;
        System.out.println("Pet age:" + pippin.age);


        Pet bubbles = new Pet("Bubbles, the Axolotl", "Dirty Lucy", 3);

        bubbles.name = "Bubbles, the Axolotl";
        bubbles.skin = "Dirty Lucy";
        bubbles.age += 1;


        pippin.bark();
        }
    }