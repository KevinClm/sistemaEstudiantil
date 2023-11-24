public class Estudiantes {
    //Atributos
    public String nombre;
    public String apellido;
    public String materia;
    public double nota1;
    public double nota2;

    //Constructor

    public Estudiantes(String nombre, String apellido, String materia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.materia = materia;
    }

    //Getteres

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getMateria() {
        return materia;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }
    //Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
}
