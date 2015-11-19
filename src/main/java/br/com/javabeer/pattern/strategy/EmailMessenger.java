package br.com.javabeer.pattern.strategy;

public class EmailMessenger implements Messenger {
    public void sendMenssge(String message) {
        //Logica para o Envio de Email;
        System.out.println("Email enviado com  a seguinte mensagem: " + message);
    }
}
