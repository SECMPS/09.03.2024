/*
Class: a blueprint that the dictates how an object is created. When we create classes, we create TYPES.

Object: an actual entity that was created by using a class. When we create objects, we are declaring & initializing "variables".

Parts of a class:
- Constructors: Special methods used to initialize an object.
- Attributes / DataFields / Properties: the characteristics of an object.

 */

class Pet {
    // ATTRIBUTES: Always at the top
    String name;
    String skin;
    int age;

    // CONSTRUCTOR(S)
    Pet() {
        name = "Pippin";
        skin = "Black, white, and caramel";
        age = 5;
    }
}

public class Main {
    public static void main(String[] args) {
        Pet pippin = new Pet();
        System.out.println("Pet name:" + pippin.name);
        System.out.println("Pet skin:" + pippin.skin);
        System.out.println("Pet age:" + pippin.age);
        pippin.age += 1;
        System.out.println("Pet age:" + pippin.age);


        Pet bubbles = new Pet();

        bubbles.name = "Bubbles, the Axolotl";
        bubbles.skin = "Dirty Lucy";
        bubbles.age += 1;
        }
    }