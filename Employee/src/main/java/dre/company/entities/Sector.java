@Entities
@Table(name="tb_sector")
public class Sector{

    @id
    #GeneratedValue(strategy=GenerationType.IDENTIFY)
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