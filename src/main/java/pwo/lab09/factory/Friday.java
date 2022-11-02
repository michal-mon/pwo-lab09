package pwo.lab09.factory;

public class Friday implements MessageFactory {

    @Override
    public String createIntroMessage() {
        return "Dzień dobry Piątek.";
    }

    @Override
    public String createMainMessage() {
        return "Piątkowa praca idzie najlepiej";
    }

    @Override
    public String createClosingMessage() {
        return "Ostatni dzień pracy w tym tygodniu minął";
    }
}