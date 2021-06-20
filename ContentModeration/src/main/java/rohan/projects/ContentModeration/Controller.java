package rohan.projects.ContentModeration;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import db.Operations;

@RestController
public class Controller {
	
	@PostMapping(value="/login", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> welcome(Model model, String email, String password)
	{
		Operations op = new Operations();
		ResponseEntity<String> response;
		response = op.authenticateUser(email, password);
		return response;
	}
}
	