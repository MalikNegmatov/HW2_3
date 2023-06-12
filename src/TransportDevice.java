public abstract class TransportDevice {
    private final String ModelName;
    private final int wheelsCount;

    public TransportDevice(String modelName, int wheelsCount) {
        ModelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return ModelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
