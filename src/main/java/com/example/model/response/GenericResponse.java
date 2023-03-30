package com.example.model.response;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.example.constants.ValidationConstants;

public class GenericResponse implements Serializable{
	private static final long serialVersionUID = 1L;

	private String esitoElaborazione = ValidationConstants.OK;

	private Map<String, String> mappaErrori;

	/**
	 * Instantiates a new generic response.
	 */
	public GenericResponse() {
		this.mappaErrori = new HashMap<String, String>();
	}

	/**
	 * Instantiates a new generic response.
	 *
	 * @param esitoElaborazione the esito elaborazione
	 */
	public GenericResponse(String esitoElaborazione) {
		super();
		this.esitoElaborazione = esitoElaborazione;
	}

	/**
	 * Instantiates a new generic response.
	 *
	 * @param esitoElaborazione the esito elaborazione
	 * @param errore            the errore
	 */
	public GenericResponse(String esitoElaborazione, String errore) {
		super();
		this.mappaErrori = new HashMap<String, String>();
		this.mappaErrori.put(ValidationConstants.KEY_GENERIC_ERROR, errore);
		this.esitoElaborazione = esitoElaborazione;
	}
	
	/**
	 * Gets the mappa errori.
	 *
	 * @return the mappaErrori
	 */
	public Map<String, String> getMappaErrori() {
		return mappaErrori;
	}

	/**
	 * Sets the mappa errori.
	 *
	 * @param mappaErrori the mappaErrori to set
	 */
	public void setMappaErrori(Map<String, String> mappaErrori) {
		this.mappaErrori = mappaErrori;
	}
	
	/**
	 * Gets the esito elaborazione.
	 *
	 * @return the esitoElaborazione
	 */
	public String getEsitoElaborazione() {
		return esitoElaborazione;
	}

	/**
	 * Sets the esito elaborazione.
	 *
	 * @param esitoElaborazione the esitoElaborazione to set
	 */
	public void setEsitoElaborazione(String esitoElaborazione) {
		this.esitoElaborazione = esitoElaborazione;
	}
}
