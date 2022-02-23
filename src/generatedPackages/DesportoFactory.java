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
import org.orm.*;
import org.hibernate.Query;
import java.util.List;

public class DesportoFactory {
	public static Desporto loadDesportoByORMID(int idDesporto) throws PersistentException {
		try {
			PersistentSession session = ProjectoFinalBiachelAntonio212305PersistentManager.instance().getSession();
			return loadDesportoByORMID(session, idDesporto);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Desporto getDesportoByORMID(int idDesporto) throws PersistentException {
		try {
			PersistentSession session = ProjectoFinalBiachelAntonio212305PersistentManager.instance().getSession();
			return getDesportoByORMID(session, idDesporto);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Desporto loadDesportoByORMID(int idDesporto, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectoFinalBiachelAntonio212305PersistentManager.instance().getSession();
			return loadDesportoByORMID(session, idDesporto, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Desporto getDesportoByORMID(int idDesporto, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectoFinalBiachelAntonio212305PersistentManager.instance().getSession();
			return getDesportoByORMID(session, idDesporto, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Desporto loadDesportoByORMID(PersistentSession session, int idDesporto) throws PersistentException {
		try {
			return (Desporto) session.load(Desporto.class, new Integer(idDesporto));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Desporto getDesportoByORMID(PersistentSession session, int idDesporto) throws PersistentException {
		try {
			return (Desporto) session.get(Desporto.class, new Integer(idDesporto));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Desporto loadDesportoByORMID(PersistentSession session, int idDesporto, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Desporto) session.load(Desporto.class, new Integer(idDesporto), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Desporto getDesportoByORMID(PersistentSession session, int idDesporto, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Desporto) session.get(Desporto.class, new Integer(idDesporto), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Desporto[] listDesportoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProjectoFinalBiachelAntonio212305PersistentManager.instance().getSession();
			return listDesportoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Desporto[] listDesportoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectoFinalBiachelAntonio212305PersistentManager.instance().getSession();
			return listDesportoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Desporto[] listDesportoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Desporto as Desporto");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Desporto[]) list.toArray(new Desporto[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Desporto[] listDesportoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Desporto as Desporto");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Desporto[]) list.toArray(new Desporto[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Desporto loadDesportoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProjectoFinalBiachelAntonio212305PersistentManager.instance().getSession();
			return loadDesportoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Desporto loadDesportoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectoFinalBiachelAntonio212305PersistentManager.instance().getSession();
			return loadDesportoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Desporto loadDesportoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Desporto[] desportos = listDesportoByQuery(session, condition, orderBy);
		if (desportos != null && desportos.length > 0)
			return desportos[0];
		else
			return null;
	}
	
	public static Desporto loadDesportoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Desporto[] desportos = listDesportoByQuery(session, condition, orderBy, lockMode);
		if (desportos != null && desportos.length > 0)
			return desportos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateDesportoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProjectoFinalBiachelAntonio212305PersistentManager.instance().getSession();
			return iterateDesportoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDesportoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProjectoFinalBiachelAntonio212305PersistentManager.instance().getSession();
			return iterateDesportoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDesportoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Desporto as Desporto");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDesportoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Desporto as Desporto");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Desporto createDesporto() {
		return new Desporto();
	}
	
	public static Desporto loadDesportoByCriteria(DesportoCriteria desportoCriteria) {
		Desporto[] desportos = listDesportoByCriteria(desportoCriteria);
		if(desportos == null || desportos.length == 0) {
			return null;
		}
		return desportos[0];
	}
	
	public static Desporto[] listDesportoByCriteria(DesportoCriteria desportoCriteria) {
		return desportoCriteria.listDesporto();
	}
}
