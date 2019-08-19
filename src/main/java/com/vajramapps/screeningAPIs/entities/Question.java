/**
 * 
 */
package com.vajramapps.screeningAPIs.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author smadasu
 *
 */
@Getter @Setter @NoArgsConstructor @ToString
@Entity
public class Question {
	
	@Id
	Integer id;
	String questionText;
	String answer;
}
