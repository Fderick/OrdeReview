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

	public EmailSender(String to, String from, String orderNumber) {
		toEmail = to;
		fromEmail = from;
		this.orderNumber = orderNumber;

		properties = System.getProperties();
		/*
		 * properties.setProperty("mail.smtp.host", host);
		 * properties.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
		 * properties.setProperty("mail.smtp.socketFactory.fallback", "false");
		 * properties.setProperty("mail.smtp.port", "465");
		 * properties.setProperty("mail.smtp.socketFactory.port", "465");
		 * properties.put("mail.smtp.auth", "true"); 
		 * properties.put("mail.debug",
		 * "true"); 
		 * properties.put("mail.store.protocol", "pop3");
		 * properties.put("mail.transport.protocol", "smtp");
		 */

		/*properties.setProperty("mail.transport.protocol", "smtp");
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.socketFactory.port", "465");
		properties.put("mail.smtp/socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.smpt.port", "465");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.ssl.trust", "smtp.gmail.com"); */
		
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
		String password = "cakemaker2023"; // ------------------------
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
					"Your order for Ms Cakes Bakery has been confirmed. Your order number is " + orderNumber + ".\n");

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
		Session session = Session.getDefaultInstance(properties);

		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(fromEmail));
			message.setRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
			message.setSubject("Your order is under review for Ms. Cakes Bakery");
			message.setText(
					"Your order for Ms Cakes is under review. You will receive a confirmation email upon approval"
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
		Session session = Session.getDefaultInstance(properties);

		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(fromEmail));
			message.setRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
			message.setSubject("Your order has been reviewed for Ms. Cakes Bakery");
			message.setText(
					"Your order for Ms Cakes Bakery has been reviewed. To view or edit your order use your order number, "
							+ orderNumber + ", in our platform.\n");

			// Send message
			Transport.send(message);
			System.out.println("Sent message successfully....");

		} catch (MessagingException e) {
			e.printStackTrace();
		}

	}

	public void cancelledOrderEmail() {

		String reason = "Not taking orders at this time.\n";
		// Get System Properties
		Properties properties = System.getProperties();
		properties.setProperty("mail.smpt.host", host);

		// get default Session object.
		Session session = Session.getDefaultInstance(properties);

		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(fromEmail));
			message.setRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
			message.setSubject("Your order has been cancelled for Ms. Cakes Bakery");
			message.setText("Your order for Ms. Cakes Bakery has been cancelled. " + "Reason for cancellation is: \n"
					+ reason + "\n Please place your order again at another time.");

			// Send message
			Transport.send(message);
			System.out.println("Sent message successfully....");

		} catch (MessagingException e) {
			e.printStackTrace();
		}

	}

	public void cancelledOrderEmail(String reason) {

		// Get System Properties
		Properties properties = System.getProperties();
		properties.setProperty("mail.smpt.host", host);

		// get default Session object.
		Session session = Session.getDefaultInstance(properties);

		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(fromEmail));
			message.setRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
			message.setSubject("Your order has been cancelled for Ms. Cakes Bakery");
			message.setText("Your order for Ms. Cakes Bakery has been cancelled. " + "Reason for cancellation is: \n"
					+ reason + "To edit your order use your order number, " + orderNumber + ", in our platform.\n");

			// Send message
			Transport.send(message);
			System.out.println("Sent message successfully....");

		} catch (MessagingException e) {
			e.printStackTrace();
		}

	}
}
