    public class Bicycle extends TransportDevice {
        public Bicycle(String modelName, int wheelsCount) {
            super(modelName, wheelsCount);
        }

        public void updateTyre() {
            System.out.println("Обслуживаем " + this.getModelName());
            for (int i = 0; i < this.getWheelsCount(); i++) {
                System.out.println("Меняем покрышку");
            }
        }

        @Override
        public void doService() {
            super.doService();
            updateTyre();
        }
    }