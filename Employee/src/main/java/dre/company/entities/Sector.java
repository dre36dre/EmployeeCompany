package dre.company.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_sector")
public class Sector{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;

    
    public Sector(){}

    public void setId(Long id){
        this.id=id;
    }
    public Long getId(){
        return this.id;
    }

    public void setName(String name){
        this.name=name;
    }
} 