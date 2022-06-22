package com.example.imperialapi;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@AutoConfigureMockMvc
class ImperialApiApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void inchToCentimeter() throws Exception{
        this.mockMvc.perform(get("/api/centimeter?inch=1")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("2.54")));
    }

    @Test
    void yardToMeter() throws Exception{
        this.mockMvc.perform(get("/api/meter?yard=1")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("0.91")));
    }

}
