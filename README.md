# Spring Boot

Repozytorium zawiera projekty zrealizowane w ramach laboratoriów z frameworka Spring Boot (Java 21, Maven).

## Struktura repozytorium (Branche)

* **Branch A (MVC & REST API):** Aplikacja z danymi w pamięci (`ArrayList`). Zawiera kontroler z widokami Thymeleaf do obsługi formularza i listy osób oraz kontroler `@RestController` do obsługi operacji CRUD przez API REST z obsługą błędów (`ResponseEntity`).
* **Branch B (Spring Data JPA & REST):** Integracja z bazą danych H2. Implementacja relacji jeden-do-wielu dla encji `Location` i `WeatherData`. Wykorzystanie `JpaRepository` do tworzenia własnych zapytań ze stronicowaniem (`Pageable`) oraz automatyczne wystawienie endpointów API za pomocą `@RepositoryRestResource`.
