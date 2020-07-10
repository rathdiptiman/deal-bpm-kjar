package com.example.dealbpm.util;

import java.io.Serializable;

import org.kie.api.runtime.process.ProcessContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.dealbpm.models.DealDetails;
import com.example.dealbpm.models.DealTeam;


public class Dealutil implements Serializable {

	private static final long serialVersionUID = 1L;

	private static final Logger LOGGER = LoggerFactory.getLogger(Dealutil.class);

	/**
	 * @param kcontext
	 * @return
	 * @throws Exception
	 */
	public void processInitializer(ProcessContext kcontext) throws Exception {
		LOGGER.info("Entering processInitializer() method");
		try {
			DealDetails dealDetails = (DealDetails) kcontext.getVariable("dealDetails");
			
			
			if (dealDetails == null || dealDetails.getId() == null) {
				throw new Exception("Invalid Request");
			}
			LOGGER.info("Deal Name : " + dealDetails.getDealName());
			LOGGER.info("Deal Amount : " + dealDetails.getAmount());
			LOGGER.info("Customer Name : " + dealDetails.getCustomerName());
			LOGGER.info("Deal Date : " + dealDetails.getDealDate());
			LOGGER.info("Customer Email : " + dealDetails.getEmail());
			
			DealTeam dealTeam = (DealTeam) kcontext.getVariable("dealTeam");
			LOGGER.info("Assigned PortfolioManager : " +dealTeam.getAssignPMs());
			LOGGER.info("Assigned DocumentManager : " +dealTeam.getAssignDMs());
			LOGGER.info("Assigned Approvers : " +dealTeam.getAssignApprovers());
			
			

		} catch (Exception e) {
			LOGGER.error("Exception inside processInitializer() method" + e.getMessage());
			throw new Exception(e);
		}
	}
}
