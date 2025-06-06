import com.zecss13.library.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

package com.zecss13.library.repository;


@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}