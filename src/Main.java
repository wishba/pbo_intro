public class Main {
    String hijau;

    static void methodKuning() {
        System.out.println("hati-hati");
    }

    public static void main(String[] args) {
        System.out.println("===Program lampu lalulintas===");

        Main myObjs = new Main();
        myObjs.hijau = "jalan";
        System.out.println(myObjs.hijau);

        methodKuning();

        LampuMerah merahObj = new LampuMerah();
        //merahObj.merah = "berhenti";
        //System.out.println(merahObj.merah);
        merahObj.setMerah("berhenti");
        System.out.println(merahObj.getMerah());
    }
}