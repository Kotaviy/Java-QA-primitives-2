public class Main {
    public static void main(String[] args) {
        int count = 300; //сумма на счёте
        int sum = 1200; // сумма, внесённая на счёт
        int bonusRUB = sum / 100; // бонусные рубли
        int finalCount = count + sum; // счёт после внесения суммы
            if(sum > 1000) { // если внесённая сумма больше 1000 рублей
               count = finalCount + bonusRUB; // то на счёт зачисляются бонусные рубли
            } else { // если сумма меньше 1000 рублей
                bonusRUB = 0; // то бонусные рубли не начисляются
            }
        System.out.println("На Вашем счёте " + finalCount + " рублей.");
        System.out.println("Бонус " + bonusRUB + " рублей.");
    }
}