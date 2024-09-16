// package trainbookingapp.trainbookingapp.repository;
package movie_ticket_booking.movie_ticket_booking.repository;

import org.springframework.data.repository.CrudRepository;
// import trainbookingapp.trainbookingapp.entity.VerifyUser;
import movie_ticket_booking.movie_ticket_booking.entity.VerifyUser;


public interface VerifyUserRepository
  extends CrudRepository<VerifyUser, String> {
  public VerifyUser findByEmail(String email);

  public void deleteByEmail(String email);
}
