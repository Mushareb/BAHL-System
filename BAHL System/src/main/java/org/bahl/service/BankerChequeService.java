package org.bahl.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.bahl.model.BankChequeTL;

@ApplicationScoped
public class BankerChequeService {
	
	@Inject
	EntityManager em;
	
	public List getAllBankerCheque() {
		return em.createNamedQuery("findAll").getResultList();
	}
	
	@Transactional
	public BankChequeTL create(BankChequeTL banlChequeTl) {
		em.persist(banlChequeTl);
		return banlChequeTl;
	}

}
