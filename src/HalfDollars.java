public class HalfDollars {
    public static void main(String[] args) {

        int[] denver = {1_700_000, 4_600_000, 2_100_00};
       // int[] philadelphia = new int[denver.length];
        int[] philadelphia = {1_800_000, 5_000_000, 1_800_00};
        int[] total = new int[denver.length];
        int sum = 0;


        for (int i = 0; i <3 ; i++) {
            total[i] = denver[i] + philadelphia[i];
            sum += total[i];
            System.out.print("Produkcja w " + (2012+i) + " : ");
            System.out.format("%,d%n", total[i]);

        }
        //total[0] = denver[0] + philadelphia[0];
       // total[1] = denver[1] + philadelphia[1];
        //total[2] = denver[2] + philadelphia[2];

        //for (int i = 0; i <3 ; i++) {
         //   average2 += total[i];
        //}
        //average2 /= 3;
        //System.out.print("ś".toUpperCase() + "rednia do produkcji: ");
        //System.out.format("%,d%n", average2);

       /* average = (total[0] + total[1] + total[2]) / 3;
        System.out.print("Produkcja w 2012: ");
        System.out.format("%,d%n", total[0]);
        System.out.print("Produkcja w 2013: ");
        System.out.format("%,d%n", total[1]);
        System.out.print("Produkcja w 2014: ");
        System.out.format("%,d%n", total[2]);*/
        System.out.print("ś".toUpperCase() + "rednia do produkcji: ");
        System.out.format("%,d%n", sum/3);


        int[][][] arr3D = new int[4][][];
        arr3D[0] = new int[10][];


    }
}
