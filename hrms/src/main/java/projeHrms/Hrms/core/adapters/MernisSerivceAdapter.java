package projeHrms.Hrms.core.adapters;

import org.springframework.stereotype.Component;

import projeHrms.Hrms.entities.concretes.JobSeeker;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

@Component
public class MernisSerivceAdapter implements MernisService{

	@Override
	public boolean ChechkIfPeron(JobSeeker jobSeeker) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result = true;
		
		try {
			result =  client.TCKimlikNoDogrula(
					Long.parseLong(jobSeeker.getIdentityNumber()),
					jobSeeker.getName().toUpperCase(), 
					jobSeeker.getSurname().toUpperCase(), 
					jobSeeker.getBirthDate().getYear());
		}
		catch (Exception e) {
			System.out.println("Not a valid person");
		} 
		return result;
	}


}
