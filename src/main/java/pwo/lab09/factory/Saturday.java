package pwo.lab09.factory;

public class Saturday implements MessageFactory {

    @Override
    public String createIntroMessage() {
        return "Dzień dobry Sobota.";
    }

    @Override
    public String createMainMessage() {
        return "Sobotnia praca nie idzie wcale";
    }

    @Override
    public String createClosingMessage() {
        return "Jeszcze tylko niedziela i znowu praca";
    }
}
