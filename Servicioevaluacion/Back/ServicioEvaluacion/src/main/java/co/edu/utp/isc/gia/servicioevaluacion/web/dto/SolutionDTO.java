/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.gia.servicioevaluacion.web.dto;

import co.edu.utp.isc.gia.servicioevaluacion.data.entity.Answer.MultiAnswer;
import co.edu.utp.isc.gia.servicioevaluacion.data.entity.Answer.OpenAnswer;
import co.edu.utp.isc.gia.servicioevaluacion.data.entity.Answer.UniAnswer;
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
    private List<UniAnswer> uniAnswers;
    private List<MultiAnswer> multiAnswers;
    private List<OpenAnswer> openAnswers;
    
    
}
