package com.smartcat.consumer.demo.repository;

import java.util.List;

import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.smartcat.consumer.demo.model.Kupujemprodajem;

@Repository
public interface KupujemprodajemRepository extends ElasticsearchRepository<Kupujemprodajem, Long>{

	List<Kupujemprodajem> findByPrice(String price);
	List<Kupujemprodajem> findByCategory(String price);
	
	@Query("{\"bool\": {\"must\": [{\"match\": {\"*kupujemprodajem.name*\": \"?0\"}}]}}")
    Kupujemprodajem findByName(String name);
	
	List<Kupujemprodajem> findByPosted(String posted);


}
