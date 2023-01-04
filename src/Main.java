public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        System.out.println("Задача 1");
        byte a = 10;
        short b = 234;
        int c = 123345;
        long d = 3456342;
        float e = 2.38f;
        double f = 5.286647445;
        System.out.println("Значение переменной a c типом byte равно " + a);
        System.out.println("Значение переменной b c типом short равно " + b);
        System.out.println("Значение переменной c c типом int равно " + c);
        System.out.println("Значение переменной d c типом long равно " + d);
        System.out.println("Значение переменной e c типом float равно " + e);
        System.out.println("Значение переменной f c типом double равно " + f);
    }

    public static void task2() {
        System.out.println("Задача 2");
        float dog = 27.12f;
        long human = 987678965549L;
        float cat = 2.786f;
        short horse = 569;
        short unknownAnimal = -159;
        int whale = 27897;
        byte sheep = 67;
        System.out.println(dog);
        System.out.println(human);
        System.out.println(cat);
        System.out.println(horse);
        System.out.println(unknownAnimal);
        System.out.println(whale);
        System.out.println(sheep);
        }
}