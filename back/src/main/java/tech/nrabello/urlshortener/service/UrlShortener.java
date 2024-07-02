package tech.nrabello.urlshortener.service;


import jakarta.servlet.http.HttpServletRequest;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tech.nrabello.urlshortener.DTO.UrlRequest;
import tech.nrabello.urlshortener.DTO.UrlResponse;
import tech.nrabello.urlshortener.domain.Url;
import tech.nrabello.urlshortener.repositories.UrlRepository;

import java.time.LocalDateTime;

@Component
public class UrlShortener {

    @Autowired
    private UrlRepository urlRepository;

    public String shortenUrl(UrlRequest urlRequest, HttpServletRequest request){
        String id;

        do {
            id = RandomStringUtils.randomAlphanumeric(5,10);
        }while(urlRepository.existsById(urlRequest.url()));

        urlRepository.save(new Url(id, urlRequest.url(), LocalDateTime.now().plusDays(1)));

        return request.getRequestURL().toString().replace("shorten", id);
    }

    public UrlResponse redirectUrl(String id) {
        Url url = urlRepository.findById(id).orElseThrow(() -> new RuntimeException("Url not found"));

        return (new UrlResponse(url.getOriginalUrl()));
    }
}
