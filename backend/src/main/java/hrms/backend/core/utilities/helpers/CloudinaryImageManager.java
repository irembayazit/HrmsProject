package hrms.backend.core.utilities.helpers;

import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import hrms.backend.core.utilities.results.DataResult;
import hrms.backend.core.utilities.results.ErrorDataResult;
import hrms.backend.core.utilities.results.SuccessDataResult;

@Service
public class CloudinaryImageManager implements CloudinaryImageService {

	private Cloudinary cloudinary;
	
	@Autowired
	public CloudinaryImageManager(Cloudinary cloudinary) {
		super();
		this.cloudinary = cloudinary;
	}

	@Override
	public DataResult<?> upload(MultipartFile multipartFile) {
		
		try {
			Map<?, ?> uploadResult = cloudinary.uploader().upload(multipartFile.getBytes(), ObjectUtils.emptyMap());
			System.out.println("****uploadResult  : " + uploadResult);
			return new SuccessDataResult<>(uploadResult);
		} catch (IOException e) {
			e.printStackTrace();
			return new ErrorDataResult<>();
		}
	}

}
