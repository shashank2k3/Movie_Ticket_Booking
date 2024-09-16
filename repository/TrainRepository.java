// package trainbookingapp.trainbookingapp.repository;
package movie_ticket_booking.movie_ticket_booking.repository;

import org.springframework.data.repository.CrudRepository;
//import trainbookingapp.trainbookingapp.entity.Train;
import movie_ticket_booking.movie_ticket_booking.entity.Train;

public interface TrainRepository extends CrudRepository<Train, String> {
  public Iterable<Train> findAllBySourceAndDestinationAndDate(
    String source,
    String destination,
    String date
  );
}
