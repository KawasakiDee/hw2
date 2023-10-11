public class Main {
    public static void main(String[] args) {
        System.out.println("готово");
        day(humanAge(), us());
        day(humanAge(), us());
        day(humanAge(), us());
        day(humanAge(), us());
        day(humanAge(), us());


    }

    public static void day(int age, int temperature) {
        if (age >= 20 && age <= 45 && temperature >= -20) {
            System.out.println(" можно идти гулять");
        } else if (age == 20 || temperature >= 0) {
            System.out.println("можно идти гулять");
        } else if (age < 45 || temperature <= -10) {
            System.out.println("оствайтесь дома");
        }
    }

    public static int humanAge(){
        int random = 9 +  (int)(Math.random()*(100));
        return random;
    }
    public static int us(){
        int random = -30 +  (int)(Math.random()*(100));
        return random;
    }


}