/*
Class: a blueprint that the dictates how an object is created. When we create classes, we create TYPES.

Object: an actual entity that was created by using a class. When we create objects, we are declaring & initializing "variables".

Parts of a class:
- Constructors: Special methods used to initialize an object.
- Attributes / DataFields / Properties: the characteristics of an object.
- Methods: Defines the behavior of the object. Actions the object can do.

Access modifiers:
- public - attribute can be read/write from anywhere.
- private - read/write can only happen within the class itself.

Access method (getters/setters, accessor/mutators):
- getters/accessors: provide ability to read private values
- setters/mutators: provide the ability to change a private value

- getter ex:
public typeOfAttribute getNameOfAttribute () {
    returns attribute;
}

- setter ex:
public void setNameOfAttribute (typeOfAttribute newValue) {
    attribute = newValue;
}

- **** FOR ANY NEW CLASS, CREATE A NEW SOURCE FILE!!! ****


 */

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