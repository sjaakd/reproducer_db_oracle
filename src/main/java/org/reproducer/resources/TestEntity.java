package org.reproducer.resources;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class TestEntity implements Serializable {

    private static final long serialVersionUID = -8418034381386038166L;

    @Id
    private String key;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
