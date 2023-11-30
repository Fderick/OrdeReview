// File Name SendEmail.java
package FileManagement;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

public class EmailSender {

	private String toEmail;
	private String fromEmail;
	private String orderNumber;
	private String host = "smtp.gmail.com";
	private Properties properties;
	final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
	String password = "ssno jwlb vicr vtcx"; // ------------------------

	public EmailSender(String to, String from, String orderNumber) {
		toEmail = to;
		fromEmail = from;
		this.orderNumber = orderNumber;

		properties = System.getProperties();
		
		properties.setProperty("mail.transport.protocol", "smtp");
		properties.put("mail.smtp.auth", true);
		properties.put("mail.smtp.starttls.enable", true);
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", "587");
		properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
		properties.put("mail.smtp.ssl.protocols", "TLSv1.2");

	}

	public void confirmOrderEmail() {
		// Get System Properties
		String password = "ssno jwlb vicr vtcx"; // ------------------------
		// get default Session object.
		Session session = Session.getDefaultInstance(properties, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(fromEmail, password);
			}
		});

		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(fromEmail));
			message.setRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
			message.setSubject("Order Confirmation for Ms. Cakes Bakery");
			message.setText(
					"Your order for Ms. Cakes Bakery has been confirmed. Your order number is " + orderNumber + ".");

			// Send message
			Transport.send(message);
			System.out.println("Sent message successfully....");

		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}

	public void underReviewEmail() {
		// Get System Properties
		// get default Session object.
		Session session = Session.getDefaultInstance(properties, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(fromEmail, password);
			}
		});
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(fromEmail));
			message.setRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
			message.setSubject("Your order is under review for Ms. Cakes Bakery");
			message.setText(
					"Your order for Ms. Cakes Bakery is under review. You will receive a confirmation email upon approval"
							+ ".");

			// Send message
			Transport.send(message);
			System.out.println("Sent message successfully....");

		} catch (MessagingException e) {
			e.printStackTrace();
		}

	}

	public void reviewedOrderEmail() {
		// Get System Properties
		// get default Session object.
		Session session = Session.getDefaultInstance(properties, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(fromEmail, password);
			}
		});
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(fromEmail));
			message.setRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
			message.setSubject("Your order has been reviewed for Ms. Cakes Bakery");
			message.setText(
					"Your order for Ms. Cakes Bakery has been reviewed. Further action is necessary. \nTo view or edit your order use your order number, "
							+ orderNumber + ", in our platform"+".");

			// Send message
			Transport.send(message);
			System.out.println("Sent message successfully....");

		} catch (MessagingException e) {
			e.printStackTrace();
		}

	}
	
	public void reviewedOrderEmail(String comment) {
		// Get System Properties
		// get default Session object.
		Session session = Session.getDefaultInstance(properties, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(fromEmail, password);
			}
		});
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(fromEmail));
			message.setRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
			message.setSubject("Your order has been reviewed for Ms. Cakes Bakery");
			message.setText(
					"Your order for Ms. Cakes Bakery has been reviewed. Further action is necessary. \nTo view or edit your order use your order number, "
							+ orderNumber + ", in our platform.\n" + "The following comment has been provided: \n" + comment);

			// Send message
			Transport.send(message);
			System.out.println("Sent message successfully....");

		} catch (MessagingException e) {
			e.printStackTrace();
		}

	}

	public void cancelledOrderEmail() {
		String reason = "Not taking orders at this time.";
		// Get System Properties
		// get default Session object.
		Session session = Session.getDefaultInstance(properties, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(fromEmail, password);
			}
		});
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(fromEmail));
			message.setRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
			message.setSubject("Your order has been cancelled for Ms. Cakes Bakery");
			message.setText("Your order for Ms. Cakes Bakery has been cancelled. " + "\nReason for cancellation is: \n"
					+ reason + "\n Please place your order again at another time"+".");

			// Send message
			Transport.send(message);
			System.out.println("Sent message successfully....");

		} catch (MessagingException e) {
			e.printStackTrace();
		}

	}

	public void cancelledOrderEmail(String reason) {
		// Get System Properties
		// get default Session object.
		Session session = Session.getDefaultInstance(properties, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(fromEmail, password);
			}
		});
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(fromEmail));
			message.setRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
			message.setSubject("Your order has been cancelled for Ms. Cakes Bakery");
			message.setText("Your order for Ms. Cakes Bakery has been cancelled. " + "\nReason for cancellation is: \n"
					+ reason + "\nTo edit your order use your order number, " + orderNumber + ", in our platform"+".");

			// Send message
			Transport.send(message);
			System.out.println("Sent message successfully....");

		} catch (MessagingException e) {
			e.printStackTrace();
		}

	}
}
