/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijalmasilva.core.service;

import java.util.Date;
import javax.inject.Inject;
import javax.inject.Named;
import dijalmasilva.core.repository.ExemploRepository;

/**
 *
 * @author Marcelo Augusto
 */
@Named
public class ExemploServiceImpl implements ExemploService {

    @Inject
    private ExemploRepository daoCampeonato;
    
    @Override
    public Date coverterData(String data) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
