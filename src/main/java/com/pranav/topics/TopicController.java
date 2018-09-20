package com.pranav.topics;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TopicController {

	@Autowired
	TopicService topicservice;

	// @RequestMapping(method=RequestMethod.GET,value="/alltopics")
	@RequestMapping("/alltopics")
	public List<Topics> gettopics() {
		return topicservice.getTopics();
	}

	@RequestMapping("/alltopics/{id}")
	public Optional<Topics> gettopic(@PathVariable int id) {
		return topicservice.gettopic(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/alltopics")
	public void addtopic(@RequestBody Topics topic) {

		topicservice.addtopic(topic);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/alltopics/{id}")
	public void updatetopic(@RequestBody Topics topic, @PathVariable int id) {
		topicservice.updatetopic(id, topic);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/alltopics/{id}")
	public void addtopic(@RequestBody Topics topic, @PathVariable int id) {

		topicservice.deletetopic(id, topic);
	}

}
