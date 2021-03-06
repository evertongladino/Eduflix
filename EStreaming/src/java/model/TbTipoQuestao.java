package model;
// Generated 21/10/2017 10:26:18 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TbTipoQuestao generated by hbm2java
 */
@Entity
@Table(name="tb_tipo_questao"
    ,catalog="estreaming"
)
public class TbTipoQuestao  implements java.io.Serializable {


     private Integer idtTipoQuestao;
     private String nmeTipoQuestao;
     private Set<TbVF> tbVFs = new HashSet<TbVF>(0);
     private Set<TbCompletar> tbCompletars = new HashSet<TbCompletar>(0);
     private Set<TbSomatorio> tbSomatorios = new HashSet<TbSomatorio>(0);
     private Set<TbMultEscolha> tbMultEscolhas = new HashSet<TbMultEscolha>(0);

    public TbTipoQuestao() {
    }

	
    public TbTipoQuestao(String nmeTipoQuestao) {
        this.nmeTipoQuestao = nmeTipoQuestao;
    }
    public TbTipoQuestao(String nmeTipoQuestao, Set<TbVF> tbVFs, Set<TbCompletar> tbCompletars, Set<TbSomatorio> tbSomatorios, Set<TbMultEscolha> tbMultEscolhas) {
       this.nmeTipoQuestao = nmeTipoQuestao;
       this.tbVFs = tbVFs;
       this.tbCompletars = tbCompletars;
       this.tbSomatorios = tbSomatorios;
       this.tbMultEscolhas = tbMultEscolhas;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idt_tipo_questao", unique=true, nullable=false)
    public Integer getIdtTipoQuestao() {
        return this.idtTipoQuestao;
    }
    
    public void setIdtTipoQuestao(Integer idtTipoQuestao) {
        this.idtTipoQuestao = idtTipoQuestao;
    }

    
    @Column(name="nme_tipo_questao", nullable=false, length=100)
    public String getNmeTipoQuestao() {
        return this.nmeTipoQuestao;
    }
    
    public void setNmeTipoQuestao(String nmeTipoQuestao) {
        this.nmeTipoQuestao = nmeTipoQuestao;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tbTipoQuestao")
    public Set<TbVF> getTbVFs() {
        return this.tbVFs;
    }
    
    public void setTbVFs(Set<TbVF> tbVFs) {
        this.tbVFs = tbVFs;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tbTipoQuestao")
    public Set<TbCompletar> getTbCompletars() {
        return this.tbCompletars;
    }
    
    public void setTbCompletars(Set<TbCompletar> tbCompletars) {
        this.tbCompletars = tbCompletars;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tbTipoQuestao")
    public Set<TbSomatorio> getTbSomatorios() {
        return this.tbSomatorios;
    }
    
    public void setTbSomatorios(Set<TbSomatorio> tbSomatorios) {
        this.tbSomatorios = tbSomatorios;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tbTipoQuestao")
    public Set<TbMultEscolha> getTbMultEscolhas() {
        return this.tbMultEscolhas;
    }
    
    public void setTbMultEscolhas(Set<TbMultEscolha> tbMultEscolhas) {
        this.tbMultEscolhas = tbMultEscolhas;
    }




}


