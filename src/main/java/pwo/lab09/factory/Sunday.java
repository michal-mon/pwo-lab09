package pwo.lab09.factory;

public class Sunday implements MessageFactory {

    @Override
    public String createIntroMessage() {
        return "Dzień dobry Niedziela.";
    }

    @Override
    public String createMainMessage() {
        return "Naciesz się weekendem, póki trwa.";
    }

    @Override
    public String createClosingMessage() {
        return "Koniec weekendu, wracaj do roboty";
    }
}