
# Human Resources Project
## _Gelişmiş İnsan Kaynakları Yönetim Sistemi_
[Gelişmiş İnsan Kaynakları Yönetim Sistemi ](https://github.com/EnginKARATAS/javakamp/tree/main/hrmsJava)



<h3 align="left">Languages and Tools:</h3>
<p align="left"> <a href="https://www.java.com" target="_blank"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/> </a> <a href="https://spring.io/" target="_blank"> <img src="https://www.vectorlogo.zone/logos/springio/springio-icon.svg" alt="spring" width="40" height="40"/> </a> </p>


Geliştirmekte olduğum proje gününmüz şartlarındaki insan kaynakları çalışanlarının işini son derece kolaylaştırmakta olup ücretsiz olarak yayımlanacaktır. 

 
- ✨ Açık Kaynak ✨

## Özellikler; Version : 0.0.1
### Req 1 : İş Arayanlar sisteme kayıt olabilmelidir.

### Kabul Kriterleri:

- Kayıt sırasında kullanıcıdan ad, soyad, tcno, doğum yılı, e-Posta, şifre, şifre tekrarı bilgileri istenir.
- Tüm alanlar zorunludur. Kullanıcı bilgilendirilir.
- Mernis doğrulaması yapılarak sisteme kayıt gerçekleştirilir.
- Doğrulama geçerli değilse kullanıcı bilgilendirilir.
- Daha önce kayıtlı bir e-posta veya tcno var ise kayıt gerçekleşmez. Kullanıcı bilgilendirilir.
- Kayıdın gerçekleşmesi için e-posta doğrulaması gerekir.
.
# Req 2 : İş verenler sisteme kayıt olabilmelidir.
### Kabul Kriterleri:

- Kayıt sırasında kullanıcıdan şirket adı, web sitesi, web sitesi ile aynı domaine sahip e-posta, telefon, şifre, şifre tekrarı bilgileri istenir. Burada amaç sisteme şirket olmayanların katılmasını engellemektir.
- Tüm alanlar zorunludur. Kullanıcı bilgilendirilir.
- Şirket kayıtları iki şekilde doğrulanır. Kayıdın gerçekleşmesi için e-posta doğrulaması gerekir. HRMS personelinin (bizim :)) onayı gerekmektedir.
- Daha önce kayıtlı bir e-posta var ise kayıt gerçekleşmez. Kullanıcı bilgilendirilir.
- 
# Req 3 : Sisteme genel iş pozisyonu isimleri eklenebilmelidir. Örneğin Software Developer, Software Architect.
### Kabul Kriterleri:

- Bu pozisyonlar tekrar edemez. Kullanıcı uyarılır.
# Req 4 : İş verenler listelenebilmelidir. (Sadece tüm liste)

# Req 5 : İş arayanlar listelenebilmelidir. (Sadece tüm liste)

# Req 6 : İş pozisyonları listelenebilmelidir. (Sadece tüm liste)


# Kullanılan Teknoljiler
- Backend -> Java
- Backend Framework -> Spring Boot



## Dosya Yapısı

Projede Kullanılan Katmanlı Mimari Yapısı;

Entities -Varlıkların tutulduğu paket
DataAccess-Veri Tabanı ile alakalı işlemlerin olduğu paket
Business -İş kurallarının yazılı olduğu paket
Core Projemizin ortak katmanı olarak ifade edilir
API -Kullanıcı ile iletişime geçildiği paket

<h1>ERD Diyagramı</h1>
![](/erd.png)
