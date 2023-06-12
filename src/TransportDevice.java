public abstract class TransportDevice {
    private String setModelName;
    private int wheelsCount;
    public String getModelName() {
        return setModelName;
    }
    public void setModelName(String modelName) {
        this.setModelName = modelName;
    }
    public int getWheelsCount() {
        return wheelsCount;
    }
    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }
    public void updateTyre(){
        System.out.println("Меняем покрышку");
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
