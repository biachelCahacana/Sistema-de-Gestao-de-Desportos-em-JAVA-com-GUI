package generatedPackages;

/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: DuKe TeAm
 * License Type: Purchased
 */
import org.orm.*;

public class Desporto {
	public Desporto() {
	}
	
	public boolean save() throws PersistentException {
		try {
			ProjectoFinalBiachelAntonio212305PersistentManager.instance().saveObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete() throws PersistentException {
		try {
			ProjectoFinalBiachelAntonio212305PersistentManager.instance().deleteObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean refresh() throws PersistentException {
		try {
			ProjectoFinalBiachelAntonio212305PersistentManager.instance().getSession().refresh(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict() throws PersistentException {
		try {
			ProjectoFinalBiachelAntonio212305PersistentManager.instance().getSession().evict(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	private int idDesporto;
	
	private String nomeDesporto;
	
	private String descricaoDesporto;
	
	private String paisOrigem;
	
	private int qdeAtletas;
	
	private String registador;
	
	public void setIdDesporto(int value) {
		this.idDesporto = value;
	}
	
	public int getIdDesporto() {
		return idDesporto;
	}
	
	public int getORMID() {
		return getIdDesporto();
	}
	
	public void setNomeDesporto(String value) {
		this.nomeDesporto = value;
	}
	
	public String getNomeDesporto() {
		return nomeDesporto;
	}
	
	public void setDescricaoDesporto(String value) {
		this.descricaoDesporto = value;
	}
	
	public String getDescricaoDesporto() {
		return descricaoDesporto;
	}
	
	public void setPaisOrigem(String value) {
		this.paisOrigem = value;
	}
	
	public String getPaisOrigem() {
		return paisOrigem;
	}
	
	public void setQdeAtletas(int value) {
		this.qdeAtletas = value;
	}
	
	public int getQdeAtletas() {
		return qdeAtletas;
	}
	
	public void setRegistador(String value) {
		this.registador = value;
	}
	
	public String getRegistador() {
		return registador;
	}
	
	public String toString() {
		return String.valueOf(getIdDesporto());
	}
	
}
