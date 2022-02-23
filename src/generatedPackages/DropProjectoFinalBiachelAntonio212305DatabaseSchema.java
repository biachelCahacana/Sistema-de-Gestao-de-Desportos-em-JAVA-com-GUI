package generatedPackages;

/**
 * Licensee: DuKe TeAm
 * License Type: Purchased
 */
import org.orm.*;
public class DropProjectoFinalBiachelAntonio212305DatabaseSchema {
	public static void main(String[] args) {
		try {
			System.out.println("Are you sure to drop table(s)? (Y/N)");
			java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
			if (reader.readLine().trim().toUpperCase().equals("Y")) {
				ORMDatabaseInitiator.dropSchema(ProjectoFinalBiachelAntonio212305PersistentManager.instance());
				ProjectoFinalBiachelAntonio212305PersistentManager.instance().disposePersistentManager();
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
