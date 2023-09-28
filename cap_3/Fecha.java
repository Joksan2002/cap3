public class Fecha {
    
    private int año;
    private int mes;
    private int dia;

    public Fecha(int año, int mes, int dia){
        this.año = año;
        this.mes = mes;
        this.dia = dia;
    }

    public void establecerAño(int nuevoAño){

        if(nuevoAño >= 2000){
            año = año + nuevoAño;
        }

    }

    public int obtenerAño(){
        return año;
    }

    public void establecerMes(int nuevoMes){

        if(nuevoMes <= 12){
            mes = mes + nuevoMes;
        }

    }

    public int obtenerMes(){
        return mes;
    }

    public void establecerDia(int nuevoDia){
        
        if(nuevoDia <= 31){
            dia = dia + nuevoDia;
        }
    }

    public int obtenerDia(){
        return dia;
    }

}
