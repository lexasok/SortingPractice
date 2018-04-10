public class Person {

    HairColor hairColor = HairColor.BLACK;

    public Person() {
        int a = 5;
    }

    public static void main(String[] args) {
        Person peter = new Person();
        Person spiderMan = peter;

        spiderMan.hairColor = HairColor.PINK;

        System.out.println(peter.hairColor);
        System.out.println(spiderMan.hairColor);
    }
}
