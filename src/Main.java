public class Main {
    public static void main(String[] args) {
        int count = 300;
        int sum = 1200;
        int bonusRUB = sum / 100;
        int finalCount = count + sum;
        if (sum > 1000) {
            count = finalCount + bonusRUB;
        } else {
            bonusRUB = 0;
        }
        System.out.println("На Вашем счёте " + finalCount + " рублей.");
        System.out.println("Бонус " + bonusRUB + " рублей.");
    }
}