import java.util.Scanner;

public class menAndWomen {
    
    public static void main(String[] args) {

        int MAX = 10;
        int men, women;
        float smallest_man = 1000, smallest_woman = 1000, tallest_man = 0, tallest_woman = 0, m_averageh = 0;
        Scanner twomen = new Scanner(System.in);
        Scanner tmen = new Scanner(System.in);

        do {
            System.out.print("Total of men: ");
            men = tmen.nextInt();
            System.out.print("Total of women: ");
            women = twomen.nextInt();
            if (women + men > MAX) {
                System.out.println("The total number of womans + men need to be less or equal to 10. Please try again");
            }
        } while (women + men > MAX);

        float[] menheigth_arr = new float[men];
        Scanner mheigth = new Scanner(System.in);
        float[] womenheigth_arr = new float[women];
        Scanner wheigth = new Scanner(System.in);

        for (int i = 0; i < men; i++) {
            System.out.println("Heigth of the man number " + (i + 1) + " of " + men);
            menheigth_arr[i] = mheigth.nextFloat();

            if (menheigth_arr[i] > tallest_man) { //searching for the tallest man
                tallest_man = menheigth_arr[i];
            }
            if (menheigth_arr[i] < smallest_man) { //searching for the smallest man
                smallest_man = menheigth_arr[i];
            }

            //calculating the average men heigth 
            m_averageh = m_averageh + menheigth_arr[i]; 
            if (i == men - 1) {
                m_averageh = m_averageh / men;
            }

        }

        for (int j = 0;j < women; j++) {
            System.out.println("Heigth of the woman number " + (j + 1) + " of " + women);
            womenheigth_arr[j] = wheigth.nextFloat();

            if (womenheigth_arr[j] > tallest_woman) { //searching for the tallest woman
                tallest_woman = womenheigth_arr[j];
            }
            if (womenheigth_arr[j] < smallest_woman) { //searching for the smallest woman
                smallest_woman = womenheigth_arr[j];
            }
        }
        
        //printing things
        System.out.println("\n---------------------------------");
        System.out.println("Tallest: " + tallest(tallest_man, tallest_woman));
        System.out.println("Smallest: " + smallest(smallest_man, smallest_woman));
        System.out.println("---------------------------------");
        System.out.println("Number of women: " + women);
        System.out.println("---------------------------------");
        System.out.println("Men average heigth: " + m_averageh);
    }

    //deciding the tallest
    public static float tallest(float tallest_man, float tallest_woman) {
        float tallest = 0;

        if (tallest_man > tallest_woman) {
            tallest = tallest_man;
            return tallest;
        }
        else {
            tallest = tallest_woman;
            return tallest;
        }
    }

    //deciding the smallest
    public static float smallest(float smallest_man, float smallest_woman) {
        float smallest = 0;

        if (smallest_man < smallest_woman) {
            smallest = smallest_man;
            return smallest;
        }
        else {
            smallest = smallest_woman;
            return smallest;
        }
    }

}
