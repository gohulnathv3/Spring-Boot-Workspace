package io.spring.moviecatalogservice.resources;

import io.spring.moviecatalogservice.models.CatalogItem;
import io.spring.moviecatalogservice.models.Movie;
import io.spring.moviecatalogservice.models.Rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private WebClient.Builder webClientBuilder;
    private CatalogItem movie;

    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId")String userId){
        // get all rated movie IDs


        // Adding webclient to make api calls

        WebClient.Builder builder = WebClient.builder();


        List<Rating> ratings = Arrays.asList(
                new Rating("1234", 4),
                new Rating("5678", 5)
        );



        return ratings.stream().map(rating -> {

            // Movie movie =  restTemplate.getForObject("http://localhost:8082/movies/123" + rating.getMovieId(), Movie.class);

            webClientBuilder.build()
                    .get()
                    .uri("http://localhost:8082/movies/123" + rating.getMovieId())
                    .retrieve()
                    .bodyToMono(Movie.class)
                    .block();

            return new CatalogItem(movie.getName(), "About cars and robots",rating.getRating());
        })

                .collect(Collectors.toList());


        // For each movie ID, call movie-info-service and get details
        // put them all together



    }
}
