public class Programmer {
    public static void main(String[] args) {
    TestProgrammer programmer1 = new TestProgrammer("Luca", 28, true){
    };
        TestProgrammer programmer2 = new TestProgrammer("Vincenzo", 23, false){
        };
            System.out.println("Espresso is the secret!");
            System.out.println("----------------------");

            System.out.println(programmer1.name + " is a " + programmer1.age + "yo programmer");
            System.out.println("Is " + programmer1.name + " wear glasses? " + programmer1.glasses);
            System.out.println("----------------------");

            System.out.println(programmer2.name + " is a " + programmer2.age + "yo programmer");
            System.out.println("Is " + programmer2.name + " wear glasses? " + programmer2.glasses);
    }

}