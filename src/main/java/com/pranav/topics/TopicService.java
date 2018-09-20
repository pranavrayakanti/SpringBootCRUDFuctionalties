package com.pranav.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	TopicRepo topicrepo;

	private List<Topics> topic = new ArrayList<>(
			Arrays.asList(new Topics(1, "pranabook1"), new Topics(2, "pranavbook2")));

	public List<Topics> getTopics() {
		
		List<Topics> topics=new ArrayList();
		topicrepo.findAll().forEach(topics::add);
		

		return topics;
	}

	public Optional<Topics> gettopic(int id) {

		//return topic.stream().filter(e -> e.getId() == id).findFirst().get();
	
	  return topicrepo.findById(id);
	
	}

	public void addtopic(Topics topic1) {
		
		
		topicrepo.save(topic1);

   
	}

	public void updatetopic(int id, Topics topic2) {
		
		
		topicrepo.save(topic2);

		
//		for (int i = 0; i < topic.size(); i++) {
//			Topics t = topic.get(i);
//			if (t.getId() == id) {
//				topic.set(i, topic2);
//				return;
//			}
//
//		}

//		topic.stream().filter(t->t.getId().equals(id))
//		  .map(t->topics.set(topics.indexOf(t), topic))
//		  .collect(Collectors.toList());﻿
		
	}
	public void deletetopic(int id, Topics topic2) {
		
		topicrepo.deleteById(id);

	}

}
