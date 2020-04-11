/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.gia.servicioevaluacion.data.entity;

import co.edu.utp.isc.gia.servicioevaluacion.data.entity.Answer.UniAnswer;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "SOLUTION")
public class Solution implements Serializable {

    @Id
    private Long id;
    private String studentName;
    private String studentId;
    @OneToMany
    private List<UniAnswer> answers;
    
    
}
