# Spring Boot - Zadania Laboratoryjne

Repozytorium zawiera projekty zrealizowane w ramach laboratoriów z frameworka Spring Boot (Java 21, Maven).

## Struktura repozytorium (Branche)

* **Branch A (MVC, Serwis i REST):** Aplikacja bazująca na kolekcji danych w pamięci (in-memory). Zawiera kontroler `@Controller` z widokami Thymeleaf i obsługą formularzy, testowanie zasięgu sesyjnego serwisu (`@SessionScope`) oraz kontroler `@RestController` implementujący operacje CRUD z obsługą błędów przez `ResponseEntity`.
* **Branch B (Spring Data JPA & REST):** Integracja z relacyjną bazą danych H2. Implementacja modelu obiektowego w relacji jeden-do-wielu. Wykorzystanie `JpaRepository` do tworzenia zapytań ze stronicowaniem (`Pageable`) oraz automatyczna ekspozycja repozytoriów jako API REST za pomocą `@RepositoryRestResource`.
