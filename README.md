# Spring Boot

This repository contains projects developed during the Spring Boot framework laboratory classes (Java 21, Maven).

## Repository Structure (Branches)

* **Branch A (MVC & REST API):** Application with in-memory data (`ArrayList`). It includes a controller with Thymeleaf views for handling a form and a list of people, as well as a `@RestController` for handling CRUD operations via a REST API with error handling (`ResponseEntity`).
* **Branch B (Spring Data JPA & REST):** Integration with the H2 database. Implementation of a one-to-many relationship for `Location` and `WeatherData` entities. Utilization of `JpaRepository` to create custom queries with pagination (`Pageable`), and automatic exposure of API endpoints using `@RepositoryRestResource`.
