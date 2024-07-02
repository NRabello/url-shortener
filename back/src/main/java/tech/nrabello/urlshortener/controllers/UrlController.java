package tech.nrabello.urlshortener.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.nrabello.urlshortener.DTO.UrlRequest;
import tech.nrabello.urlshortener.service.UrlShortener;

import java.net.URI;

@RestController
@RequestMapping(value = "/url")
public class UrlController {

    @Autowired
    UrlShortener urlShortener;

    @PostMapping("/shorten")
    public ResponseEntity<?> shortenUrl(@RequestBody UrlRequest urlRequest, HttpServletRequest request) {
        try {
            return new ResponseEntity<>(urlShortener.shortenUrl(urlRequest, request),HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> redirectUrl(@PathVariable String id) {
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.setLocation(URI.create(urlShortener.redirectUrl(id).shortUrl()));

            return ResponseEntity.status(HttpStatus.FOUND).headers(headers).build();
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
