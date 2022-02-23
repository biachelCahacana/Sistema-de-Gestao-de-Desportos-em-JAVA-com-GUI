package generatedPackages;

/**
 * Licensee: DuKe TeAm
 * License Type: Purchased
 */
import generatedPackages.Desporto;
import org.orm.*;
public class DeleteProjectoFinalBiachelAntonio212305Data {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = ProjectoFinalBiachelAntonio212305PersistentManager.instance().getSession().beginTransaction();
		try {
			Desporto desporto = DesportoFactory.loadDesportoByQuery(null, null);
			desporto.delete();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteProjectoFinalBiachelAntonio212305Data deleteProjectoFinalBiachelAntonio212305Data = new DeleteProjectoFinalBiachelAntonio212305Data();
			try {
				deleteProjectoFinalBiachelAntonio212305Data.deleteTestData();
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
