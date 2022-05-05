package io.spring.moviecatalogservice.resources;

import io.spring.moviecatalogservice.models.CatalogItem;
import io.spring.moviecatalogservice.models.Movie;
import io.spring.moviecatalogservice.models.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId")String userId){
        // get all rated movie IDs

        // Make api using rest template
        RestTemplate restTemplate = new RestTemplate();



        List<Rating> ratings = Arrays.asList(
                new Rating("1234", 4),
                new Rating("5678", 5)
        );



        return ratings.stream().map(rating -> {

            Movie movie =  restTemplate.getForObject("http://localhost:8082/movies/123" + rating.getMovieId(), Movie.class);

            return new CatalogItem(movie.getName(), "About cars and robots",rating.getRating());
        })
                .collect(Collectors.toList());


        // For each movie ID, call movie-info-service and get details
        // put them all together



    }
}