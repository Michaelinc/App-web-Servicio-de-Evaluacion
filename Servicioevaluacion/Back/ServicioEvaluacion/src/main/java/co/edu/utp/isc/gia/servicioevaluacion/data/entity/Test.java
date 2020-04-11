/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.gia.servicioevaluacion.data.entity;

import co.edu.utp.isc.gia.servicioevaluacion.data.entity.Question.MultiQuestion;
import co.edu.utp.isc.gia.servicioevaluacion.data.entity.Question.OpenQuestion;
import co.edu.utp.isc.gia.servicioevaluacion.data.entity.Question.UniQuestion;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
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
@Entity
@Table(name = "TEST")
public class Test implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String testName;
    private Double maxScore;
    @OneToMany(cascade = CascadeType.ALL)
    private List<UniQuestion> uniQuestion;
    @OneToMany
    private List<MultiQuestion> multiQuestion;
    @OneToMany
    private List<OpenQuestion> openQuestion;
    @OneToMany
    private List<Solution> solution;
}
