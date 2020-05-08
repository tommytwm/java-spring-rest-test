package com.rest.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class DemoApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	// Tests no input
	@Test
	void noInputShouldReturnWhiteLabel() throws Exception {
		this.mockMvc.perform(get("/reverse/"))
					.andDo(print())
					.andExpect(status().isNotFound());
	}

	// Tests with input
	@Test
	void inputShouldReturnReverse() throws Exception {
		this.mockMvc.perform(get("/reverse/hello"))
					.andDo(print())
					.andExpect(status().isOk())
					.andExpect(jsonPath("$.content").value("olleh"));
	}

	// Tests if input is only integers
	@Test
	void inputAsIntShouldReturnReverse() throws Exception {
		this.mockMvc.perform(get("/reverse/102"))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.content").value("201"));
	}

	// Tests if input has whitespace in beginning
	@Test
	void inputHasWhiteSpaceBeginningShouldReturnReverse() throws Exception {
		this.mockMvc.perform(get("/reverse/ hello"))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.content").value("olleh "));
	}

}
