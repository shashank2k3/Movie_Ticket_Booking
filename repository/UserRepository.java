// package trainbookingapp.trainbookingapp.repository;
package movie_ticket_booking.movie_ticket_booking.repository;

import org.springframework.data.repository.CrudRepository;
// import trainbookingapp.trainbookingapp.entity.User;
import movie_ticket_booking.movie_ticket_booking.entity.User;
public interface UserRepository extends CrudRepository<User, String> {
  public User findByAadhar(String aadhar);

  public User findByEmail(String email);
}

