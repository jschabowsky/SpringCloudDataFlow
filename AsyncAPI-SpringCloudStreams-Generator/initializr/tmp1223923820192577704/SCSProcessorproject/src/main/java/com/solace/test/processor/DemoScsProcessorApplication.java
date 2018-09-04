package com.solace.test.processor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Processor;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.solace.test.processor.messages.EmailSent;
import com.solace.test.processor.messages.EmailSent.Payload;
import com.solace.test.processor.messages.UserSignedUp;

@SpringBootApplication
@EnableBinding(Processor.class)
public class DemoScsProcessorApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoScsProcessorApplication.class, args);
    }

    @StreamListener(Processor.INPUT)
    @Output(Processor.OUTPUT)
    public EmailSent handle(UserSignedUp aUserSignedUpMessage) throws JsonProcessingException {
    // Add Business Logic Here.
    	ObjectMapper mapper = new ObjectMapper();
    	EmailSent email = new EmailSent();
    	Payload p = new Payload();
    	p.setContent(mapper.writeValueAsString(aUserSignedUpMessage));
    	p.setUser(aUserSignedUpMessage.getPayload().getUser());
    	email.setPayload(p);
    	System.out.println("Processor Called");
    	return email;
    }
}
