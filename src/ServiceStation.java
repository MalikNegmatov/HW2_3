public class ServiceStation {
    public void check(TransportDevice transport) {
        System.out.println("Обслуживаем " + transport.getModelName());
        for (int i = 0; i < transport.getWheelsCount(); i++) {
            transport.updateTyre();
        }
        transport.checkEngine();
        transport.checkTrailer();
    }
}