package generatedPackages;

/**
 * Licensee: DuKe TeAm
 * License Type: Purchased
 */
import org.orm.*;
public class CreateProjectoFinalBiachelAntonio212305DatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(ProjectoFinalBiachelAntonio212305PersistentManager.instance());
			ProjectoFinalBiachelAntonio212305PersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
