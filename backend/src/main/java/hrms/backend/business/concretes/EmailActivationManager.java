package hrms.backend.business.concretes;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.stereotype.Service;

import hrms.backend.business.abstracts.EmailActivationService;
import hrms.backend.core.utilities.results.ErrorResult;
import hrms.backend.core.utilities.results.Result;
import hrms.backend.core.utilities.results.SuccessResult;
import hrms.backend.dataAccess.abstracts.EmailActivationDao;
import hrms.backend.entities.concretes.EmailActivation;

@Service
public class EmailActivationManager implements EmailActivationService{

	private final EmailActivationDao activationDao;
	
	public EmailActivationManager(EmailActivationDao activationDao) {
		super();
		this.activationDao = activationDao;
	}

	@Override
	public Result Send(int user_id) {
		
		boolean isApproved=false;
		String code = "alparslan";
		
		try {		
			
			// e-postayı göndereceğiniz adres
			String from = "";
			
			// hesabınızın parolası
			String pass = "";
			
			// e-postanın gönderileceği adresler
			String[] to = { "mavis.irem34@gmail.com" };
			
			// host
			String host = "smtp.gmail.com";

			Properties props = System.getProperties();
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.host", host);
			props.put("mail.smtp.user", from);
			props.put("mail.smtp.password", pass);
			props.put("mail.smtp.port", "587");
			props.put("mail.smtp.auth", "true");

			Session session = Session.getDefaultInstance(props, null);
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(from));
			InternetAddress[] toAddress = new InternetAddress[to.length];
			for (int i = 0; i < to.length; i++) {
				toAddress[i] = new InternetAddress(to[i]);
			}

			for (int i = 0; i < toAddress.length; i++) {
				message.addRecipient(Message.RecipientType.TO, toAddress[i]);
			}
			
			// başlık
			message.setSubject("Merhaba Java Uzmanı!!!");
			
			// içerik			
			message.setText("Bu Java kodu ile gönderilmiş bir elektronik postadır !!! kod : " + code);
			
			Transport transport = session.getTransport("smtp");
			transport.connect(host, from, pass);
			transport.sendMessage(message, message.getAllRecipients());
			transport.close();
			
			isApproved=true;
			return new SuccessResult();
			
		} catch (Exception e) {
			return new ErrorResult("email gönderilemedi!");
		}
		
		finally {
			final EmailActivation emailActivaton = new EmailActivation(
					user_id,
					code,
					isApproved
					);
			this.activationDao.save(emailActivaton);
		}
	}

}
