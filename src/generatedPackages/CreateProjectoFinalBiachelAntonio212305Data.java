package generatedPackages;

/**
 * Licensee: DuKe TeAm
 * License Type: Purchased
 */
import generatedPackages.Desporto;
import org.orm.*;
public class CreateProjectoFinalBiachelAntonio212305Data {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = ProjectoFinalBiachelAntonio212305PersistentManager.instance().getSession().beginTransaction();
		try {
			Desporto desporto = DesportoFactory.createDesporto();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : registador, qdeAtletas, paisOrigem, descricaoDesporto, nomeDesporto
			desporto.save();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateProjectoFinalBiachelAntonio212305Data createProjectoFinalBiachelAntonio212305Data = new CreateProjectoFinalBiachelAntonio212305Data();
			try {
				createProjectoFinalBiachelAntonio212305Data.createTestData();
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
