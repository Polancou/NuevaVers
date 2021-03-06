package sys.model;
// Generated 14/10/2017 07:17:00 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * MenuTratamientos generated by hbm2java
 */
public class MenuTratamientos  implements java.io.Serializable {


     private Integer contador;
     private AreaTratamientos areaTratamientos;
     private String nameTratamiento;
   
     private Set<BitacoraRecibos> bitacoraReciboses = new HashSet<BitacoraRecibos>(0);

    public MenuTratamientos() {
        areaTratamientos = new AreaTratamientos();
      
    }

	
    public MenuTratamientos(AreaTratamientos areaTratamientos, String nameTratamiento) {
        this.areaTratamientos = areaTratamientos;
        this.nameTratamiento = nameTratamiento;
    }
    public MenuTratamientos(AreaTratamientos areaTratamientos, String nameTratamiento, Set<BitacoraRecibos> bitacoraReciboses) {
       this.areaTratamientos = areaTratamientos;
       this.nameTratamiento = nameTratamiento;
       this.bitacoraReciboses = bitacoraReciboses;
    }
   
    public Integer getContador() {
        return this.contador;
    }
    
    public void setContador(Integer contador) {
        this.contador = contador;
    }
    public AreaTratamientos getAreaTratamientos() {
        return this.areaTratamientos;
    }
    
    public void setAreaTratamientos(AreaTratamientos areaTratamientos) {
        this.areaTratamientos = areaTratamientos;
    }
    public String getNameTratamiento() {
        return this.nameTratamiento;
    }
    
    public void setNameTratamiento(String nameTratamiento) {
        this.nameTratamiento = nameTratamiento;
    }

    public Set<BitacoraRecibos> getBitacoraReciboses() {
        return this.bitacoraReciboses;
    }
    
    public void setBitacoraReciboses(Set<BitacoraRecibos> bitacoraReciboses) {
        this.bitacoraReciboses = bitacoraReciboses;
    }




}


