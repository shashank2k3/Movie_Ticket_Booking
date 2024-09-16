// package trainbookingapp.trainbookingapp.repository;
package movie_ticket_booking.movie_ticket_booking.repository;

import org.springframework.data.repository.CrudRepository;
// import trainbookingapp.trainbookingapp.entity.UserTicket;
import movie_ticket_booking.movie_ticket_booking.entity.UserTicket;



public interface UserTicketRepository
  extends CrudRepository<UserTicket, Integer> {
  Iterable<UserTicket> findAllByPnr(String pnr);
}
