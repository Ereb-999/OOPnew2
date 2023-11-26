public abstract class MotoTransport extends Transport{

    public MotoTransport(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void service(){
        super.updateTyre();
        checkEngine();
    }
}
