package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.question.QuestionRepository;
import com.example.demo.question.QuestionService;

@SpringBootTest
class SbbApplicationTests {

//	@Autowired
//	private QuestionRepository questionRepository;
	@Autowired
	private QuestionService questionService;

	@Test
	void testJpa() {
		for (int i = 1; i <= 300; i++) {
			String subject = String.format("테스트 데이터입니다:[%03d]", i);
			String content = "내용무";
			this.questionService.create(subject, content,null);
			
			
		}
	}
}
