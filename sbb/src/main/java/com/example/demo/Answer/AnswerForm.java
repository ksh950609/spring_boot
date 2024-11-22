package com.example.demo.Answer;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

public class AnswerForm {
	@Getter
	@Setter
    @NotEmpty(message="내용은 필수항목입니다.")
    private String content;
}

