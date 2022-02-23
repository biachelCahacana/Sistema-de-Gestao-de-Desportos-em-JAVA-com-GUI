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
import generatedPackages.Desporto;
import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class DesportoCriteria extends AbstractORMCriteria {
	public final IntegerExpression idDesporto;
	public final StringExpression nomeDesporto;
	public final StringExpression descricaoDesporto;
	public final StringExpression paisOrigem;
	public final IntegerExpression qdeAtletas;
	public final StringExpression registador;
	
	public DesportoCriteria(Criteria criteria) {
		super(criteria);
		idDesporto = new IntegerExpression("idDesporto", this);
		nomeDesporto = new StringExpression("nomeDesporto", this);
		descricaoDesporto = new StringExpression("descricaoDesporto", this);
		paisOrigem = new StringExpression("paisOrigem", this);
		qdeAtletas = new IntegerExpression("qdeAtletas", this);
		registador = new StringExpression("registador", this);
	}
	
	public DesportoCriteria(PersistentSession session) {
		this(session.createCriteria(Desporto.class));
	}
	
	public DesportoCriteria() throws PersistentException {
		this(ProjectoFinalBiachelAntonio212305PersistentManager.instance().getSession());
	}
	
	public Desporto uniqueDesporto() {
		return (Desporto) super.uniqueResult();
	}
	
	public Desporto[] listDesporto() {
		java.util.List list = super.list();
		return (Desporto[]) list.toArray(new Desporto[list.size()]);
	}
}

