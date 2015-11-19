package br.com.javabeer.pattern;

import br.com.javabeer.pattern.strategy.EmailMessenger;
import br.com.javabeer.pattern.strategy.MessengerContext;
import br.com.javabeer.pattern.strategy.SMSMessenger;

import java.util.Collections;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        //Enviar a Mensagem via Email
        MessengerContext emailMessage = new MessengerContext(new EmailMessenger());
        emailMessage.sengMessage("JavaBeer");

        //Envia a Mensagem via SMS
        MessengerContext smsMessage = new MessengerContext(new SMSMessenger());
        smsMessage.sengMessage("JavaBeer");

    }
}
