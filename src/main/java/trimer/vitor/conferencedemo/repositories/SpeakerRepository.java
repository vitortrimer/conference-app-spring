package trimer.vitor.conferencedemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import trimer.vitor.conferencedemo.models.Speaker;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
