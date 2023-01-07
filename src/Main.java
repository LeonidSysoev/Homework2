public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
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
    public static void task3() {
        System.out.println("Задача 3");
        byte studentsOfLudmilaPavlovna = 23;
        byte studentsOfAnnaSergeevna = 27;
        byte studentsOfEkaterinaAndreevna = 30;
        short totalSheetsOfPaper = 480;
        int totalNumberOfStudents = studentsOfLudmilaPavlovna + studentsOfAnnaSergeevna + studentsOfEkaterinaAndreevna;
        int sheetsOfPaperForStudent = totalSheetsOfPaper / totalNumberOfStudents;
        System.out.println("На каждого ученика рассчитано " + sheetsOfPaperForStudent + " листов бумаги.");
    }
    public static void task4() {
        System.out.println("Задача 4");
        byte efficiencyPer2Minutes = 16;
        int minuteEfficiency = efficiencyPer2Minutes / 2;
        int efficiencyPer20Minutes = minuteEfficiency * 20;
        System.out.println("За 20 минут машина произвела " + efficiencyPer20Minutes + " штук бутылок");
        int efficiencyPerDay = efficiencyPer20Minutes * 3 * 24;
        System.out.println("За сутки машина произвела " + efficiencyPerDay + " штук бутылок");
        int efficiencyPer3Days = efficiencyPerDay * 3;
        System.out.println("За 3 суток машина произвела " + efficiencyPer3Days + " штук бутылок");
        int efficiencyPerMouth = efficiencyPer3Days * 10;
        System.out.println("За месяц машина произвела " + efficiencyPerMouth + " штук бутылок");
    }
    public static void task5() {
        System.out.println("Задача 5");
        short totalPaintCans = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        int cansForClass = whitePaint + brownPaint;
        int totalClasses = totalPaintCans / cansForClass;
        int totalPaintCansWhite = totalClasses * whitePaint;
        int totalPaintCansBrown = totalClasses * brownPaint;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalPaintCansWhite +
                " банок белой краски и " + totalPaintCansBrown + " банок коричневой краски.");
    }
    public static void task6() {
        System.out.println("Задача 6");
        byte countBananas = 5;
        byte countMilk = 2;
        byte countIceCream = 2;
        byte countEggs = 4;
        byte weightBananas = 80;
        byte weightMilk = 105;
        byte weightIceCream = 100;
        byte weightEggs = 70;
        int totalWeightGr = countBananas * weightBananas + countMilk * weightMilk + countIceCream * weightIceCream
                + countEggs * weightEggs;
        int grPerKg = 1000;
        float totalWeightKg = totalWeightGr / (float) grPerKg;
        System.out.println("Вес спортзавтрака " + totalWeightGr + " граммов");
        System.out.println("Вес спортзавтрака " + totalWeightKg + " килограммов");
    }
    public static void task7() {
        System.out.println("Задача 7");
        byte overWeightKg = 7;
        int grPerKg = 1000;
        short diet250Gr = 250;
        short diet500Gr = 500;
        int overWeightGr = overWeightKg * grPerKg;
        int weightLoss250Gr = overWeightGr / diet250Gr;
        int weightLoss500Gr = overWeightGr / diet500Gr;
        System.out.println("Если спортсмен будет терять по 250 грамм в день, он похудеет за " + weightLoss250Gr
                + " дней");
        System.out.println("Если спортсмен будет терять по 500 грамм в день, он похудеет за " + weightLoss500Gr
                + " дней");
        int mediumDiet = (diet250Gr + diet500Gr) / 2;
        float weightLossMedium = overWeightGr / (float)mediumDiet;
        System.out.println("В среднем спортсмен похудеет за " + weightLossMedium + " дней");
        }
    public static void task8() {
        System.out.println("Задача 8");
        int currentMashaIncome = 67760;
        int currentDenisIncome = 83690;
        int currentKristinaIncome = 76230;
        float yearBonus = 1.1f;
        float highMashaIncome = currentMashaIncome * yearBonus;
        float highDenisIncome = currentDenisIncome * yearBonus;
        float highKristinaIncome = currentKristinaIncome * yearBonus;
        float diffMashaIncome = highMashaIncome % currentMashaIncome;
        System.out.println("Маша теперь получает " + highMashaIncome + " рублей. Годовой доход вырос на "
                + diffMashaIncome + " рублей.");
        float diffDenisIncome = highDenisIncome % currentDenisIncome;
        System.out.println("Денис теперь получает " + highDenisIncome + " рублей. Годовой доход вырос на "
                + diffDenisIncome + " рублей.");
        float diffKristinaIncome = highKristinaIncome % currentKristinaIncome;
        System.out.println("Денис теперь получает " + highKristinaIncome + " рублей. Годовой доход вырос на "
                + diffKristinaIncome + " рублей.");
    }
}