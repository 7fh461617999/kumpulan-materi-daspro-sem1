package function;

public class KalkulatorVolume {
    public static void main(String[] args) {
        int balok1 =calculatevolumebeam(7, 8, 9);
        System.out.println("volume of 1st beam is : "+balok1);

        int balok2 =calculatevolumebeam(9, 10, 20);
        System.out.println("volume of 2nd beam is : "+balok2);
    }
        public static int calculatevolumebeam(int length,int weigth,int tall){
            int volume = length*weigth*tall;
            return volume;
        }
}
