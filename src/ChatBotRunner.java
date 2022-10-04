public class ChatBotRunner {
    public static void main(String[] args) {

        ChatBot tasmin = new ChatBot("Tasmin", 16, "takis");

        tasmin.greeting("Sara");
        tasmin.favoriteNumber(7);
        tasmin.weather();
        tasmin.favFood("buffalo wings");

        double meters = tasmin.convertFeetToMeters(5);
        System.out.println("There are " + meters + " in 5 feet.");

        int sum = tasmin.addNumbers(15,20,25);
        System.out.println("The sum is " + sum);

        int subAge = tasmin.subAge(16,17);
        System.out.println("You are " + subAge + " years away from me!");

        String message = tasmin.goodbye();
        System.out.println(message);
    }
}
