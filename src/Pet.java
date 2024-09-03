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