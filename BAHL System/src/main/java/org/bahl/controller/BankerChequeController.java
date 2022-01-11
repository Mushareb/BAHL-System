package org.bahl.controller;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.bahl.model.BankChequeTL;
import org.bahl.service.BankerChequeService;

@Path("BankerCheque")
public class BankerChequeController {

	@Inject
	BankerChequeService bcs;

	@GET
	@Path("getAllBankerCheque")
	public List getAllBankerCheque() {
		return bcs.getAllBankerCheque();
	}

	@POST
	@Path("addAllBankerCheque")
	public BankChequeTL create(BankChequeTL bankChequeTL) {
//		BankChequeTL bankChequeTL = new BankChequeTL(model.getBankChequeNumber(), model.getBankChequeYear(),
//				model.getStatus(), model.getVoucherNumber());
		return bcs.create(bankChequeTL);
	}

}
