/**
 * 
 */
package com.vajramapps.screeningAPIs.controllers;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vajramapps.screeningAPIs.entities.Question;
import com.vajramapps.screeningAPIs.repositories.QuestionRepository;

/**
 * @author smadasu
 *
 */
@RestController
public class QuestionController {

	@Autowired
	QuestionRepository repo;
	
	@PostMapping("/saveQuestion")
	public void saveQuestion(Question q) {
		repo.save(q);
	}
}
