/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cahyo.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


/**
 *
 * @author Cahyo
 */
@Entity
public class Mahasiswa {
    @Id
    @Getter @Setter
    public String nim;
    @Getter @Setter
    public String nama;
    @Getter @Setter
    public String jurusan;    
    
    
}
