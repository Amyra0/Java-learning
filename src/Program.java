public class Program {
    public static void main(String[] args) {
        int[] ages = {3, 5, 7, 9, 11, 13, 15, 17, 19, 20};
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 90 && ages[i] > 80) {
                System.out.println("80% off for you");
            } else if (ages[i] >= 80 && ages[i] < 70) {
                System.out.println("70% off for you");
            } else if (ages[i] >= 70 && ages[i] < 60) {
                System.out.println("60% off for you");
            } else if (ages[i] >= 60 && ages[i] < 50) {
                System.out.println("50% off for you");
            } else if (ages[i] >= 50 && ages[i] < 40) {
                System.out.println("40% off for you");
            } else if (ages[i] >= 40 && ages[i] < 30) {
                System.out.println("30% off for you");
            } else if (ages[i] >= 30 && ages[i] < 20) {
                System.out.println("20% off for you");
            } else if (ages[i] >= 20 && ages[i] < 10) {
                System.out.println("10% off for you");
            } else {
                System.out.println("YOU DONT QUALIFY");
            }
        }
    }
}
