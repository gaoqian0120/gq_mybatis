package entity;

import lombok.Data;

@Data
public class Student {
    private String sno;
    private String sname;
    private Integer sage;
    private String ssex;

    @Override
    public String toString() {
        return "Student{" +
                "sno='" + sno + '\'' +
                ", sname='" + sname + '\'' +
                ", sage=" + sage +
                ", ssex='" + ssex + '\'' +
                '}';
    }
}
