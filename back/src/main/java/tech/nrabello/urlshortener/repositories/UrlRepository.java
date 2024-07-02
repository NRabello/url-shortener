package tech.nrabello.urlshortener.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import tech.nrabello.urlshortener.domain.Url;

public interface UrlRepository extends MongoRepository<Url, String>{
}
