/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.gia.servicioevaluacion.web.dto;


import co.edu.utp.isc.gia.servicioevaluacion.web.dto.Question.MultiQuestionDTO;
import co.edu.utp.isc.gia.servicioevaluacion.web.dto.Question.OpenQuestionDTO;
import co.edu.utp.isc.gia.servicioevaluacion.web.dto.Question.UniQuestionDTO;
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
public class TestDTO implements Serializable {
    
    private Long id;
    private String testName;
    private Double maxScore;
    private List<UniQuestionDTO> uniQuestion;
    private List<MultiQuestionDTO> multiQuestion;
    private List<OpenQuestionDTO> openQuestion;
    private List<SolutionDTO> solution;
}
