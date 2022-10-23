public class Main {
    public static void main(String[] args) {
        int numberInt = 1050050;
        byte numberBy = 10;
        short numberSh = 17000;
        long numberLo = 123456789;
        float numberFlo =  3.4f;
        double numberDou = 3.444444d;
        System.out.println ("Значение переменной numberInt с типом int равно " + numberInt);
        System.out.println ("Значение переменной numberBy с типом byte равно " + numberBy);
        System.out.println ("Значение переменной numberSh с типом short равно " + numberSh);
        System.out.println ("Значение переменной numberLo с типом long равно " + numberLo);
        System.out.println ("Значение переменной numberFlo с типом float равно " + numberFlo);
        System.out.println ("Значение переменной numberDou с типом double равно " + numberDou);

        //task 2

        int OneIn = 27897;
        byte OneBy = 67;
        short OneSh = 569;
        short TwoSh = -159;
        long oneLo = 987678965549l;
        float OneFlo =  27.12f;
        double OneDou = 2.786d;

        //task 3
        byte LydPa = 23;
        byte AnSe = 27;
        byte EkAn = 30;
        byte allStudents = (byte) (LydPa + AnSe + EkAn);
        short paper = 480;
        short answer = (short) (paper / allStudents);
        System.out.println( "На каждого ученика рассчитано " + answer + " листов бумаги");

        //task 4

        byte EfficiencyTwoMin = 16;
        byte EfficiencyOneMin = (byte) (EfficiencyTwoMin / 2);
        short Efficiency20Min = (short) (EfficiencyOneMin * 20);
        System.out.println("За 20 минут машина произвела бутылок " + Efficiency20Min + " штук");
        short Day = (short) (EfficiencyOneMin * 1440);
        System.out.println("За сутки работы машина произвела бутылок " + Day + " штук");
         int Day3 = ( EfficiencyOneMin * 4320);
        System.out.println("За трое суток работы машина произвела бутылок " + Day3 + " штук");
        int month = ( EfficiencyOneMin * 43200);
        System.out.println("За месяц работы машина произвела бутылок " + month + " штук");

        //task 5
        byte paint = 120;
        byte white = 2;
        byte brown = 4;
        byte room = (byte) (white + brown);
        byte roomAtSchool = (byte) (paint / room);
        byte whitePaint = (byte) (white * roomAtSchool);
        byte brownPaint = (byte) (brown * roomAtSchool);
        System.out.println("В школе, где " + roomAtSchool + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски");

        //task 6
        byte BananaOne = 80;
        int Banana5 = BananaOne * 5;
        byte Milk = 105;
        int Milk2 = Milk * 2;
        byte Icecream = 100;
        int Icecream2 = Icecream * 2;
        byte egg = 70;
        int egg4 = (egg * 4);
        int weightInGrams =  (Banana5 + Milk2 + Icecream2 + egg4);

        System.out.println("Общее колличество грамм = "+ weightInGrams);

        //task 7
        byte weightКГ = 7;
        short weightГР = 7000;
        short w250 = 250;
        short w500 = 500;
        int lose250 = weightГР / w250;
        int lose500 = weightГР / w500;
        System.out.println( "Если теряять по 250 гр , то " + lose250 + " может потребоваться дней в среднем, чтобы добиться результата похудения.");
        System.out.println("Если теряять по 500 гр , то " + lose500 + " может потребоваться дней в среднем, чтобы добиться результата похудения.");

        //task 7






























    }
}