package bo.cercatja.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import bo.cercatja.springboot.entity.Note;

@Repository
public interface NotesRepository extends JpaRepository<Note, Long>{

}
