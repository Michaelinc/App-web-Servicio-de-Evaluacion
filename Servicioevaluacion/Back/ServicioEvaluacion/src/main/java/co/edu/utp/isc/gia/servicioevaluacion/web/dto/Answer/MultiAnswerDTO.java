/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.gia.servicioevaluacion.web.dto.Answer;

import co.edu.utp.isc.gia.servicioevaluacion.web.dto.ChoiceDTO;
import java.io.Serializable;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 *
 * @author Michael
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
public class MultiAnswerDTO extends AnswerTypeDTO implements Serializable{

    private Long id;
    private List<ChoiceDTO> chosenAnswer;
}
