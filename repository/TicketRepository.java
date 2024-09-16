// package trainbookingapp.trainbookingapp.repository;
package movie_ticket_booking.movie_ticket_booking.repository;

import org.springframework.data.repository.CrudRepository;
//import trainbookingapp.trainbookingapp.entity.Ticket;
import movie_ticket_booking.movie_ticket_booking.entity.Ticket;

public interface TicketRepository extends CrudRepository<Ticket, String> {
  public Ticket findByPnr(String pnr);

  public Iterable<Ticket> findAllByEmail(String email);
}
