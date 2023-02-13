package Object;

public class Bus extends Transport<Driver_D> {

    private final Categories type;
    public Bus(String brand, String model, String engVolume, Driver_D driver, int type) {
        super(brand, model, engVolume, driver);
        this.type = Categories.findByVoiceCommand(type);
    }

    public enum Categories {
        VERY_SMALL ("особо малая: до 10"),
        SMALL ("малая: до 25"),
        MIDDLE("средняя: от 40 до 50"),
        BIG ("большая: от 60 до 80"),
        VERY_BIG ("особо большая: от 100 до 120");

        private final String voiceCommand;

        public static Categories findByVoiceCommand(int voiceCommand){
            if (voiceCommand < 10){
                return VERY_SMALL;
            } else if (voiceCommand >= 10 && voiceCommand < 25) {
                return SMALL;
            } else if (voiceCommand > 40 && voiceCommand < 50){
                return MIDDLE;
            } else if (voiceCommand > 60 && voiceCommand < 80){
                return BIG;
            } else if (voiceCommand > 100 && voiceCommand < 120) {
                return VERY_BIG;
            } else {
                return null;
            }
        }

        Categories(String voiceCommand) {
            this.voiceCommand = voiceCommand;
        }

        public String getVoiceCommand() {
            return voiceCommand;
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
        System.out.println("Тип стоп у автобуса");;
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

    public String toString(Categories categories) {
        switch (categories){
            case VERY_SMALL:
                return "особо малая: до 10";
            case SMALL:
                return "малая: до 25";
            case MIDDLE:
                return "средняя: от 40 до 50";
            case BIG:
                return "большая: от 60 до 80";
            case VERY_BIG:
                return "особо большая: от 100 до 120";
            default:
                return "Данные не обработаны";
        }
    }

    public Categories getType() {
        return type;
    }

    @Override
    public String toString() {
        return toString(type);
    }
}
