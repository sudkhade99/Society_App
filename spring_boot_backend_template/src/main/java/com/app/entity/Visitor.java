package com.app.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIgnoreType
public class Visitor extends BaseEntity {
	@Column(length = 30)
	private String firstname;

	@Column(length = 30)
	private String lastname;

	@Column(unique = true, nullable = false)
	private String email;
	
	@ManyToMany(mappedBy = "visitor")
	private Set<Owner> owner=null;
}
