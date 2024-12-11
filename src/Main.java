public class Main {

    public static void main(String[] args) {

        int amound = 19765; // стоимость билета в рублях
        int bonus = 20; // количество рублей для одной бонусной мили

        int miles = amound / bonus; // количество бонусных миль

        System.out.println(miles);
    }
}
