public abstract class TransportDevice implements Service {
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
    @Override
    public void updateTyre(){
        System.out.println("Меняем покрышку");
    }
    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
