package saultcollege.marygraceviaje_csd226_test2;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Data {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private int dataKey;

    public Data() {
    }

    public Data(String name, int dataKey) {
        this.name = name;
        this.dataKey = dataKey;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDataKey() {
        return dataKey;
    }

    public void setDataKey(int dataKey) {
        this.dataKey = dataKey;
    }
}

