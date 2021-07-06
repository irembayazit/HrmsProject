package hrms.backend.core.utilities.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

@Configuration
public class CloudinaryConfig {

	@Bean
	public Cloudinary cloudinaryAccount() {
		return new Cloudinary(ObjectUtils.asMap(
				"cloud_name", "irem",
				"api_key", "417326843813255",
				"api_secret", "XZe33Km1fN9uqNPdV_vnxSgDdaM"
				));
	}


}
