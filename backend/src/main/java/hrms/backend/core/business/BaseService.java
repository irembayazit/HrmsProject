package hrms.backend.core.business;

import java.util.List;

import hrms.backend.core.utilities.results.DataResult;
import hrms.backend.core.utilities.results.Result;

public interface BaseService<T, Id> {
	Result add(T entity);

	Result delete(T entity);

	DataResult<List<T>> getAll();

	DataResult<T> getById(Id id);

	Result update(T entity);
}