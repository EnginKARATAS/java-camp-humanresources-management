package inheritance2;

public class DatabaseLogger extends Logger{
	@Override //email kodunu bu class içerisinde kendimiz yazdýk ve imzaya uyduk.//javada override kelimesini bu þekilde yazmasak bile java çalýþýr. Peki buradaki olay ne? neden override ettik log()u. EmailLoggeri aslýnda polymorphism ile kullanacaðýz. polymorphism uygularken, yani customerde yaptýðýmýz gibi customer diðerlerinin referansýný tutuyordu ve customerin içinde id alaný vardý. buradada logger classý customer classý gibidir. logger classý base görevi görür ve içinde log adýnda bir fonksyon vardýr. bizde Örneðin bu class içerisinde extend ettiðimiz logger classýnýn içerisindeki log() fonksyonunun imzasýna uyarak function overloading yapmýþ olduk. Yani burada email kodunu bu class içerisinde kendimiz yazdýk ve imzaya uyduk.
	public void log() {
		System.out.println("Database Loglandý");
	}
}
