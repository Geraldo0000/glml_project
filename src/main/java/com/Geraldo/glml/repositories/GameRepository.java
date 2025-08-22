package com.Geraldo.glml.repositories;

import com.Geraldo.glml.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
