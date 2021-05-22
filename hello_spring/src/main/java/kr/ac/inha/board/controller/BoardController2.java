package kr.ac.inha.board.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class BoardController2 {
	@RequestMapping("/hello2") // 중복되면 실행 안 됨
	public String hello() {	// 메서드명은 상관없음
		return "hello world!";
	}

}
