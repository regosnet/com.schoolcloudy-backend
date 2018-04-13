package com.schoolcloudy.repository.user;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;



@NoRepositoryBean
public interface UserRepository<T, ID extends Serializable> extends Repository<T, ID>{
	List<T> findAll();
	T save(T t);
	T findOne(ID id);
	boolean exists(ID id);
	long count();
	void delete(ID id);
	void delete(T entity);
	void deleteAll();
	void delete(Iterable<? extends T> entities);
	<S extends T> Iterable<S> save(Iterable<S> entities);
	Page<T> findAll(Pageable pageable);
	Iterable<T> findAll(Sort sort);
	void deleteAllInBatch();
	void deleteInBatch(Iterable<T> entities);
	<S extends T> S saveAndFlush(S entity);
	void flush();
	List<T> findAll(Iterable<ID> ids);
	
}
