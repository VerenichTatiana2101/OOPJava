package seminar004.ex02;

public class Teachers extends User implements Printable<Teachers>{
    private double rating;
    private String discipline;
    public Teachers(String firstname, String lastname, int id, String discipline, double rating) {
        super(firstname, lastname, id);
        this.rating=rating;
        this.discipline=discipline;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    @Override
    public void print() {
        System.out.println(super.toString()+" rating="+rating+", discipline="+discipline);
    }
}
