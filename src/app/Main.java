package app;

public class Main {

    public static void main(String[] args) {
        DataHandler dataHandler = new DataHandler();
        UIOperator uiOperator = new UIOperator();

        uiOperator.getOutput(dataHandler.getAll());
        uiOperator.getOutput(dataHandler.getById(172));

    }
}
