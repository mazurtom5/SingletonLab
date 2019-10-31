public class FireFighter extends TeamMember {

    @Override
    public void work() {
        System.out.println(super.getName() + " the fire fighter is working");
    }

    public void giveHelp() {
        System.out.println(super.getName() + " the " + getClass() + " is giving help");
    }

    public PoliceOfficer getPolice() {
        return police;
    }

    public Doctor getDoc() {
        return doc;
    }

    private static PoliceOfficer police = PoliceOfficer.getInstance();
    private static Doctor doc = Doctor.getInstance();
    private static FireFighter ourInstance = new FireFighter("Bob");

    public static FireFighter getInstance() {
        if (ourInstance == null)
            ourInstance = new FireFighter("Bob");
        return ourInstance;

    }

    private FireFighter(String name) {
        super(name);
    }
}