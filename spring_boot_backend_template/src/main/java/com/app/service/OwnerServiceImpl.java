package com.app.service;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dto.Ownerdto;
import com.app.entity.Flat;
import com.app.entity.Owner;
import com.app.repository.OwnerRepository;

@Service
@Transactional
public class OwnerServiceImpl implements OwnerService {

	@Autowired
	private ModelMapper mapper;

	@Autowired
	private OwnerRepository ownerrepo;

	@Override
	public Owner addowner(Ownerdto owner) {
		Owner map = mapper.map(owner, Owner.class);
		Flat f = new Flat(owner.getRoomNo());
		map.addReservation(f);
		return ownerrepo.save(map);
	}

}
