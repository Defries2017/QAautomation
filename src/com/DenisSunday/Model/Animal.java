package com.DenisSunday.Model;

import com.DenisSunday.Model.hordate.Hordate;
import com.DenisSunday.Model.vertebrates.Vertebrates;

public class Animal {

    public Vertebrates vertebrates;

    public Hordate hordate;

    public Animal(Vertebrates vertebrates) {
        this.vertebrates = vertebrates;
    }

    public Animal() {
    }

    public Animal(Vertebrates vertebrates, Hordate hordate) {
        this.vertebrates = vertebrates;
        this.hordate = hordate;
    }
}
