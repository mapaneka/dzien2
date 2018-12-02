public class Lab_3_3 {

    public static void main(String[] args) {
        int year = 1991;
        int month = 1;

        for (int i = 1; i < 13; i++) {
            month = i;


            if (args.length > 0) {
                month = Integer.parseInt(args[0]);
            }
            if (args.length > 1) {
                year = Integer.parseInt(args[1]);
            }
            //System.out.println(month + "/" + year + " ma " + DayCounter.countDays(month, year) + " dni.");
            for (int j = 1; j <DayCounter.countDays(month, year) + 1 ; j++) {
                int dzien = j;
                System.out.println(dzien + "." + month + "." + year);
            }



        }


    }
}

// class
