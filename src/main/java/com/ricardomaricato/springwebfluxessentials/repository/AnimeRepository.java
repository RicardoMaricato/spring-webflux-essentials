package com.ricardomaricato.springwebfluxessentials.repository;

import com.ricardomaricato.springwebfluxessentials.domain.Anime;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface AnimeRepository extends ReactiveCrudRepository<Anime, Integer> {

}
