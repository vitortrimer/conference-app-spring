package trimer.vitor.conferencedemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import trimer.vitor.conferencedemo.models.Session;

public interface SessionRepository extends JpaRepository<Session, Long> {

}
