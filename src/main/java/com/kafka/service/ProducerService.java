package com.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.kafka.domain.Message;

@Service
public class ProducerService {
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	String kafkaTopic = "java_in_use_topic";
	
	public void send(String message) {
	    
		Message msg = new Message();
		msg.setSource(message);
		msg.setUrl("https://s3.us-east-2.amazonaws.com/pfs-sample-videos/test_27_27.mp4");
		System.out.println("Message "+message+" URL : "+msg.getUrl());
		Gson gson = new Gson();
		
	    kafkaTemplate.send(kafkaTopic, gson.toJson(msg).toString());
	}
}