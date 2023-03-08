package dev.ivonunes.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
  @Autowired // Let the framework know to instantiate the Repository for us
  private MovieRepository movieRepository;
  public List<Movie> allMovies(){
    return movieRepository.findAll(); //method described in Mongo Repository
  }

  public Optional<Movie> singleMovie(ObjectId id){
    return movieRepository.findById(id);
  }

}
