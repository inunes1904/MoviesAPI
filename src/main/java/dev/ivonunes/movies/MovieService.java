package dev.ivonunes.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
  @Autowired // Let the framework know to instantiate the Repository for us
  private MovieRepository movieRepository;
  public List<Movie> allMovies(){
    return movieRepository.findAll(); //method described in Mongo Repository
  }
}
