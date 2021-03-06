package tn.utm.isi.imd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Role {
	
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

    @Column
    private String description;


}
