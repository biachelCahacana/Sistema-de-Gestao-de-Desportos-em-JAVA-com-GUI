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
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class DesportoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression idDesporto;
	public final StringExpression nomeDesporto;
	public final StringExpression descricaoDesporto;
	public final StringExpression paisOrigem;
	public final IntegerExpression qdeAtletas;
	public final StringExpression registador;
	
	public DesportoDetachedCriteria() {
		super(Desporto.class, DesportoCriteria.class);
		idDesporto = new IntegerExpression("idDesporto", this.getDetachedCriteria());
		nomeDesporto = new StringExpression("nomeDesporto", this.getDetachedCriteria());
		descricaoDesporto = new StringExpression("descricaoDesporto", this.getDetachedCriteria());
		paisOrigem = new StringExpression("paisOrigem", this.getDetachedCriteria());
		qdeAtletas = new IntegerExpression("qdeAtletas", this.getDetachedCriteria());
		registador = new StringExpression("registador", this.getDetachedCriteria());
	}
	
	public DesportoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, DesportoCriteria.class);
		idDesporto = new IntegerExpression("idDesporto", this.getDetachedCriteria());
		nomeDesporto = new StringExpression("nomeDesporto", this.getDetachedCriteria());
		descricaoDesporto = new StringExpression("descricaoDesporto", this.getDetachedCriteria());
		paisOrigem = new StringExpression("paisOrigem", this.getDetachedCriteria());
		qdeAtletas = new IntegerExpression("qdeAtletas", this.getDetachedCriteria());
		registador = new StringExpression("registador", this.getDetachedCriteria());
	}
	
	public Desporto uniqueDesporto(PersistentSession session) {
		return (Desporto) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Desporto[] listDesporto(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Desporto[]) list.toArray(new Desporto[list.size()]);
	}
}

