package com.demo.rms.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Foo {
	
	@JsonProperty("id")
	private int id;
	
	@JsonProperty("name")
	private String name;

	@Override
	public String toString() {
		return "Foo [id=" + id + ", name=" + name + "]";
	}
	
	

}
