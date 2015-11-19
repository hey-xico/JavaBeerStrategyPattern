package br.com.javabeer.pattern.strategy;

/**
 * Created by Bike100 on 17/11/2015.
 */
public class MessengerContext {

    private Messenger messenger;

    public MessengerContext(Messenger messenger) {
        this.messenger = messenger;
    }

    public void sengMessage(String message) {
        messenger.sendMenssge(message);
    }
}
