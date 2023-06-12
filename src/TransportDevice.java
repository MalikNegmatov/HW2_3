public abstract class TransportDevice implements Service {
    private String modelName;
    private int wheelsCount;

    @Override
    public abstract void service();

}
