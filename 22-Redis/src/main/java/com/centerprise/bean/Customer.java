package com.centerprise.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RedisHash(value="Customer")
@ToString
public class Customer {
	
	@Id
	@Indexed
	private Integer id;
	private String name;
    private long phone;
    private String email;
    
}
