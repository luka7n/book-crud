# Book CRUD Application

ეს არის Spring Boot აპლიკაცია, რომელიც მუშაობს MySQL ბაზასთან და ასრულებს CRUD ოპერაციებს წიგნებზე.

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- Lombok

აპლიკაცია საშუალებას იძლევა:

- წიგნის დამატება
- ყველა წიგნის წამოღება
- კონკრეტული წიგნის წამოღება ID-ის მიხედვით
- წიგნის განახლება
- წიგნის წაშლა

## ბაზასთან კავშირი
spring.datasource.url=jdbc:mysql://localhost:3306/book_db
spring.datasource.username=root
spring.datasource.password=Root1234!
spring.jpa.hibernate.ddl-auto=update
