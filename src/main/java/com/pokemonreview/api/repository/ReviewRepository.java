package com.pokemonreview.api.repository;

import com.pokemonreview.api.models.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ReviewRepository extends JpaRepository<Review, Integer> {
    List<Review> findByPokemonId(int pokemonId);
}
