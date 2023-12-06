
import jakarta.activation.DataHandler;
import jakarta.activation.DataSource;
import jakarta.activation.FileDataSource;
import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeBodyPart;
import jakarta.mail.internet.MimeMessage;
import jakarta.mail.internet.MimeMultipart;
import java.util.Properties;

public class AllSendEmail {

    public static void main(String[] args) {
//        final String username = "nirjnasit8765@gmail.com"; // Your email address
//        final String password = "rdyl jjue tskl gzhj"; // Your email password

        String to = "nirjnasit4743@gmail.com";
        String from = "nirjnasit8765@gmail.com";
        final String username = "nirjnasit8765@gmail.com";
        final String password = "rdyl jjue tskl gzhj";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
//            message.setSubject("Test Email");
//            message.setText("This is a test email sent from Java.");

            message.setSubject("Here comes an attachment!");

            BodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText("Please find the attachment sent using Jakarta Mail");
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);

            messageBodyPart = new MimeBodyPart();
            String filename = "C:\\Users\\Nirj Nasit\\Desktop\\pp.jpg";
            DataSource source = new FileDataSource(filename);
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName(filename);
            multipart.addBodyPart(messageBodyPart);
            message.setContent(multipart);

            Transport.send(message);
            System.out.println("Email Message Sent Successfully");
            //System.out.println("Email sent successfully.");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
