//package selenium001;
//import org.openqa.selenium.remote.http.Message;
//import sun.nio.ch.DatagramChannelImpl;
//
//import javax.imageio.spi.IIORegistry;
//import java.util.Properties;
//
//import static com.github.dockerjava.api.model.PortConfig.PublishMode.host;
//
//public class MailMessage {
//
//    final String username = "ekuyesweet5@gmail.com";
//    final String password = "YourPassword";
//    public MailAddress From;
//    private String Subject;
//    private String Body;
//
//    public static <SmtpClient, string> void sendEmail(string message, string testCaseName, DatagramChannelImpl Transport) {
//        MailMessage mail = new MailMessage();
//        To.Add("Harsh@collaboraitinc.com");
//        mail.From = new MailAddress("ekuyesweet5@gmail.com");
//        mail.Subject = "my selenium Homework";
//        mail.Body = "MailMessage.java: " + testCaseName;
//        mail.Body += Environment.NewLine;
//        mail.Body += message;
//        SmtpClient smtp;
//        // smtp = new SmtpClient;
//
//
//        // Setup mail server
//        Properties properties;
//        properties.setProperty("mail.smtp.host", host);
//
//// mail username and password
//        properties.setProperty("mail.user", "user");
//        properties.setProperty("mail.password", "password$$");
////
//        // javax.mail.internet.MimeMessage class is
//// mostly used for abstraction.
////        Session session;
//        MimeMessage message = new MimeMessage(session);
//
//// header field of the header.
//        message.setFrom(new InternetAddress(from));
//        message.toString(RecipientType.TO, new InternetAddress(to));
//        message.setSubject("subject");
//        message.setText("Hello, aas is sending email ");
//
//        import java.util. *;
//import javax.mail. *;
//import javax.mail.internet. *;
//import javax.activation. *;
//
//        public class SendEmail {
//
//            private static final String TO =
//
//            public <MessagingException, MessagingException> void main(String[] args) {
//                // change below lines accordingly
//                String to = "Harsh@collaboraitinc.com";
//                String from = "ekuyesweet5@gmail.com";
//                String host = "localhost"; // or IP address
//
//                // Get the session object
//                // Get system properties
//                properties = System.getProperties();
//
//                // Setup mail server
//                properties.setProperty("mail.smtp.host", host);
//
//                // Get the default Session object
//                IIORegistry Session;
//                session = Session.getDefaultInstance(properties);
//
//                // compose the message
//                try {
//
//                    // javax.mail.internet.MimeMessage class
//                    // is mostly used for abstraction.
//                    MimeMessage message = new MimeMessage(session);
//
//                    // header field of the header.
//                    message.setFrom(new InternetAddress(from));
//                    message.setText(TO,
//                            new InternetAddress(to));
//                    message.setSubject("subject");
//                    message.setText("Hello, aas is sending email ");
//
//                    // Send message
//                    Transport.send(message);
//                    System.out.println("Yo it has been sent..");
//                } catch (MessagingException mex) {
//                    mex.printMailMessage();
//                }
//            }
//        }
//
//    }
//
//
//
//    private static class To {
//        public static void Add(String mail) {
//
//        }
//    }
//
//    private record MailAddress(String mail) {
//    }
//
//    private static class Environment {
//        public static String NewLine;
//    }
//
//    private record InternetAddress(Object c0) {
//    }
//
//    private static class RecipientType {
//    }
//
//    private static class TO {
//    }
//
//    private static class RecipientType {
//    }
//}
//
//driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/p/a")).click();

//driver.findElement(By.xpath("//*[@id=\"C058KJYKP24\"]/div/span[1]")).click();
  //      driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[5]/div[2]/div/div[4]/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div/div[1]")).click();

  //      WebElement element = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[5]/div[2]/div/div[4]/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div/div[1]"));

        //element.click();
  //      element.sendKeys("Hello this is automated message: DID YOU GUYS FINISH HOMEWORK?");
     //   element.sendKeys(Keys.ENTER);