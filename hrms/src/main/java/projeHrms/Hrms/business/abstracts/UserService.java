package projeHrms.Hrms.business.abstracts;

import java.util.List;

import projeHrms.Hrms.entities.concretes.User;

public interface UserService {
	List<User> GetAll();
}
