/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.gia.servicioevaluacion.data.entity.Question;

import co.edu.utp.isc.gia.servicioevaluacion.data.entity.Choice;
import co.edu.utp.isc.gia.servicioevaluacion.data.entity.Test;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
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
@Data
@Entity
@Table(name = "MULTIQUESTION")
@EqualsAndHashCode(callSuper = false)
public class MultiQuestion extends QuestionType implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Choice> Choice;
    @OneToMany
    private List<Choice> correctAnswer;
    @ManyToOne
    private Test test;
    
}
