package com.kasun.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by kasunk on 12/27/16.
 */
@Entity
public class TourPackage implements Serializable {

    @Id
    private String code;

    @Column
    private String name;

    public TourPackage(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {

        return "TourPackage {" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        TourPackage that = (TourPackage) o;

        if (!code.equals(that.code))
            return false;
        if (!name.equals(that.name))
            return false;

        return true;
    }

    @Override
    public int hashCode() {

        int result = code.hashCode();
        result = 31 * result + name.hashCode();
        return result;
    }
}
