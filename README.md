# Spring Boot 

Repozytorium zawiera projekty zrealizowane w ramach laboratoriów z frameworka Spring Boot (Java 21, Maven). Zadania obejmują rozwój aplikacji od podstawowej logiki MVC i pamięci podręcznej, przez zarządzanie zakresem sesji, aż po zaawansowaną warstwę persystencji danych z automatycznym generowaniem punktów końcowych API.

## Struktura repozytorium (Branche)

* **Branch A (Podstawy Spring Boot, MVC i REST):** Stworzenie aplikacji do zarządzania encją `Person` przechowywaną w kolekcji in-memory (`List`). Implementacja klasycznego kontrolera `@Controller` z widokami Thymeleaf i obsługą formularzy (POST), weryfikacja zachowania aplikacji przy zmianie zasięgu serwisu na sesyjny (`@SessionScope`) oraz rozbudowa projektu o niezależny kontroler `@RestController` obsługujący pełny protokół REST (CRUD z obsługą wyjątków i kodem odpowiedzi 404 przez `ResponseEntity`).
* **Branch B (Spring Data JPA i Spring Data REST):** Integracja aplikacji z relacyjną bazą danych H2. Implementacja dwukierunkowej relacji jeden-do-wielu (`@OneToMany` / `@ManyToOne`) na przykładzie modelu danych pogodowych i lokalizacji. Wykorzystanie interfejsów `JpaRepository` do automatycznego generowania zapytań bazodanowych (Query Methods) z obsługą stronicowania (`Pageable`). Automatyczna ekspozycja warstwy danych jako API REST za pomocą modułu Spring Data REST (`@RepositoryRestResource`) pod bazową ścieżką `/api`.
