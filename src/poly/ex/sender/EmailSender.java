package poly.ex.sender;

public class EmailSender implements Sender{

    private Sender sender;

    @Override
    public void sendMessage(String message) {
        System.out.println("메일을 발송합니다 : " + message);
    }
}
