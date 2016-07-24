/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijalmasilva.core.repository;

import dijalmasilva.entidades.ExemploEntidade;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Marcelo Augusto
 */
@Repository
public interface ExemploRepository extends CrudRepository<ExemploEntidade, Long>{

    
}
