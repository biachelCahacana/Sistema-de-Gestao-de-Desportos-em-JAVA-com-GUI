package generatedPackages;

/**
 * Licensee: DuKe TeAm
 * License Type: Purchased
 */
import generatedPackages.Desporto;
import org.orm.*;
public class RetrieveAndUpdateProjectoFinalBiachelAntonio212305Data {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = ProjectoFinalBiachelAntonio212305PersistentManager.instance().getSession().beginTransaction();
		try {
			Desporto desporto = DesportoFactory.loadDesportoByQuery(null, null);
			// Update the properties of the persistent object
			desporto.save();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Desporto by DesportoCriteria");
		DesportoCriteria desportoCriteria = new DesportoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//desportoCriteria.idDesporto.eq();
		System.out.println(desportoCriteria.uniqueDesporto());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateProjectoFinalBiachelAntonio212305Data retrieveAndUpdateProjectoFinalBiachelAntonio212305Data = new RetrieveAndUpdateProjectoFinalBiachelAntonio212305Data();
			try {
				retrieveAndUpdateProjectoFinalBiachelAntonio212305Data.retrieveAndUpdateTestData();
				//retrieveAndUpdateProjectoFinalBiachelAntonio212305Data.retrieveByCriteria();
			}
			finally {
				ProjectoFinalBiachelAntonio212305PersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
