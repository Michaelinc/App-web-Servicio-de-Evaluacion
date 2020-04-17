/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.gia.servicioevaluacion.web.dto;

import co.edu.utp.isc.gia.servicioevaluacion.web.dto.Answer.OpenAnswerDTO;
import co.edu.utp.isc.gia.servicioevaluacion.web.dto.Answer.MultiAnswerDTO;
import co.edu.utp.isc.gia.servicioevaluacion.web.dto.Answer.UniAnswerDTO;
import java.io.Serializable;
import java.util.List;
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
public class SolutionDTO implements Serializable {

    private Long id;
    private String studentName;
    private String studentId;
    private List<UniAnswerDTO> uniAnswers;
    private List<MultiAnswerDTO> multiAnswers;
    private List<OpenAnswerDTO> openAnswers;  
}
