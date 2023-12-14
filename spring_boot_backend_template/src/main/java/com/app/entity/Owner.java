package com.app.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

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
public class Owner extends BaseEntity {
	@Column(length = 30)
	private String firstname;

	@Column(length = 30)
	private String lastname;

	@Column(unique = true, nullable = false)
	private String email;

	@Column(length = 30, unique = true, nullable = false)
	private String adharno;

	@OneToMany(mappedBy = "owner", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)

	private List<Flat> reservations1 = new ArrayList<Flat>();

	@ManyToMany
	@JoinTable(name = "visitor_list", joinColumns = @JoinColumn(name = "owner_id"), inverseJoinColumns = @JoinColumn(name = "guest_id"))
	Set<Visitor> visitor = null;

	public void addReservation(Flat r) {
		reservations1.add(r);
		r.setOwner(this);
	}

	public void cancelReservation(Flat r) {
		reservations1.remove(r);
		r.setOwner(null);
	}

}
