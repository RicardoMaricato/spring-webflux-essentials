package com.ricardomaricato.springwebfluxessentials.service;

import com.ricardomaricato.springwebfluxessentials.domain.Anime;
import com.ricardomaricato.springwebfluxessentials.repository.AnimeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@Slf4j
@RequiredArgsConstructor
public class AnimeService {

    private final AnimeRepository animeRepository;

    public Flux<Anime> findAll() {
        return animeRepository.findAll();
    }
}
