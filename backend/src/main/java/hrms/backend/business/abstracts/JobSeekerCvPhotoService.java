package hrms.backend.business.abstracts;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import hrms.backend.core.utilities.results.DataResult;
import hrms.backend.core.utilities.results.Result;
import hrms.backend.entities.concretes.JobSeekerCvPhoto;

public interface JobSeekerCvPhotoService {
	
	Result upload(int userId, MultipartFile file);
	DataResult<List<JobSeekerCvPhoto>> getByJobSeeker_UserId(int userId);
	
}
