package pl.coderslab.springbootproject;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringRepository extends JpaRepository<Student, Long> {
}
