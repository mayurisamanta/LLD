public class Developer implements Worker, MeetingAttendee, Eater {

    @Override
    public void work() {
        System.out.println("Developer is working");
    }

    @Override
    public void eat() {
        System.out.println("Developer is eating");
    }

    @Override
    public void attendMeetings() {
        System.out.println("Developer is attending meetings");
    }
}
