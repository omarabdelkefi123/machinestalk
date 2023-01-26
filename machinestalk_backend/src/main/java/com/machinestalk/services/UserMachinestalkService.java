package com.machinestalk.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.machinestalk.dao.UserMachinestalkDao;
import com.machinestalk.entities.UserMachinestalk;

@Service
public class UserMachinestalkService {

	@Autowired
	UserMachinestalkDao userMachinestalkdao;

	@Autowired
	private RestTemplate restTemplate;

	public List<UserMachinestalk> getUserMachinestalks() throws JsonProcessingException {
		String apiUrl = "https://gorest.co.in/public-api/users";
		String json = restTemplate.getForObject(apiUrl, String.class);
		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode root = objectMapper.readTree(json);
		JsonNode data = root.path("data");
		List<UserMachinestalk> users = objectMapper.readValue(data.toString(),
				new TypeReference<List<UserMachinestalk>>() {
				});
		return users;
	}

	public void saveUsers(List<UserMachinestalk> userMachinestalk) {
		userMachinestalkdao.saveAll(userMachinestalk);

	}

}
