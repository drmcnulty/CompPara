package com.backpackaviation;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.backpackaviation.controller.WebController;
import com.backpackaviation.interfaces.PilotRepository;
import com.backpackaviation.roles.Pilot;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@WebMvcTest(WebController.class)
public class WebControllerTest {
	
	@Autowired
	MockMvc mockMvc;
	
	@MockBean
	PilotRepository pilotRepositoryMock;
	
	@Test
	public void shouldGetAllPilots() throws Exception {
		
		Pilot dummy = new Pilot();
		dummy.setId(1);
		dummy.setName("Testy McTestface");
		
		List<Pilot> dummyPilotList = new ArrayList<Pilot>();
		dummyPilotList.add(dummy);
		
		ObjectMapper mapper = new ObjectMapper();
		String pilotListJSON = mapper.writeValueAsString(dummyPilotList);
				
		given(this.pilotRepositoryMock.findAll()).willReturn(dummyPilotList);
		
		this.mockMvc.perform(get("/api/pilots"))
		.andDo(print())
		.andExpect(status().isOk())
		.andExpect(content().json(pilotListJSON));
	}
	
}
