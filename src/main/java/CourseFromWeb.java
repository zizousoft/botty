import java.util.Objects;

public class CourseFromWeb {
    private int eurDzd;

    public CourseFromWeb() {
    }

    public Integer getEurDzd() {
        return eurDzd;
    }

    public void setEurDzd(Integer eurDzd) {
        this.eurDzd = eurDzd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CourseFromWeb that = (CourseFromWeb) o;
        return Objects.equals(eurDzd, that.eurDzd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eurDzd);
    }

    @Override
    public String toString() {
        return "courseFromWeb{" +
                "eurDzd='" + eurDzd + '\'' +
                '}';
    }
}
