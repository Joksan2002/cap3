public class Estudiante {
  
    private String cuenta;
    private String nombre;
    private String materia;
    private int calif;

    public Estudiante(String cuenta, String nombre, String materia, int calif) {
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.materia = materia;
        this.calif = calif;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setCuenta(String cuenta){
        this.cuenta = cuenta;
    }

    public String getCuenta(){
        return cuenta;
    }

    public void setMatricular(String materia) {
        this.materia = materia;
    }

    public String getMatricular(){
        return materia;
    }

    public void setcalif(int calif) {
        this.calif = calif;
    }

    public int getCalif(){
        return calif;
    }

    public void setObservacion(int calif){
        this.calif = calif;
    }

    public String getObservacion() {
       
        if (calif >= 65) {
            return "Aprobado";
        } else {
            return "Reprobado";
        }

    } 
}
