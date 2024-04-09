package springProject1.bookProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springProject1.bookProject.model.book;

public interface BookRepository extends JpaRepository<book, Integer> {

}
