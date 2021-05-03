package odev4;

public class CustomerManager {
	BaseDatabaseManager databaseManager;
	
	public void kullaniciyiKaydet(String name) {
		System.out.println(name + " kaydedildi");
		databaseManager.insert();
	}
}
