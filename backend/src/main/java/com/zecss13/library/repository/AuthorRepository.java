import com.zecss13.library.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

package com.zecss13.library.repository;


@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}