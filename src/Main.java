public class Main {
    public static void main(String[] args) {
    //Задача 1
    byte aA = 5;
        System.out.println("Значение переменной aA с типом byte равно " + aA);
    short bB = 5;
        System.out.println("Значение переменной bB с типом short равно " + bB);
    int cC = 5;
        System.out.println("Значение переменной cC с типом int равно " + cC);
    long dD = 5;
        System.out.println("Значение переменной dD с типом long равно " + dD);
    float eE = 5.555555F;
        System.out.println("Значение переменной eE с типом float равно " + eE);
    double fF = 5.5;
        System.out.println("Значение переменной aF с типом double равно " + fF);

    //Задача 2
    float nothing1 = 27.12F;
    long nothing2 = 987_678_965_549L;
    double nothing3 = 2.786;
    boolean nothing4 = false;
    char nothing5 = 569;
    short nothing6 = -159;
    int nothing7 = 27897;
    byte nothing8 = 67;


    //Задача 3
    byte class1 = 23;
    byte class2 = 27;
    byte class3 = 30;
    short totalSheets = 480;
    int sheetsOneStudent = totalSheets / (class1 + class2 + class3);
    System.out.println("На каждого ученика рассчитано " + sheetsOneStudent + " листов бумаги");

    //Задача 4
    byte performanceMinute = 16 / 2;
    int performance20Minute = 20;
        System.out.println("За " + performance20Minute + " минут машина произвела бутылок " + performance20Minute * performanceMinute + " штук");
    int performance24Hours = 24 * 60;
        System.out.println("За " + performance24Hours + " часа машина произвела бутылок " + performance24Hours * performanceMinute + " штук");
    int performance3days = 3 * (performance24Hours);
        System.out.println("За " + performance3days + " дня машина произвела бутылок " + performance3days * performanceMinute + " штук");
    int performance1Month = 30 * (performance24Hours);
        System.out.println("За " + performance1Month + " месяц машина произвела бутылок " + performance1Month * performanceMinute + " штук");

    //Задача 5
    short totalJar = 120;
    short whitePaint = 2;
    short brownPaint = 4;
    int totalClasses = totalJar / (whitePaint + brownPaint);
    int boughtBrownPaint = totalClasses * brownPaint;
    int boughtWhitePaint = totalClasses * whitePaint;
    System.out.println("В школе, где " + totalClasses + " классов, нужно " + boughtWhitePaint + " банок белой краски и "
            + boughtBrownPaint + " банок коричневой краски");

    //Задача 6
    short bananas = 5 * 80;
    short milk = 200 * 105;
    short iceCreamSundae = 2 * 100;
    short rawEggs = 4 * 70;
    float totalWeight = bananas + milk + iceCreamSundae + rawEggs;
        System.out.println("Общий вес спорт-завтрака составляет " + totalWeight + " грамм");
    float totalWeightKg = totalWeight / 1000;
        System.out.println("Общий вес спорт-завтрака составляет " + totalWeightKg + " кг");

    //Задача 7
    short weightLoss1 = 250;
    short weightLoss2 = 500;
    int weightLoss = 7;
    int measure1KgToGrams = 1000;
    int situation1 = (weightLoss * measure1KgToGrams) / weightLoss1;
        System.out.println("При потере " + weightLoss1 + " гр веса каждый день, спортсмену необходимо " + situation1 + " дней");
    int situation2 = (weightLoss * measure1KgToGrams) / weightLoss2;
        System.out.println("При потере " + weightLoss2 + " гр веса каждый день, спортсмену необходимо " + situation2 + " дней");
    int[] nums = {weightLoss1, weightLoss2};
    int result = 0;
        for (int m : nums) {
        result += m;}
    int situation3 = (weightLoss * measure1KgToGrams) / (result / nums.length);
        System.out.println("При средней потере веса каждый день, спортсмену необходимо " + situation3 + " дней");

    //Задача 8
    int masha = 67760;
    int denis = 83690;
    int kristina = 76230;
    double annualIncomeMasha1 = masha * 12;
    double annualIncomeDenis1 = denis * 12;
    double annualIncomeKristina1 = kristina * 12;
    double annualIncomeMasha2 = (masha + (masha * 0.1)) * 12;
    double annualIncomeDenis2 = (denis + (denis * 0.1)) * 12;
    double annualIncomeKristina2 = (kristina + (kristina * 0.1)) * 12;
        System.out.println("Маша теперь получает " + (masha + (masha * 0.1)) + " рублей. Годовой доход вырос на " + (annualIncomeMasha2 - annualIncomeMasha1) + " рублей");
        System.out.println("Денис теперь получает " + (denis + (denis * 0.1)) + " рублей. Годовой доход вырос на " + (annualIncomeDenis2 - annualIncomeDenis1) + " рублей");
        System.out.println("Кристина теперь получает " + (kristina + (kristina * 0.1)) + " рублей. Годовой доход вырос на " + (annualIncomeKristina2 - annualIncomeKristina1) + " рублей");

    }
}