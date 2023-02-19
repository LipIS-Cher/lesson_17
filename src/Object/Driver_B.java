package Object;

public class Driver_B extends Driver{

    public Driver_B(String FIO, String category, boolean licenseDriver, String seniority) {
        super(FIO, category, licenseDriver, seniority);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель - " + getFIO() + " начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Водитель - " + getFIO() + " закончил движение");
    }

    @Override
    public void refill() {
        System.out.println("Водитель - " + getFIO() + " перезаправил авто");
    }
}
