package kr.ac.inha.board.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// Ctrl + shift + o : import 정리

@RestController
public class BoardController {
	// main 안 씀(실행 흐름을 정하지 않음)
	// spring에서는 new 하지 않음
	@RequestMapping("/hello") // 호출되는 위치
	public String hello() {
		return "hello world!";
	}

	@RequestMapping("/inha") // 요청받기
	public String inha(String str) {
		return str + "inha.ac.kr";
	}

	@RequestMapping("/name")
	public String name(String id) {
		return "학번: " + id;
	}
	
	@RequestMapping("/mul")
	public String mul(int num) {
		return num + "*1=" + num*1 + " " + 
				num + "*2=" + num*2 + " " + 
				num + "*3=" + num*3 + " " + 
				num + "*4=" + num*4 + " " + 
				num + "*5=" + num*5 + " " + 
				num + "*6=" + num*6 + " " + 
				num + "*7=" + num*7 + " " + 
				num + "*8=" + num*8 + " " + 
				num + "*9=" + num*9 + " " ;
	}

}
