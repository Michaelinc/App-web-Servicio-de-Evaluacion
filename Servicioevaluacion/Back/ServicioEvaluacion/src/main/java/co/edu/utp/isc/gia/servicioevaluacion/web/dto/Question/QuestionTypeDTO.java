/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.gia.servicioevaluacion.web.dto.Question;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Michael
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class QuestionTypeDTO {
    
    private String description;
    private String image;
    private Double score;
}
