package Object;

public class Car extends Transport<Driver_B>{


    private final Categories type;
    public Car(String brand, String model, String engVolume, Driver_B driver, String type) {
        super(brand, model, engVolume, driver);
        this.type = Categories.findByVoiceCommand(type);
    }

    public enum Categories {
        SEDAN ("Седан"),
        HATCHBACK ("Хетчбек"),
        COUPE ("Купе"),
        UNIVERSAL ("Универсал"),
        SUV ("Внедорожник"),
        CROSSOVER ("Кроссовер"),
        PICKUP ("Пикап"),
        VAN ("Фургон"),
        MINIVAN ("Минивэн");

        private final String voiceCommand;

        public static Categories findByVoiceCommand(String voiceCommand){
            for (Categories category: values()) {
                if (category.getVoiceCommand().equals(voiceCommand)){
                    return category;
                }
            }
            return null;
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
        System.out.println("Тип стоп у автомобиля");;
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
            case SEDAN:
                return "Седан";
            case HATCHBACK:
                return "Хетчбэк";
            case COUPE:
                return "Купе";
            case UNIVERSAL:
                return "Универсал";
            case SUV:
                return "Внедорожник";
            case CROSSOVER:
                return "Кроссовер";
            case PICKUP:
                return "Пикап";
            case VAN:
                return "Фургон";
            case MINIVAN:
                return "Минивэн";
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
