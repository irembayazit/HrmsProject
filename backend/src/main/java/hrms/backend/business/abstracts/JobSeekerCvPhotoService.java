package hrms.backend.business.abstracts;

import org.springframework.web.multipart.MultipartFile;

import hrms.backend.core.utilities.results.Result;

public interface JobSeekerCvPhotoService {
	
	Result upload(int userId, MultipartFile file);
}
