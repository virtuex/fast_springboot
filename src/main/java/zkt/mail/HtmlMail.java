package zkt.mail;

public class HtmlMail {

    private final String to;

    public HtmlMail(String to) {
        this.to = to;
    }

    public String getTo() {
        return this.to;
    }

    public String getSubject() {
        return "HTML Email Subject";
    }

    public String getContent() {
        return "<html>" +
                "<body>" +
                "<p>Hello client,</p>" +
                "<p>This an <strong>HTML</strong> email content !</p>" +
                "</body>" +
                "</html>";
    }
}