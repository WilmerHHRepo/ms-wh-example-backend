package com.pe.example.config.kafka;

import jakarta.enterprise.context.ApplicationScoped;
//import org.eclipse.microprofile.reactive.messaging.Channel;
//import org.eclipse.microprofile.reactive.messaging.Emitter;

@ApplicationScoped
public class KafkaProducer {

  //@Channel("products-out")
  //Emitter<String> emitter;

  public void send(String message) {
    //emitter.send(message);

  }


}
