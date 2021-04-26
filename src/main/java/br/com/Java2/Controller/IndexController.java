package br.com.Java2.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ping")
public class IndexController {

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public String ping() {

		String text = "Gloria a Deus!!!";
		System.out.println(text);
		return text;

	}

}
