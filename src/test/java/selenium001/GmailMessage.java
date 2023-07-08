//package selenium001;
//
//import org.apache.hc.core5.http.Message;
//import java.util.*;
//import javax.mail.*;
//import javax.mail.internet.*;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.WebElement;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.FluentWait;
//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//
//
//public class GmailMessage {
//
//
//    public class SendSimpleEmail {
//        final String senderEmailId = "ekuyesweet5@gmail.com";
//        final String senderPassword = "****";
//        final String emailSMTPserver = "smtpout.secureserver.net";
//
//        public <Session> SendSimpleEmail(String receiverEmail,
//                                         String subject, String messageText) {
//
//            Properties props = new Properties();
//            props.put("mail.smtp.auth", "true");
//            props.put("mail.smtp.host", emailSMTPserver);
//
//            try {
//                Authenticator auth = new SMTPAuthenticator();
//                Session session = Session.getInstance(props, auth);
//                Message message = new MimeMessage(session);
//                message.setForm(new InternetAddress(senderEmailId));
//                message.setRecipients(Message.RecipientType.TO,
//                        InternetAddress.parse(receiverEmail));
//                message.getBody(subject);
//                message.setText(messageText);
//
//                Transport.send(message);
//                System.out.println("Email send successfully.");
//            } catch (Exception e) {
//                e.printStackTrace();
//                System.err.println("Error in sending email.");
//            }
//        }
//
//        private class SMTPAuthenticator extends
//                javax.mail.Authenticator {
//            public PasswordAuthentication
//            getPasswordAuthentication() {
//                return new PasswordAuthentication(senderEmailId,
//                        senderPassword);
//            }
//        }
//
//        public static void main(String[] args) {
//            new SendSimpleEmail("w3spoint99@gmail.com",
//                    "Test Email", "Hi,\n\n This is a test email.");
//        }
//    }
//
//    private record MimeMessage(Session session) {
//    }
//
//    private record InternetAddress(String senderEmailId) {
//    }
//}
