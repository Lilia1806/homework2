public class Main {
    public static void main(String[] args) {
        System.out.println(ageAndTemperature(55, 32));
        System.out.println(ageAndTemperature(25, -5));
        System.out.println(ageAndTemperature(11, -11));
        System.out.println(ageAndTemperature(35, -7));
        System.out.println(ageAndTemperature(13, 0));
    }

    public static String ageAndTemperature(int age, double temperature) {
        if (temperature > -19 && temperature < 31) {
            return ("Можно идти гулять");
        } else if (age <= 20)
            if (temperature > 1 && temperature < 9) {
                return ("Можно идти гулять");
            } else if (age >= 46)
                if (temperature > -11 && temperature < 25) {
                    return ("Можно идти гулять");
                } else {
                    return ("Оставайтесь дома!");
                }

        return null;
    }
}