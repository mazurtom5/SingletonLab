public class Tester {
    public static void main(String[] args) {
/*
        PoliceOfficer police = PoliceOfficer.getInstance();
            police.work();
        FireFighter fire = FireFighter.getInstance();
            fire.work();
        Doctor doc = Doctor.getInstance();
            doc.work();
*/

        Doctor doc = Doctor.getInstance();
        doc.work();
        FireFighter fire = FireFighter.getInstance();
        fire.work();
        PoliceOfficer police = PoliceOfficer.getInstance();
        police.work();


        System.out.println("\npoliceman asks for help");
        police.getDoc().giveHelp();
        police.getFire().giveHelp();
        System.out.println("\nfire fighter asks for help");
        fire.getDoc().giveHelp();
        fire.getPolice().giveHelp();
        System.out.println("\ndoctor asks for help");
        doc.getFire().giveHelp();
        doc.getPolice().giveHelp();
    }
}
