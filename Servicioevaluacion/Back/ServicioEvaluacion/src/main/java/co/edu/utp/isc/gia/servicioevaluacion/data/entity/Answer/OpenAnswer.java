/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.gia.servicioevaluacion.data.entity.Answer;

import co.edu.utp.isc.gia.servicioevaluacion.data.entity.Question.QuestionType;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
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
@Entity
@Data
@Table(name = "OPENANSWER")
@EqualsAndHashCode(callSuper = false)
public class OpenAnswer extends AnswerType implements Serializable{

    @Id
    private Long id;
    private String answer;
}
