package Object;

public class Truck extends Transport<Driver_C>{

    private final Categories type;
    public Truck(String brand, String model, String engVolume, Driver_C driver, float type) {
        super(brand, model, engVolume, driver);
        this.type = Categories.findByVoiceCommand(type);
    }

    public enum Categories {

        N1("N1"),
        N2( "N2"),
        N3("N3");
        private final String voiceCommand;



        public static Categories findByVoiceCommand(float voiceCommand){
            if (voiceCommand < 3.5f){
                return N1;
            } else if (voiceCommand >= 3.5f && voiceCommand < 12.0f) {
                return N2;
            } else {
                return N3;
            }
        }
        Categories(String voiceCommand) {
            this.voiceCommand = voiceCommand;
        }

        public String getVoiceCommand() {
            return voiceCommand;
        }

        public String toStringEnum(){
            return this.voiceCommand;
        }
    }

    @Override
    public void startMove() {
        System.out.println(brand + " начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println(brand + " закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Тип стоп у трака");;
    }

    @Override
    public void bestTimeLap() {
        int bestTime = (int) (Math.random() - Math.random());
        System.out.println("Лучшее время - " + Math.abs(bestTime) + " секунд");
    }

    @Override
    public void maxSpeed(String brand) {
        int minBound = 80;
        int maxBound = 250;
        int maxSpeed = (int) (minBound + (maxBound - minBound)*Math.random());
        System.out.println("Максимальная скорость - " + maxSpeed);
    }

    @Override
    public String toString() {
        return type.toStringEnum();
    }
}
