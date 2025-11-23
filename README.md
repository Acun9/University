# University - Üniversite Fakülte Sistemi

Kısa açıklama
1. Bu proje bir üniversite içindeki fakülteler, fakültelere bağlı departmanlar, departmanların dersleri ve eğitmenler arasındaki ilişkileri modellemeyi amaçlar.
2. Amaç: Nesne yönelimli tasarım, arayüz kullanımı ve ilişkilerin (bir-çok, çok-çok) doğru gösterilmesi.

## Gereksinimler ve sınıf tanımları
1. `Faculty`
    1. Alanlar: `id` (Long), `name` (String), `createdDate` (LocalDateTime), `address` (String), `dean` (String)
    2. İlişki: bir `Faculty` birden fazla `Department` içerir (composition veya aggregation).
2. `Department` (üst sınıf)
    1. Alanlar: `id` (Long), `name` (String), `departmentHead` (String)
    2. İlişki: her `Department` tek bir `Faculty`'ye aittir.
    3. Metod: `lessonToLearn()` soyut/metod olarak tanımlanmalıdır; alt sınıflarda `@Override` edilecektir.
3. Departman spesifik alt sınıflar
    1. Örnek: `ComputerEngineering` extends `Department`
    2. Örnek alan: `programmingLanguagesShouldBeTaught: List<String>`
    3. Birkaç farklı departman ekleyin ve her birine özgü alanlar tanımlayın.
4. `entity.concrete.Course`
    1. Alanlar: `id` (Long), `name` (String), `gpa` (double)
    2. İlişki: her `Course` tek bir `Department`'a aittir.
    3. `lessonToLearn()` metodları artık `entity.concrete.Course` tipinde objeleri tutacak şekilde güncellenecek.
5. `entity.Instructor`
    1. Alanlar: `id` (Long), `firstName` (String), `lastName` (String), `salary` (BigDecimal veya double), `hasMsc` (boolean), `hasPhd` (boolean)
    2. İlişki: `Instructor` ve `Course` arasında çok-çok (many-to-many). Bir eğitmen birden fazla ders verebilir; bir ders birden fazla eğitmen tarafından verilebilir.
6. Program seviyeleri için arayüzler (`entity.interfaces`)
    1. `Bsc` -> metodlar: `presentLesson()`, `takeExam()`
    2. `Msc` -> metodlar: `presentLesson()`, `takeExam()`, `makeALab()`, `teachToWriteAcademicPaper()`
    3. `Phd` -> metodlar: `presentLesson()`, `takeExam()`, `makeALab()`, `teachToWriteAcademicPaper()`, `teachAcademicResearch()`, `introduceStudentToAcademicStaff()`
    4. `Instructor` sınıfı bu arayüzlerin herhangi bir kombinasyonunu uygulayabilir; gereksinime göre birden fazlasını implement edin.

## Tasarım önerileri ve kurallar
1. Tekrarı azaltmak için ortak davranışları üst sınıflarda veya arayüzlerde toplayın.
2. Koleksiyonlar için `List` veya `Set` kullanın; ilişkilerde `Set` tercih ederek yinelenenleri önleyebilirsiniz.
3. `equals` ve `hashCode` metodlarını kimlik alanlarına göre override edin.
4. Paketleme önerisi:
    1. `entity`
    2. `entity.concrete`
    3. `entity.interfaces`
    4. `service` (opsiyonel, iş mantığı için)
    5. `repository` (opsiyonel, veri saklama için)
5. `lessonToLearn()` tasarımı:
    1. İlk adımda `Department` içinde ders isimlerini döndürecek şekilde string listesi olabilir.
    2. Sonrasında `Course` sınıfı eklendiğinde aynı metod `List<entity.concrete.Course>` döndürür şekilde güncellenmelidir.

## İlişkilerin kısa özeti (metinsel UML benzeri)
1. `Faculty` 1..* `Department`
2. `Department` 1..* `Course`
3. `Course` *..* `Instructor`

## Nasıl başlayabilirsiniz
1. `entity` paketini ve alt paketleri oluşturun.
2. Önce temel sınıfları (`Faculty`, `Department`, `Course`, `Instructor`) tanımlayın.
3. Departman alt sınıflarını ekleyin ve `lessonToLearn()` metodlarını override edin.
4. Arayüzleri (`Bsc`, `Msc`, `Phd`) oluşturun ve `Instructor` üzerinde gerekli implementasyonları yapın.
5. Unit testlerle ilişkileri doğrulayın.

## Notlar
1. Proje Java ile geliştirilecek ve IntelliJ IDEA kullanılıyor.
2. Kodlama standartları: temiz kod, anlamlı isimlendirme, immutable/encapsulation prensipleri uygulanmalı.
