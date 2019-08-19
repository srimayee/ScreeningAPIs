/**
 * 
 */
package com.vajramapps.screeningAPIs.repositories;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.support.Repositories;
import org.springframework.stereotype.Repository;

import com.vajramapps.screeningAPIs.entities.Question;

/**
 * @author smadasu
 *
 */
@Repository
public abstract class QuestionRepository implements CrudRepository<Question, Integer> {

	

	

}
