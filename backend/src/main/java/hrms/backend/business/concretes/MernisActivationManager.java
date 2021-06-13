package hrms.backend.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import hrms.backend.business.abstracts.MernisActivationService;
import hrms.backend.core.adapters.Mernis;
import hrms.backend.core.utilities.results.DataResult;
import hrms.backend.core.utilities.results.Result;
import hrms.backend.core.utilities.results.SuccessResult;
import hrms.backend.dataAccess.abstracts.MernisActivationDao;
import hrms.backend.entities.concretes.MernisActivation;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

@Service
public class MernisActivationManager implements MernisActivationService{

	private final MernisActivationDao mernisActivationDao;
	
	public MernisActivationManager(MernisActivationDao mernisActivationDao) {
		super();
		this.mernisActivationDao = mernisActivationDao;
	}

	public Result check(Mernis mernis) {
		
		/*
		 * KPSPublicSoapProxy client = new KPSPublicSoapProxy(); boolean result = false;
		 * 
		 * try { return client.TCKimlikNoDogrula(
		 * Long.parseLong(mernis.getIdentityNumber()), mernis.getName().toUpperCase(),
		 * mernis.getSurname().toUpperCase(), mernis.getBirthDate()); } catch (Exception
		 * e) { System.out.println("Not a valid person"); } System.out.println(result);
		 * return result;
		 */
		return new SuccessResult();
		//return new ErrorResult("Not a valid person");
	}

	@Override
	public Result add(MernisActivation entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result delete(MernisActivation entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<MernisActivation>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<MernisActivation> getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result update(MernisActivation entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
