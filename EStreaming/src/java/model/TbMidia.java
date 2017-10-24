package model;
// Generated 21/10/2017 10:26:18 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TbMidia generated by hbm2java
 */
@Entity
@Table(name="tb_midia"
    ,catalog="estreaming"
)
public class TbMidia  implements java.io.Serializable {


     private int idtMidia;
     private TbTipoMidia tbTipoMidia;
     private String txtCaminho;
     private boolean stsMidia;
     private Date dtaInsercao;
     private Set<TaAssuntoMidia> taAssuntoMidias = new HashSet<TaAssuntoMidia>(0);

    public TbMidia() {
    }

	
    public TbMidia(int idtMidia, TbTipoMidia tbTipoMidia, String txtCaminho, boolean stsMidia, Date dtaInsercao) {
        this.idtMidia = idtMidia;
        this.tbTipoMidia = tbTipoMidia;
        this.txtCaminho = txtCaminho;
        this.stsMidia = stsMidia;
        this.dtaInsercao = dtaInsercao;
    }
    public TbMidia(int idtMidia, TbTipoMidia tbTipoMidia, String txtCaminho, boolean stsMidia, Date dtaInsercao, Set<TaAssuntoMidia> taAssuntoMidias) {
       this.idtMidia = idtMidia;
       this.tbTipoMidia = tbTipoMidia;
       this.txtCaminho = txtCaminho;
       this.stsMidia = stsMidia;
       this.dtaInsercao = dtaInsercao;
       this.taAssuntoMidias = taAssuntoMidias;
    }
   
     @Id 

    
    @Column(name="idt_midia", unique=true, nullable=false)
    public int getIdtMidia() {
        return this.idtMidia;
    }
    
    public void setIdtMidia(int idtMidia) {
        this.idtMidia = idtMidia;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="cod_tipo_midia", nullable=false)
    public TbTipoMidia getTbTipoMidia() {
        return this.tbTipoMidia;
    }
    
    public void setTbTipoMidia(TbTipoMidia tbTipoMidia) {
        this.tbTipoMidia = tbTipoMidia;
    }

    
    @Column(name="txt_caminho", nullable=false, length=65535)
    public String getTxtCaminho() {
        return this.txtCaminho;
    }
    
    public void setTxtCaminho(String txtCaminho) {
        this.txtCaminho = txtCaminho;
    }

    
    @Column(name="sts_midia", nullable=false)
    public boolean isStsMidia() {
        return this.stsMidia;
    }
    
    public void setStsMidia(boolean stsMidia) {
        this.stsMidia = stsMidia;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="dta_insercao", nullable=false, length=19)
    public Date getDtaInsercao() {
        return this.dtaInsercao;
    }
    
    public void setDtaInsercao(Date dtaInsercao) {
        this.dtaInsercao = dtaInsercao;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tbMidia")
    public Set<TaAssuntoMidia> getTaAssuntoMidias() {
        return this.taAssuntoMidias;
    }
    
    public void setTaAssuntoMidias(Set<TaAssuntoMidia> taAssuntoMidias) {
        this.taAssuntoMidias = taAssuntoMidias;
    }




}

