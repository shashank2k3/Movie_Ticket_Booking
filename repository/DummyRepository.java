// package moviebooking.app.movieticketbooking.repository;

// import org.springframework.data.repository.CrudRepository;

// // import moviebooking.app.movieticketbooking.entity.Dummy;

// public interface DummyRepository extends CrudRepository<Dummy,Integer> {
//     public Dummy findById(int id);  
// }

package movie_ticket_booking.movie_ticket_booking.repository;

import org.springframework.data.repository.CrudRepository;
// import com.example.movieticketbooking.entity.Dummy;

import movie_ticket_booking.movie_ticket_booking.entity.Dummy;
public interface DummyRepository extends CrudRepository<Dummy, Integer>{
    public Dummy findById(int id);
}