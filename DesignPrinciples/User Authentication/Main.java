public class Main {

    public static void main(String[] args) {
        UserAuthenticator authenticator = new UserAuthenticator();
        AuthenticationLogger logger = new AuthenticationLogger();
        Notification notification = new EmailNotification();

        authenticator.authenticate("user", "password");
        logger.logAuthentication("user");
        notification.sendNotification("User authenticated successfully");

        // SRP violation
        // The UserAuthenticator class is responsible for authenticating the user and sending notifications
        // The UserAuthenticator class should only be responsible for authenticating the user
        // The Notification class should be responsible for sending notifications
        // The AuthenticationLogger class should be responsible for logging the authentication


    }
}
