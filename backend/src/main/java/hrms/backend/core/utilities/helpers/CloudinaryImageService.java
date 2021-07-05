package hrms.backend.core.utilities.helpers;

import org.springframework.web.multipart.MultipartFile;

import hrms.backend.core.utilities.results.DataResult;

public interface CloudinaryImageService {

	DataResult<?> upload(MultipartFile multipartFile);
}
