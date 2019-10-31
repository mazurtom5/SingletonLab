public class PoliceOfficer extends TeamMember {

    @Override
    public void work() {
        System.out.println(super.getName() + " the police officer is working");
    }

    public void giveHelp() {
        System.out.println(super.getName() + " the " + getClass() + " is giving help");
    }


    public FireFighter getFire() {
        return fire;
    }

    public Doctor getDoc() {
        return doc;
    }

    private static FireFighter fire = FireFighter.getInstance();
    private static Doctor doc = Doctor.getInstance();
    private static PoliceOfficer ourInstance = new PoliceOfficer("Joe");

    public static PoliceOfficer getInstance() {

        if (ourInstance == null)
            ourInstance = new PoliceOfficer("Joe");
        return ourInstance;
    }

    private PoliceOfficer( String name ) {
        super(name);
    }
}
