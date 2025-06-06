import com.zecss13.library.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

package com.zecss13.library.repository;


@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}