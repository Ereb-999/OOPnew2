public class Truck extends MotoTransport{

    public Truck(String modelName) {
        super(modelName, 4);
    }
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    public void service(){
        super.updateTyre();
        super.checkEngine();
        checkTrailer();
    }
}
