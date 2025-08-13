package com.example.url_shortener.domains.services;

import com.example.url_shortener.domains.entities.ShortUrl;
import com.example.url_shortener.domains.repositories.ShortUrlRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShortUrlService {

    private final ShortUrlRepository ShortUrlRepository;

    public ShortUrlService(ShortUrlRepository shortUrlRepository) {
        ShortUrlRepository = shortUrlRepository;
    }


    public List<ShortUrl> findAllPublicShortUrls() {
        return ShortUrlRepository.findPublicShortUrls();
    }
}
