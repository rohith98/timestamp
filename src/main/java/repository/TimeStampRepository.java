package repository;

import entity.TimeStampEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeStampRepository extends JpaRepository<TimeStampEntity, Integer> {

}
