public class Doctor extends TeamMember {

    @Override
    public void work() {
        System.out.println(super.getName() + " the doctor is working");
    }

    public void giveHelp() {
        System.out.println(super.getName() + " the " + getClass() + " is giving help");
    }

    public PoliceOfficer getPolice() {
        return police;
    }

    public FireFighter getFire() {
        return fire;
    }

    private static PoliceOfficer police = PoliceOfficer.getInstance();
    private static FireFighter fire = FireFighter.getInstance();
    private static Doctor ourInstance = new Doctor("Danny");

    public static Doctor getInstance() {
        if (ourInstance == null)
            ourInstance = new Doctor("Danny");
        return ourInstance;
    }

    private Doctor(String name) {
        super(name);
    }
}