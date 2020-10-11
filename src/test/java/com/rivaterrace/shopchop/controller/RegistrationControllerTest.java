package com.rivaterrace.shopchop.controller;

import static com.rivaterrace.shopchop.controller.RegistrationController.BASE;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class RegistrationControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void navigateRegistration() throws Exception {
		mockMvc.perform((get(BASE))).andExpect(status().isOk());
	}

	@Test
	public void submitRegistration() throws Exception {
		mockMvc.perform((post(BASE))).andExpect(status().is3xxRedirection());
	}

}
