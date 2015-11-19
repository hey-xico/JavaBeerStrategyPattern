package br.com.javabeer.pattern.strategy;

/**
 * Created by Bike100 on 17/11/2015.
 */
public class SMSMessenger implements Messenger {
    public void sendMenssge(String message) {
        //Logica para o envio de SMS
        System.out.println("SMS enviado com a seguinte mensagem: " + message);
    }
}
