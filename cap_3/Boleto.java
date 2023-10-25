import java.time.LocalDate;
import java.time.LocalTime;

public class Boleto{
    private String ide;
    private LocalDate fecha = LocalDate.now();
    private LocalTime hora = LocalTime.now();

    public Boleto(String ide){
        this.ide = ide;
    }
    public void setIde(String ide){
        this.ide = ide;
    }
    public String getIde(){
        return ide;
    } 
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public LocalDate getFecha(){
        return fecha;
    }
    public void setHora(LocalTime hora){
        this.hora = hora;
    } 
    public LocalTime getHora(){
        return hora;
    }
}