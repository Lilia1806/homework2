public class Main {
    public static void main(String[] args) {
        System.out.println(ageAndTemperature(55, 32));
        System.out.println(ageAndTemperature(25, -5));
        System.out.println(ageAndTemperature(11, -11));
        System.out.println(ageAndTemperature(35, -7));
        System.out.println(ageAndTemperature(13, 0));
    }

    public static String ageAndTemperature(int age, int temperature) {
        if (age >= 20 && age <= 45 && temperature <= -20 && temperature >= 30) {
            return ("Можно идти гулять");
        } else if (age < 20 && temperature >= 0 && temperature <= 28) {
            return ("Можно идти гулять");
        } else if (age >= 45 && temperature >= -10 && temperature <= 25) {
            return ("Можно идти гулять");
        } else {
            return ("Оставайтесь дома!");
        }
    }
}


