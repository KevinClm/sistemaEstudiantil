public class Materias {
    //Atributos
    public String name;
    public double notaBimestre1;
    public double notaBimestre2;

    //Costructor

    public Materias(String name) {
        this.name = name;
    }
    //Getters

    public String getName() {
        return name;
    }

    public double getNotaBimestre1() {
        return notaBimestre1;
    }

    public double getNotaBimestre2() {
        return notaBimestre2;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setNotaBimestre1(double notaBimestre1) {
        this.notaBimestre1 = notaBimestre1;
    }

    public void setNotaBimestre2(double notaBimestre2) {
        this.notaBimestre2 = notaBimestre2;
    }
}
