
@Entities
@Table(name=tb_employee)
public class Employee{
    @id
    @GeneratedValue(strategy=Generation.IDENTIFY)
    private Long id;
    private String name;
    private String email;
    
    @ManyToOne
    @JoinColumn(name="sector_id")
    private Sector sector;

    public Employee(){}

    public void setId(Long id){
        this.id=id;
    }
    public Long getId(){
        return this.id;
    }
     public void setName(String name){
        this.name=name;
     }

     public String getName(){
        return this.name;
     }

     public void setEmail(String email){
        this.email=email;
     }
     public String getEmail(){
        return this.email;
     }
}