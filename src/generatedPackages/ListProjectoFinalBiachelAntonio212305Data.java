package generatedPackages;

/**
 * Licensee: DuKe TeAm
 * License Type: Purchased
 */
import generatedPackages.Desporto;
import org.orm.*;
public class ListProjectoFinalBiachelAntonio212305Data {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Desporto...");
		Desporto[] desportos = DesportoFactory.listDesportoByQuery(null, null);
		int length = Math.min(desportos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(desportos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException  {
		System.out.println("Listing Desporto by Criteria...");
		DesportoCriteria desportoCriteria = new DesportoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//desportoCriteria.idDesporto.eq();
		desportoCriteria.setMaxResults(ROW_COUNT);
		Desporto[] desportos = desportoCriteria.listDesporto();
		int length =desportos== null ? 0 : Math.min(desportos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(desportos[i]);
		}
		System.out.println(length + " Desporto record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListProjectoFinalBiachelAntonio212305Data listProjectoFinalBiachelAntonio212305Data = new ListProjectoFinalBiachelAntonio212305Data();
			try {
				listProjectoFinalBiachelAntonio212305Data.listTestData();
				//listProjectoFinalBiachelAntonio212305Data.listByCriteria();
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
