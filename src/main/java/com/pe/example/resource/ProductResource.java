package com.pe.example.resource;

import com.pe.example.config.kafka.KafkaProducer;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("/heardbeat")
public class ProductResource {
    private static final Logger log = LoggerFactory.getLogger(ProductResource.class);
    @Inject
    KafkaProducer producer;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        log.info("MENSAJE ENVIADO A LOG ");
        //producer.send("MENSAJE ENVIADO A KAFKA");
        return "MENSAJE ENVIADO RESPONSE";
    }
}
