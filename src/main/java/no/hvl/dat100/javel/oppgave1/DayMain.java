package no.hvl.dat100.javel.oppgave1;

import no.hvl.dat100.javel.oppgave2.MonthlyPower;

public class DayMain {

    public static void main(String[] args) {

        // test data
        double[] powerusage_day = DayPowerData.powerusage_day;

        double[] powerprices_day = DayPowerData.powerprices_day;

        System.out.println("==============");
        System.out.println("OPPGAVE 1");
        System.out.println("==============");
        System.out.println();

        /*
        TODO

         Write code that tests the methods you implement in the DailyPower class
         Remember to teste the methods as you implement them
         Remember to also to check that you get the expected results
         */

        DailyPower.printPowerPrices(powerprices_day);
        System.out.println();
        System.out.println();
        DailyPower.printPowerUsage(powerusage_day);
        System.out.println();
        System.out.println();
        System.out.println(DailyPower.computePowerUsage(powerusage_day) + " kWh");
        System.out.println();
        System.out.printf("%.2f NOK\n", DailyPower.computeSpotPrice(powerusage_day, powerprices_day));
        System.out.println();
        System.out.printf("%.2f NOK\n", DailyPower.getSupport(2.78, 1.8));
        System.out.println();
        System.out.printf("%.2f NOK\n", DailyPower.computePowerSupport(powerusage_day, powerprices_day));
        System.out.println();
        System.out.printf("%.2f NOK\n", DailyPower.computeNorgesPrice(powerusage_day));
        System.out.println();
        System.out.println(DailyPower.findPeakUsage(powerusage_day) + " kWh");
        System.out.println();
        System.out.printf("%.2f kWh\n", DailyPower.findAvgPower(powerusage_day));






    }







}
