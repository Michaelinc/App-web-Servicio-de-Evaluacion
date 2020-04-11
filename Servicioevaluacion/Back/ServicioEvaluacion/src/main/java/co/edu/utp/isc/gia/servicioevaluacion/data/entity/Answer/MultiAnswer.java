/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.gia.servicioevaluacion.data.entity.Answer;

import co.edu.utp.isc.gia.servicioevaluacion.data.entity.Option;
import co.edu.utp.isc.gia.servicioevaluacion.data.entity.Solution;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
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
@Table(name = "MULTIANSWER")
@EqualsAndHashCode(callSuper = false)
public class MultiAnswer extends AnswerType implements Serializable{

    @Id
    private Long id;
    @OneToOne
    private List<Option> chosenAnswers;
    @ManyToOne
    private Solution solution;
}
