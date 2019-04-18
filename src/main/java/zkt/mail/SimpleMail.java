package zkt.mail;

public class SimpleMail {

    private final String to;

    public SimpleMail(String to) {
        this.to = to;
    }

    public String getTo() {
        return this.to;
    }

    public String getSubject() {
        return "Simple Email Subject";
    }

    public String getContent() {
        return "Hello client,\n This a simple email content !";
    }


}