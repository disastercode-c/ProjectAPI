package com.tcs.project.api.jpa;
import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

import com.tcs.project.api.domain.Orden;


public interface OrdenRepository extends JpaRepository<Orden, Long>{
	
	
	@NoRepositoryBean 
	public interface JpaRepository<T, ID> extends PagingAndSortingRepository<T, ID>, QueryByExampleExecutor<T>{
		List<T> findAll();
		
		List<T> findAll(Sort sort);
		 
		List<T> findAllById(Iterable<ID> ids);
		
		<S extends T> List<S> saveAll(Iterable<S> entities);
		
		void flush();
		
		<S extends T> S saveAndFlush(S entity);
		 
		void deleteInBatch(Iterable<T> entities);
		 
		void deleteAllInBatch();
		
		T getOne(ID id);
		
		 @Override        
		 <S extends T> List<S> findAll(Example<S> example);
		 
		 <S extends T> List<S> findAll(Example<S> example, Sort sort);
		 
	}
		 
}
