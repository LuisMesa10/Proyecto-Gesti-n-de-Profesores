package proyecto_profesores;

public class Profesor {

    private String Cedula;
    private String Nombre;
    private String Genero;
    private String Facultad;
    private String Titulo;
    private String CantAsign;
    private String CantHoras;
    private String FechaNac;
    private String TipoContrato;

    public Profesor(String Cedula, String Nombre, String Genero, String Facultad, String Titulo, String CantAsign, String CantHoras, String FechaNac, String TipoContrato) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Genero = Genero;
        this.Facultad = Facultad;
        this.Titulo = Titulo;
        this.CantAsign = CantAsign;
        this.CantHoras = CantHoras;
        this.FechaNac = FechaNac;
        this.TipoContrato = TipoContrato;
    }

    public Profesor() {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Genero = Genero;
        this.Facultad = Facultad;
        this.Titulo = Titulo;
        this.CantAsign = CantAsign;
        this.CantHoras = CantHoras;
        this.FechaNac = FechaNac;
        this.TipoContrato = TipoContrato;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getFacultad() {
        return Facultad;
    }

    public void setFacultad(String Facultad) {
        this.Facultad = Facultad;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getCantAsign() {
        return CantAsign;
    }

    public void setCantAsign(String CantAsign) {
        this.CantAsign = CantAsign;
    }

    public String getCantHoras() {
        return CantHoras;
    }

    public void setCantHoras(String CantHoras) {
        this.CantHoras = CantHoras;
    }

    public String getFechaNac() {
        return FechaNac;
    }

    public void setFechaNac(String FechaNac) {
        this.FechaNac = FechaNac;
    }

    public String getTipoContrato() {
        return TipoContrato;
    }

    public void setTipoContrato(String TipoContrato) {
        this.TipoContrato = TipoContrato;
    }
    
@Override
public String toString() {
    return "Cédula: " + Cedula + ", Nombre: " + Nombre + ", Tipo de contrato: " + TipoContrato; // Suponiendo que cedula y nombre son atributos de la clase Profesor
}

}
