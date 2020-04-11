/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.gia.servicioevaluacion.data.entity.Answer;

import co.edu.utp.isc.gia.servicioevaluacion.data.entity.Choice;
import co.edu.utp.isc.gia.servicioevaluacion.data.entity.Solution;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany
    private List<Choice> chosenAnswer;
    @ManyToOne
    private Solution solution;
}
