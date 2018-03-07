package br.com.projetoweb.utils;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;

public class PhaseListener implements javax.faces.event.PhaseListener {

	private static final long serialVersionUID = 8752214072381542326L;

	@Override
	public void afterPhase(PhaseEvent event) {
		event.getFacesContext().getExternalContext();

		System.out.println("AFTER: " + event.getPhaseId());
	}

	@Override
	public void beforePhase(PhaseEvent event) {
		event.getFacesContext().getExternalContext();

		System.out.println("BEFORE: " + event.getPhaseId());
	}

	@Override
	public PhaseId getPhaseId() {
		return PhaseId.ANY_PHASE;
	}

	
	
}
