package models;

import play.db.jpa.Model;

import javax.persistence.Entity;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

import java.util.List;
import java.util.ArrayList;

@Entity
public class Station extends Model
{
    public String name;
    @OneToMany(cascade = CascadeType.ALL)
    public List<Reading> readings = new ArrayList<Reading>();


    public Station(String name)
    {
        this.name = name;
    }
}
