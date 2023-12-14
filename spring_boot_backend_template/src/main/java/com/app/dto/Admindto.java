package com.app.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIgnoreType
public class Admindto {

	private String email;

	private String password;
	
}
