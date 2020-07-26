package com.smartcat.consumer.demo.model;

import java.sql.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import static org.springframework.data.elasticsearch.annotations.FieldType.Keyword;
import static org.springframework.data.elasticsearch.annotations.FieldType.Nested;
import static org.springframework.data.elasticsearch.annotations.FieldType.Text;

import java.util.Arrays;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.InnerField;
import org.springframework.data.elasticsearch.annotations.MultiField;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Document(indexName = "kupujemprodajem", type = "kupujemprodajem")
public class Kupujemprodajem {
	@Id
	private Long id;
	
	@Field(type = Text)
	private String ad_id;
	
	@Field(type = Text)
	private String ad_url;
	
	@Field(type = Text)
	private String name;
	
	@Field(type = Text)
	private String price;
	
	@Field(type = Text)
	private Date posted;
	
	@Field(type = Text)
	private String currency;
	
	@Field(type = Text)
	private String category;

	@Field(type = Text)
	private String html;
}
