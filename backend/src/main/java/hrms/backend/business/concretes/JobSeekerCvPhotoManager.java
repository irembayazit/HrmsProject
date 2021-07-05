package hrms.backend.business.concretes;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import hrms.backend.business.abstracts.JobSeekerCvPhotoService;
import hrms.backend.core.utilities.helpers.CloudinaryImageService;
import hrms.backend.core.utilities.results.Result;
import hrms.backend.core.utilities.results.SuccessResult;
import hrms.backend.dataAccess.abstracts.JobSeekerCvPhotoDao;
import hrms.backend.dataAccess.abstracts.JobSeekerDao;
import hrms.backend.entities.concretes.JobSeekerCvPhoto;

@Service
public class JobSeekerCvPhotoManager implements JobSeekerCvPhotoService{

	private JobSeekerCvPhotoDao jobSeekerCvPhotoDao;
	private JobSeekerDao jobSeekerDao;
	private CloudinaryImageService cloudinaryImageService;
	
	@Autowired
	public JobSeekerCvPhotoManager(JobSeekerCvPhotoDao jobSeekerCvPhotoDao,
			CloudinaryImageService cloudinaryImageService,
			JobSeekerDao jobSeekerDao) {
		super();
		this.jobSeekerCvPhotoDao = jobSeekerCvPhotoDao;
		this.cloudinaryImageService = cloudinaryImageService;
		this.jobSeekerDao = jobSeekerDao;
	}
	

	@Override 
	public Result upload(int userId, MultipartFile file) {
		
		Map<?, ?> uploadImage = (Map<?, ?>) cloudinaryImageService.upload(file).getData();		
		JobSeekerCvPhoto cvPhoto = new JobSeekerCvPhoto();		
		cvPhoto.setJobSeeker(jobSeekerDao.getByUserId(userId));		
		cvPhoto.setUrl(uploadImage.get("url").toString());		
		this.jobSeekerCvPhotoDao.save(cvPhoto);		
		return new SuccessResult("eklendi");		
	}

	
}
	
