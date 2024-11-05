public class Main {

    public static void main(String[] args) {
        ChatGpt chatGpt = new ChatGpt();
        chatGpt.work();

        Developer developer = new Developer();
        developer.work();
        developer.eat();
        developer.attendMeetings();

        // In this case, the chatGpt object is not forced to implement the eat() and attendMeetings() methods
        // which are not relevant to it. This is an example of the Interface Segregation Principle.

    }
}
